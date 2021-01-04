package allocation;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class WhAllocatedAmountManager {
	private static List<Store> selectedStore;

	public static void main(String[] args) {
		final Integer allocationAmount = 300;
		final List<Store> data = getItems();
		selectedStore = data.stream().filter(s -> s.getSelected()).collect(Collectors.toList());

		Map<Long, Store> step1 = calculateExpectedSales(data);
		step1.entrySet().forEach(t -> System.out.println(t));

		Map<Long, BigDecimal> step2 = calculateAllocationKey(step1);
		step2.entrySet().forEach(t -> System.out.println(t));
		step1.entrySet().forEach(t -> System.out.println(t));
		Map<Long, BigDecimal> step3 = calculateAmountAllocated(step1, step2, allocationAmount);
		step3.entrySet().forEach(t -> System.out.println(t));

		Map<Long, BigDecimal> demand = getFinalAmountAllocated(step3, step1, allocationAmount);
		demand.entrySet().forEach(t -> System.out.println(t));

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

	// step 1

	public static Map<Long, Store> calculateExpectedSales(List<Store> data) {
		Map<Long, Store> map = selectedStore.stream()
				.collect(Collectors.toMap(Store::getStoreId, Function.identity(), (s1, s2) -> s1, LinkedHashMap::new));
		System.out.println(map.hashCode());

		List<Store> notNullExpectedSalesStores = selectedStore.stream().filter(s -> s.getExpectedSales() != null)
				.collect(Collectors.toList());
		Optional<BigDecimal> sumAllExpectedSaleNotNull = notNullExpectedSalesStores.stream()
				.map(Store::getExpectedSales).reduce((a, b) -> a.add(b));

		BigDecimal averageOfExpectedSale = sumAllExpectedSaleNotNull.get().divide(bd(notNullExpectedSalesStores.size()),
				1, RoundingMode.HALF_UP);
		List<Long> idUpdatedStores = new ArrayList<>();
		Map<Long, Store> result = selectedStore.stream().peek(s -> {
			if (s.getExpectedSales() == null) {
				if (s.getReferenceStoreId() != null) {
					Store referenceStore = map.get(s.getReferenceStoreId());
					if (referenceStore.getExpectedSales() != null
							&& !idUpdatedStores.contains(referenceStore.getStoreId())) {
						s.setExpectedSales(referenceStore.getExpectedSales());
						idUpdatedStores.add(s.getStoreId());
					} else {
						s.setExpectedSales(averageOfExpectedSale);
					}
				} else {
					System.out.println(
							"Expected sales cannot be calculated. Please add a reference store or include stores with expected sales for interpolation");
					return;
				}
			}
		}).collect(Collectors.toMap(Store::getStoreId, Function.identity(), (s1, s2) -> s1, LinkedHashMap::new));
		return result;
	}

	private static Map<Long, BigDecimal> calculateAllocationKey(Map<Long, Store> storeSelectedAfterStep1) {

		BigDecimal sumExpectedSale = storeSelectedAfterStep1.entrySet().stream()
				.map(e -> e.getValue().getExpectedSales()).reduce(bd(0), (a, b) -> a.add(b));
		Map<Long, BigDecimal> result = storeSelectedAfterStep1.entrySet().stream()
				.collect(Collectors.toMap(Entry::getKey, s -> {
					return s.getValue().getExpectedSales().divide(sumExpectedSale, 5, RoundingMode.HALF_UP);
				}, (s1, s2) -> s1, LinkedHashMap::new));
		return result;
	}

	private static Map<Long, BigDecimal> calculateAmountAllocated(Map<Long, Store> storeSelectedAfterStep1,
			Map<Long, BigDecimal> AlloKeyStoreAfterStep2, Integer allocationAmount) {
		BigDecimal sumStockPreDay = storeSelectedAfterStep1.entrySet().stream().map(Entry::getValue)
				.map(Store::getStorePreviousDay).reduce(bd(0), (a, b) -> a.add(b));
		Map<Long, BigDecimal> map = storeSelectedAfterStep1.entrySet().stream()
				.collect(Collectors.toMap(Entry::getKey, entry -> {
					Long key = entry.getKey();
					BigDecimal value = AlloKeyStoreAfterStep2.get(key)
							.multiply(bd(allocationAmount).add(sumStockPreDay))
							.subtract(storeSelectedAfterStep1.get(key).getStorePreviousDay())
							.setScale(0, RoundingMode.HALF_UP);
					return value;
				}, (s1, s2) -> s1, LinkedHashMap::new));
		return map;
	}

	private static Map<Long, BigDecimal> getFinalAmountAllocated(Map<Long, BigDecimal> amountAllocated,
			Map<Long, Store> stores, Integer allocationAmount) {
		stores.entrySet().forEach(t -> System.out.println(t));
		BigDecimal sumAmountAllocated = amountAllocated.entrySet().stream().map(e -> e.getValue()).reduce(bd(0),
				(a, b) -> a.add(b));
		System.out.println(sumAmountAllocated);
		if (!sumAmountAllocated.equals(bd(allocationAmount))) {
			Map<Long, BigDecimal> demand = stores.entrySet().stream().map(Entry::getValue)
					.collect(Collectors.toMap(Store::getStoreId, s -> {
						System.out.println(s.getExpectedSales());
						System.out.println(s.getStorePreviousDay());
						return s.getExpectedSales().subtract(s.getStorePreviousDay()).setScale(0,
								RoundingMode.HALF_DOWN);
					}, (s1, s2) -> s1, LinkedHashMap::new));

			if (sumAmountAllocated.compareTo(bd(allocationAmount)) > 1) {
				// chua xu li
			}
		}
		return amountAllocated;

	}

	private static Map<Long, BigDecimal> adjustedAmountAllocated(Map<Long, BigDecimal> demand, Map<Long, Store> stores,
			boolean status, Map<Long, BigDecimal> amountAllocated) {
		Map<Long, BigDecimal> largestDemandStore = demand.entrySet().stream()
				.sorted(Comparator.comparing(Entry::getValue))
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (s1, s2) -> s1, LinkedHashMap::new));
		if (largestDemandStore.size() == 1) {
			Entry<Long, BigDecimal> largestDemandStoreEn = largestDemandStore.entrySet().stream().findFirst().get();
			if (largestDemandStoreEn.getValue().equals(bd(0))) {
				return amountAllocated;
			}
			Map<Long, BigDecimal> result = amountAllocated.entrySet().stream()
					.collect(Collectors.toMap(Entry::getKey, s -> {
						if (s.getKey().equals(largestDemandStoreEn.getKey())) {
							s.setValue(largestDemandStoreEn.getValue().subtract(bd(1)));
						}
						return s.getValue();
					}, (s1, s2) -> s1, LinkedHashMap::new));

			return result;
		} else if (largestDemandStore.size() > 1) {
			// chua xu li
		}

		return null;

	}

}