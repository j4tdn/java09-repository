package allocation;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WhAllocatedAmountManager {

	/**
	 * BigDecimal a = BigDecimal.valueOf(10); BigDecimal b = BigDecimal.valueOf(20);
	 * BigDecimal mul = a.multiply(b); BigDecimal div = a.divide(b); BigDecimal add
	 * = a.add(b); BigDecimal sub = a.subtract(b);
	 * 
	 * Rounding a.setScale(10, RoundingMode.HALF_UP);
	 */

	public static void main(String[] args) {
		final Integer allocationAmount = 300;
		final List<Store> data = getItems();
		List<Store> step1 = calculateExpectedSales(data);
		Map<Long, BigDecimal> step2 = calculateAllocationKey(step1);
		Map<Long, BigDecimal> result = doAllocation(step1, step2, allocationAmount);

		result.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

	}

	private static List<Store> getItems() {
		return Arrays.asList(new Store(1L, null, bd(18), bd(40), Boolean.TRUE),
				new Store(2L, null, bd(19), bd(20), Boolean.TRUE), new Store(3L, null, bd(21), bd(17), Boolean.TRUE),
				new Store(4L, null, bd(14), bd(31), Boolean.TRUE), new Store(5L, null, bd(14), bd(10), Boolean.TRUE),
				new Store(6L, null, bd(15), bd(30), Boolean.TRUE), new Store(7L, 2L, bd(15), null, Boolean.TRUE),
				new Store(8L, null, bd(12), bd(19), Boolean.TRUE), new Store(9L, null, bd(17), bd(26), Boolean.TRUE),
				new Store(10L, 7L, bd(18), null, Boolean.TRUE), new Store(11L, null, bd(22), null, Boolean.FALSE));
	}

	private static BigDecimal bd(long value) {
		return BigDecimal.valueOf(value);
	}

	/**
	 * Do Allocation.
	 * 
	 * Key: storeId with Long type Value: storeAllocatedAmount after calculation
	 * with 4 steps
	 * 
	 * @return map of storeId, storeAllocatedAmount
	 */

	// step 1
	public static List<Store> calculateExpectedSales(List<Store> data) {
		List<Store> storeSelected = data.stream().filter(store -> store.getSelected()).collect(Collectors.toList());
		System.out.println(storeSelected.hashCode());
		List<Store> storeSelectedClone = new ArrayList<>(storeSelected);
		System.out.println(storeSelectedClone.hashCode());
		Map<Long, Store> map = storeSelectedClone.stream()
				.collect(Collectors.toMap(Store::getStoreId, Function.identity(), (s1, s2) -> s1, LinkedHashMap::new));

		List<Store> temp = storeSelected.stream().filter(s -> s.getExpectedSales() != null)
				.collect(Collectors.toList());
		Optional<BigDecimal> sumAllExpectedSaleNotNull = temp.stream().map(Store::getExpectedSales)
				.reduce((a, b) -> a.add(b));

		BigDecimal averageOfExpectedSale = sumAllExpectedSaleNotNull.get().divide(bd(temp.size()), 1,
				RoundingMode.HALF_UP);

		List<Store> result = storeSelected.stream().peek(s -> {

			if (s.getExpectedSales() == null) {
				if (s.getReferenceStoreId() != null) {
					Store referenceStore = map.get(s.getReferenceStoreId());
					if (referenceStore.getExpectedSales() != null) {
						s.setExpectedSales(referenceStore.getExpectedSales());
					} else {
						s.setExpectedSales(averageOfExpectedSale);
					}
				} else {
					System.out.println(
							"Expected sales cannot be calculated. Please add a reference store or include stores with expected sales for interpolation");
					return;
				}
			}
		}).collect(Collectors.toList());
		return result;
	}

	private static Map<Long, BigDecimal> calculateAllocationKey(List<Store> storeSelectedAfterStep1) {
		// step 2
		BigDecimal sumExpectedSale = storeSelectedAfterStep1.stream().map(Store::getExpectedSales).reduce(bd(0),
				(a, b) -> a.add(b));

		Map<Long, BigDecimal> result = storeSelectedAfterStep1.stream()
				.collect(Collectors.toMap(Store::getStoreId, s -> {
					BigDecimal allocationKey = s.getExpectedSales().divide(sumExpectedSale, 5, RoundingMode.HALF_UP);
					return allocationKey;
				}, (s1, s2) -> s1, LinkedHashMap::new));
		return result;
	}

	private static Map<Long, BigDecimal> doAllocation(List<Store> storeSelectedAfterStep1,
			Map<Long, BigDecimal> allocationKeys, Integer allocationAmount) {

		BigDecimal sumStock = storeSelectedAfterStep1.stream().map(Store::getStorePreviousDay).reduce(bd(0),
				(s1, s2) -> s1.add(s2));

		Map<Long, BigDecimal> amountAllocateds = storeSelectedAfterStep1.stream()
				.collect(Collectors.toMap(Store::getStoreId, s -> {
					BigDecimal amountAllocated = allocationKeys.get(s.getStoreId())
							.multiply(bd(allocationAmount).add(sumStock)).subtract(s.getStorePreviousDay())
							.setScale(0, RoundingMode.HALF_UP);

					if (amountAllocated.compareTo(bd(0)) < 0) {
						amountAllocated = bd(0);
					}
					return amountAllocated;
				}, (s1, s2) -> s1, LinkedHashMap::new));

		// step 4
		BigDecimal sumAmountAllocated = amountAllocateds.entrySet().stream().map(Entry::getValue).reduce(bd(0),
				(entry1, entry2) -> entry1.add(entry2));
		Integer sumAmountAllocatedInt = sumAmountAllocated.intValue();
		if (sumAmountAllocatedInt != allocationAmount) {
			Map<Long, Integer> demand = storeSelectedAfterStep1.stream()
					.collect(Collectors.toMap(Store::getStoreId, store -> {
						Integer expectedSale = store.getExpectedSales().intValue();
						Integer storePreDay = store.getStorePreviousDay().intValue();
						Integer storeDemand = expectedSale - storePreDay;
						return (storeDemand) > 0 ? storeDemand : 0;
					}, (s1, s2) -> s1, LinkedHashMap::new));

			while (!sumAmountAllocatedInt.equals(allocationAmount)) {
				if (sumAmountAllocatedInt > allocationAmount) {
					// Map<Long, Integer> diffAmountAndDemand = new HashMap<Long, Integer>();
					// chua xu li
				} else if (sumAmountAllocatedInt < allocationAmount) {
					// chua xu li
				}
			}
		}

		return amountAllocateds;
	}

}