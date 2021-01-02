package allocation;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
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

		Map<Long, Integer> result = doAllocation(data, allocationAmount);
		
		result.entrySet().stream().forEach(entry -> System.out.println(entry.getKey()+": "+entry.getValue()));

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
	private static Map<Long, Integer> doAllocation(List<Store> data, Integer allocationAmount) {
		// step 1
		List<Store> storeSelected = data.stream().filter(store -> store.getSelected()).collect(Collectors.toList());

		List<Store> storeSelectedClone = new ArrayList<>();

		storeSelected.forEach(store -> storeSelectedClone.add(new Store(store)));

		Map<Long, Store> storeWithExpectedSale = storeSelectedClone.stream()
				.collect(Collectors.toMap(Store::getStoreId, Function.identity(), (s1, s2) -> s1, LinkedHashMap::new));

		Optional<BigDecimal> sumAllExpectedSaleNotNull = storeSelected.stream()
				.filter(store -> store.getExpectedSales() != null).map(Store::getExpectedSales)
				.reduce((a, b) -> a.add(b));

		Long numberOfExpectedSaleNotNull = storeSelected.stream().filter(store -> store.getExpectedSales() != null)
				.count();

		BigDecimal averageOfExpectedSale = sumAllExpectedSaleNotNull.get()
				.divide(BigDecimal.valueOf(numberOfExpectedSaleNotNull),1,RoundingMode.HALF_UP);

		storeSelected.stream().forEach(store -> {
			BigDecimal expectedSale = store.getExpectedSales();
			Long referenceStoreId = store.getReferenceStoreId();
			Store referenceStore = storeWithExpectedSale.get(referenceStoreId);
			
			if (expectedSale == null) {
				if (referenceStoreId != null) {
					if (referenceStore.getExpectedSales() != null) {
						store.setExpectedSales(referenceStore.getExpectedSales());
					} else {
						store.setExpectedSales(averageOfExpectedSale);
					}
				} else {
					store.setExpectedSales(averageOfExpectedSale);
				}
			}
		});


		// step 2
		Optional<BigDecimal> sumAllExpectedSale = storeSelected.stream().map(Store::getExpectedSales)
				.reduce((a, b) -> a.add(b));

		Map<Long, BigDecimal> allocationKeys = storeSelected.stream()
				.collect(Collectors.toMap(Store::getStoreId, store -> {
					BigDecimal allocationKey = store.getExpectedSales().divide(sumAllExpectedSale.get(),
							10, RoundingMode.HALF_UP);
					return allocationKey;
				}, (s1, s2) -> s1, LinkedHashMap::new));

		// step 3

		Optional<BigDecimal> sumStockPreviousDay = storeSelected.stream().map(Store::getStorePreviousDay)
				.reduce((s1, s2) -> s1.add(s2));

		Map<Long, Integer> amountAllocateds = storeSelected.stream()
				.collect(Collectors.toMap(Store::getStoreId, store -> {
					BigDecimal allocationKey = allocationKeys.get(store.getStoreId());
					BigDecimal allocationAmountBigDec = BigDecimal.valueOf(allocationAmount);
					BigDecimal amountAllocated = allocationKey.multiply(sumStockPreviousDay.get().add(allocationAmountBigDec))
															  .subtract(store.getStorePreviousDay());
					amountAllocated = amountAllocated.setScale(0, RoundingMode.HALF_UP);
					if (amountAllocated.compareTo(bd(0)) < 0) {
						amountAllocated = bd(0);
					}
					return amountAllocated.intValue();
				}, (s1, s2) -> s1, LinkedHashMap::new));

		// step 4
		Optional<Integer> sumAmountAllocated = amountAllocateds.entrySet().stream()
															   .map(Entry::getValue)
															   .reduce((entry1, entry2) -> entry1 + entry2);
		Integer sumAmountAllocatedInt = sumAmountAllocated.get();
		if (sumAmountAllocatedInt != allocationAmount) {
			Map<Long, Integer> demand = storeSelected.stream()
													.collect(Collectors.toMap(Store::getStoreId, store-> {
														Integer expectedSale = store.getExpectedSales().intValue();
														Integer storePreDay = store.getStorePreviousDay().intValue();
														Integer storeDemand = expectedSale - storePreDay;
														return (storeDemand) > 0 ? storeDemand : 0 ;
													},(s1,s2)-> s1, LinkedHashMap::new));
			
			Map<Long, Integer> expectedSale = storeSelected.stream()
														   .collect(Collectors.toMap(Store::getStoreId,store->{
															   return store.getExpectedSales().intValue();
														   },(s1,s2)-> s1, LinkedHashMap::new ));
			
			while (!sumAmountAllocatedInt.equals(allocationAmount)) {
				if (sumAmountAllocatedInt > allocationAmount) {	
					fixRoundingBiggest(amountAllocateds, demand,expectedSale);
					sumAmountAllocatedInt -= 1;
				} else {
					fixRoundingSmallest(amountAllocateds, demand,expectedSale);
					sumAmountAllocatedInt += 1;
				}
			}
		}
		amountAllocateds.entrySet().forEach(entry -> {
			if (entry.getValue() < 0 ) {
				entry.setValue(0);
			}
		});
		return amountAllocateds;
	}
	
	private static void fixRoundingBiggest (Map<Long, Integer> amountAllocateds, Map<Long , Integer> demand, Map<Long , Integer> expectedSale) {
	    Optional<Entry<Long, Integer>> subtractedStore =	amountAllocateds.entrySet()
						.stream()
						.reduce((entry1,entry2) -> {
							if (entry1.getValue().equals(0)) {
								return entry2;
							}
							
							if (entry2.getValue().equals(0)) {
								return entry1;
							}
							
							Integer differenceAmountAllocated1 = entry1.getValue() - demand.get(entry1.getKey());
							Integer differenceAmountAllocated2 = entry2.getValue() - demand.get(entry2.getKey());
							
							if (differenceAmountAllocated1.compareTo(0) < 0 && differenceAmountAllocated2.compareTo(0) < 0) {
								if (differenceAmountAllocated1.compareTo(differenceAmountAllocated2) > 0) {
									return entry1;
								} else {
									return entry2;
								}
							} else if (differenceAmountAllocated1.compareTo(differenceAmountAllocated2) !=0){
								 if (differenceAmountAllocated1.compareTo(differenceAmountAllocated2) < 0) {
									 return entry2;
								 } else {
									 return entry1;
								 }
							} else if (demand.get(entry1.getKey()).compareTo(demand.get(entry2.getKey())) !=0 ) {
								if (demand.get(entry1.getKey()).compareTo(demand.get(entry2.getKey())) > 0) {
									 return entry2;
								 } else {
									 return entry1;
								 }
							} else if (expectedSale.get(entry1.getKey()).compareTo(expectedSale.get(entry2.getKey())) !=0) {
								if (expectedSale.get(entry1.getKey()).compareTo(expectedSale.get(entry2.getKey())) > 0) {
									 return entry2;
								 } else {
									 return entry1;
								 }
							} else {
								if (entry1.getKey().compareTo(entry2.getKey()) > 0) {
									return entry2;
								} else {
									return entry1;
								}
							}
						});
			 subtractedStore.get().setValue(subtractedStore.get().getValue() -1);		
	}
	
	private static void fixRoundingSmallest (Map<Long, Integer> amountAllocateds, Map<Long, Integer> demand, Map<Long, Integer> expectedSale) {
		Optional<Entry<Long, Integer>> addedStore =	amountAllocateds.entrySet()
				.stream()
				.reduce((entry1,entry2) -> {
					Integer differenceAmountAllocated1 = entry1.getValue() - demand.get(entry1.getKey());
					Integer differenceAmountAllocated2 = entry2.getValue() - demand.get(entry2.getKey());
					
					if (differenceAmountAllocated1.compareTo(differenceAmountAllocated2) !=0){
						 if (differenceAmountAllocated1.compareTo(differenceAmountAllocated2) > 0) {
							 return entry2;
						 } else {
							 return entry1;
						 }
					} else if (demand.get(entry1.getKey()).compareTo(demand.get(entry2.getKey())) !=0 ) {
						if (demand.get(entry1.getKey()).compareTo(demand.get(entry2.getKey())) < 0) {
							 return entry2;
						 } else {
							 return entry1;
						 }
					} else if (expectedSale.get(entry1.getKey()).compareTo(expectedSale.get(entry2.getKey())) !=0) {
						if (expectedSale.get(entry1.getKey()).compareTo(expectedSale.get(entry2.getKey())) < 0) {
							 return entry2;
						 } else {
							 return entry1;
						 }
					} else {
						if (entry1.getKey().compareTo(entry2.getKey()) > 0) {
							return entry2;
						} else {
							return entry1;
						}
					}
				});
	     addedStore.get().setValue(addedStore.get().getValue() + 1);	
	}

}
