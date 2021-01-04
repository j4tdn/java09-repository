package allocation;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.OptionalLong;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WhAllocatedAmountManager {
	private static List<Store> selectedStores;

	/**
	 * BigDecimal a = BigDecimal.valueOf(10); BigDecimal b = BigDecimal.valueOf(20);
	 * BigDecimal mul = a.multiply(b); BigDecimal div = a.divide(b); BigDecimal add
	 * = a.add(b); BigDecimal sub = a.subtract(b);
	 * 
	 * Rounding a.setScale(10, RoundingMode.HALF_UP);
	 * 
	 * @throws Exception
	 */

	public static void main(String[] args) throws Exception {
		final Integer allocationAmount = 300;
		final List<Store> data = getItems();

		Map<Long, Long> result = doAllocation(data, allocationAmount);

		System.out.println("=====Allocated Amount for Selected Stores=====");
		result.entrySet().stream().forEach(
				store -> System.out.println("store: " + store.getKey() + "\t allocated amount: " + store.getValue()));
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
	 * @throws Exception
	 */
	private static Map<Long, Long> doAllocation(List<Store> data, Integer allocationAmount) throws Exception {
		selectedStores = data.stream().filter(store -> store.getSelected()).collect(Collectors.toList());

		// Step 1: filling in missing “Expected Sales” values
		Map<Long, Store> storeMap = data.stream()
				.collect(Collectors.toMap(store -> store.getStoreId(), Function.identity(), (s1, s2) -> s1));
		BigDecimal expectedSaleSum = selectedStores.stream().map(store -> store.getExpectedSales())
				.filter(Objects::nonNull).reduce(new BigDecimal(0), (bd1, bd2) -> bd1.add(bd2));

		long validStoreNumber = selectedStores.stream().filter(store -> store.getExpectedSales() != null).count();

		BigDecimal expectedSaleAverage = expectedSaleSum.divide(new BigDecimal(validStoreNumber)).setScale(1,
				RoundingMode.HALF_UP);

		List<Store> changeAfterStores = new ArrayList<>();

		selectedStores.stream().filter(store -> store.getExpectedSales() == null).forEach(store -> {
			if (store.getReferenceStoreId() == null) {
				store.setExpectedSales(expectedSaleAverage);
			} else {
				if (!storeMap.containsKey(store.getReferenceStoreId())
						|| storeMap.get(store.getReferenceStoreId()).getExpectedSales() == null) {
					store.setExpectedSales(expectedSaleAverage);
				} else {
					changeAfterStores.add(store);
				}
			}
		});

		changeAfterStores
				.forEach(store -> store.setExpectedSales(storeMap.get(store.getReferenceStoreId()).getExpectedSales()));

		// Step 2: Calculation of “Allocation Key”
		Map<Long, BigDecimal> allocationKeyMap = new HashMap<>();

		BigDecimal expectedSaleSum2 = selectedStores.stream().map(store -> store.getExpectedSales())
				.filter(Objects::nonNull).reduce(new BigDecimal(0), (bd1, bd2) -> bd1.add(bd2));
		selectedStores.forEach(store -> {
			allocationKeyMap.put(store.getStoreId(),
					store.getExpectedSales().divide(expectedSaleSum2, 10, RoundingMode.HALF_UP));
		});

		// Step 3: Calculation of “Amount Allocated”
		BigDecimal stockPreviousDaySum = selectedStores.stream().map(store -> store.getStorePreviousDay())
				.filter(Objects::nonNull).reduce(new BigDecimal(0), (bd1, bd2) -> bd1.add(bd2));

		selectedStores.forEach(store -> {
			BigDecimal allocationKey = allocationKeyMap.get(store.getStoreId());
			Long amountAllocated = allocationKey.multiply(stockPreviousDaySum.add(BigDecimal.valueOf(allocationAmount)))
					.subtract(store.getStorePreviousDay()).setScale(0, RoundingMode.HALF_UP).longValue();
			store.setAmountAllocated(amountAllocated);
		});

		// Step 4: Fix Rounding Issues
		fixRoundingIssues(allocationAmount, selectedStores);

		Map<Long, Long> result = selectedStores.stream().collect(
				Collectors.toMap(store -> store.getStoreId(), store -> store.getAmountAllocated(), (s1, s2) -> s1));
		return result;
	}

	private static void fixRoundingIssues(Integer allocationAmount, List<Store> selectedStores) {
		long sumOfAmountAllocated = selectedStores.stream().mapToLong(store -> store.getAmountAllocated()).sum();
		int different = (int) (allocationAmount - sumOfAmountAllocated);
		if (different == 0) {
			return;
		}

		selectedStores.forEach(store -> {
			long demand = store.getExpectedSales().subtract(store.getStorePreviousDay()).longValue();
			store.setDemand(demand > 0 ? demand : 0);
		});

		if (different < 0) {
			for (int i = 0; i < -different; i++) {
				Store store = fixRoudingBigger(selectedStores);
				store.setAmountAllocated(store.getAmountAllocated() - 1);
				store.setDemand(store.getDemand() - 1);
			}
		} else {
			for (int i = 0; i < different; i++) {
				Store store = fixRoudingSmaller(selectedStores);
				store.setAmountAllocated(store.getAmountAllocated() + 1);
				store.setDemand(store.getDemand() + 1);
			}
		}
	}

	private static List<Store> getStoresByMaxOfField(List<Store> stores, Function<Store, Long> Field) {
		OptionalLong max = stores.stream().mapToLong(store -> Field.apply(store)).max();
		return stores.stream().filter(store -> Field.apply(store) == max.orElse(0)).collect(Collectors.toList());
	}

	private static List<Store> getStoresByMinOfField(List<Store> stores, Function<Store, Long> Field) {
		OptionalLong min = stores.stream().mapToLong(store -> Field.apply(store)).min();
		return stores.stream().filter(store -> Field.apply(store) == min.orElse(0)).collect(Collectors.toList());
	}

	private static Store fixRoudingBigger(List<Store> selectedStores) {
		List<Store> biggestAmountsAllocatedStores = getStoresByMaxOfField(selectedStores,
				store -> store.getAmountAllocated() - store.getDemand());
		if (biggestAmountsAllocatedStores.size() == 1) {
			return biggestAmountsAllocatedStores.get(0);
		}

		// if two or more store have the same difference: take one with smallest Demand
		List<Store> smallestDemandStores = getStoresByMinOfField(biggestAmountsAllocatedStores,
				store -> store.getDemand());
		if (smallestDemandStores.size() == 1) {
			return smallestDemandStores.get(0);
		}

		// if two more store have same Demand: take one with smallest Expected Sales
		List<Store> smallestExpectedSaleStores = getStoresByMinOfField(smallestDemandStores,
				store -> store.getDemand());
		if (smallestExpectedSaleStores.size() == 1) {
			return smallestExpectedSaleStores.get(0);
		}

		// if two more store have same expected sale: take one with smallest store
		// number
		List<Store> smallestStoreNumber = getStoresByMinOfField(smallestExpectedSaleStores,
				store -> store.getStoreId());
		if (smallestStoreNumber.size() == 1) {
			return smallestStoreNumber.get(0);
		} else {
			return null;
		}
	}

	private static Store fixRoudingSmaller(List<Store> selectedStores) {
		List<Store> smallestAmountsAllocatedStores = getStoresByMinOfField(selectedStores,
				store -> store.getAmountAllocated() - store.getDemand());
		if (smallestAmountsAllocatedStores.size() == 1) {
			return smallestAmountsAllocatedStores.get(0);
		}

		// if two or more store have the same difference: take one with biggest Demand
		List<Store> biggestDemandStores = getStoresByMaxOfField(smallestAmountsAllocatedStores,
				store -> store.getDemand());
		if (biggestDemandStores.size() == 1) {
			return biggestDemandStores.get(0);
		}

		// if two or more store have same Demand: take one with biggest Expected Sales
		List<Store> biggestExpectedSaleStores = getStoresByMaxOfField(biggestDemandStores,
				store -> store.getDemand());
		if (biggestExpectedSaleStores.size() == 1) {
			return biggestExpectedSaleStores.get(0);
		}

		// if two or more store have same expected sale: take one with smallest store number
		List<Store> smallestStoreNumber = getStoresByMinOfField(biggestExpectedSaleStores,
				store -> store.getStoreId());
		if (smallestStoreNumber.size() == 1) {
			return smallestStoreNumber.get(0);
		} else {
			return null;
		}
	}

}
