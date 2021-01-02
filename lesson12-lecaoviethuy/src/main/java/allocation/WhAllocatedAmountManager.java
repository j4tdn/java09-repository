package allocation;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.OptionalLong;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Store;

public class WhAllocatedAmountManager {
	
	private static List<Store> selectedStore;
	
    public static void main(String[] args) {
    	final Integer allocationAmount = 300;
    	final List<Store> data = getItems();
    	
    	doAllocation(data, allocationAmount);
    }

    private static void fixRoundingIssues(Integer allocationAmount, List<Store> selectedStore) {
    	int different = compare(allocationAmount, selectedStore);
    	if(different == 0) {
    		return;
    	}
    	
    	selectedStore.forEach(store -> {
    		long value = store.getExpectedSales().subtract(store.getStorePreviousDay()).longValue();
    		store.setDemand(value > 0 ? value : 0);
    	});
    	
		if(different < 0) {
			for(int i = 0; i < -different; i++) {
				boolean[] isGetMaxWithFields = {true, false, false, false};
				Store store = findNeedChangeStoreIndex(selectedStore, isGetMaxWithFields);
				store.setAmountAllocated(store.getAmountAllocated() - 1);
				store.setDemand(store.getDemand() - 1);
			}
		} else {
			for(int i = 0; i < different; i++) {
				boolean[] isGetMaxWithFields = {false, true, true, false};
				Store store = findNeedChangeStoreIndex(selectedStore, isGetMaxWithFields);
				store.setAmountAllocated(store.getAmountAllocated() + 1);
				store.setDemand(store.getDemand() + 1);
			}
		}
	}

    /**
     * this function called when allocation amount is bigger than sum of all seleted store even lower
     * it will be get prioritize fields by max or min (amount allocated - demand -> demand -> expected sale -> store number)
     * @param selectedStore
     * @param isGetMaxWithFields uses for determinate which field is get max or min one by one (true -> max, false -> min)
     * @return store which is need increase or decrease its demand and amount allocated
     */
	private static Store findNeedChangeStoreIndex(List<Store> selectedStore, 
												boolean[] isGetMaxWithFields) {
		List<Store> highestAAStores = getMinOrMaxField(selectedStore, 
										store -> store.getAmountAllocated() - store.getDemand(), 
										isGetMaxWithFields[0]);
		if(highestAAStores.size() == 1) {
			return highestAAStores.get(0);
		}
		
		// 2 or more store have same highest value => find smallest demand
		List<Store> smallestDemandStores = getMinOrMaxField(highestAAStores, 
														Store::getDemand, 
														isGetMaxWithFields[1]);
		if(smallestDemandStores.size() == 1) {
			return smallestDemandStores.get(0);
		}
		
		// 2 or more store have same smallest demand => find smallest expected sale
		List<Store> smallestExpectedSaleStores = getMinOrMaxField(smallestDemandStores, 
																Store::getDemand, 
																isGetMaxWithFields[2]);
		if(smallestExpectedSaleStores.size() == 1) {
			return smallestExpectedSaleStores.get(0);
		}
		
		// 2 or more store have same expected sale => find smallest store number
		List<Store> smallestStoreNumber = getMinOrMaxField(smallestExpectedSaleStores, 
															Store::getStoreId,
															isGetMaxWithFields[3]);
		if(smallestStoreNumber.size() == 1) {
			return smallestStoreNumber.get(0);
		} else {
			return null;
		}
	}
	
	private static List<Store> getMinOrMaxField(List<Store> stores, Function<Store, Long> convertToField, boolean isGetMax){
		long value;
		if(isGetMax) {
			value = getMaxOfField(stores, convertToField);
		} else {
			value = getMinOfField(stores, convertToField);
		}
		
		return stores.stream()
			.filter(store -> convertToField.apply(store) == value)
			.collect(Collectors.toList());
	}
	
	private static Long getMinOfField(List<Store> stores, Function<Store, Long> function) {
		OptionalLong result = stores.stream()
				.mapToLong(store -> function.apply(store))
				.min();
		return result.orElse(0);
	}

	private static Long getMaxOfField(List<Store> stores, Function<Store, Long> function) {
		OptionalLong result = stores.stream()
					.mapToLong(store -> function.apply(store))
					.max();
		return result.orElse(0);
	}

	private static int compare(Integer allocationAmount, List<Store> selectedStores) {
    	long sumOfamountAllocated = selectedStores.stream()
					    						.mapToLong(Store::getAmountAllocated)
					    						.sum();
		return (int) (allocationAmount - sumOfamountAllocated);
	}

	private static boolean calculateAmountAllocated(Integer allocationAmount, 
    		List<Store> data,
			Map<Long, BigDecimal> allocationKeyMap) {
    	
    	BigDecimal stockPreviousDaySum = getSumWithField(selectedStore, Store::getStorePreviousDay);
    	selectedStore.forEach(store -> {
    		BigDecimal allocationKey = allocationKeyMap.get(store.getStoreId());
    		Long amountAllocated = allocationKey.multiply(stockPreviousDaySum.add(BigDecimal.valueOf(allocationAmount)))
												.subtract(store.getStorePreviousDay())
												.setScale(0, RoundingMode.HALF_UP)
												.longValue();
    		store.setAmountAllocated(amountAllocated);
    	});
    	
    	return true;
	}

	private static Map<Long, BigDecimal> calculateAllocationKey(List<Store> data) {
    	Map<Long, BigDecimal> allocationKeyMap = new HashMap<>();
    	
    	BigDecimal expectedSaleSum = getSumWithField(selectedStore, Store::getExpectedSales);
    	
    	selectedStore.forEach(store -> {
    		allocationKeyMap.put(store.getStoreId(), 
    							store.getExpectedSales()
	    								.divide(expectedSaleSum, 10, RoundingMode.HALF_UP));
    	});
    	
    	return allocationKeyMap;
	}

	private static BigDecimal getSumWithField(List<Store> data, Function<Store, BigDecimal> function) {
		return data.stream()
			.map(store -> function.apply(store))
			.filter(Objects::nonNull)
			.reduce(new BigDecimal(0), (bd1, bd2) -> bd1.add(bd2));
	}

	private static boolean fillMissingExpectedSaleValue(List<Store> data) {
		// transfer to map to handle easier when get store by id
    	Map<Long, Store> storeMap = data.stream()
    									.collect(Collectors.toMap(Store::getStoreId, 
    																Function.identity(), 
    																(s1, s2) -> s1));
    	
    	BigDecimal expectedSaleSum = getSumWithField(selectedStore, Store::getExpectedSales);
    	if(expectedSaleSum.intValue() == 0) {
    		return false;
    	}
    	
    	long validStoreNumber = selectedStore.stream()
    										.filter(store -> store.getExpectedSales() != null)
    										.count();
    	BigDecimal expectedSaleAverage = expectedSaleSum.divide(new BigDecimal(validStoreNumber))
    													.setScale(1, RoundingMode.HALF_UP);
    	
    	List<Store> changeAfterStores = new ArrayList<>();
    	
    	selectedStore.stream()
    		.filter(store -> store.getExpectedSales() == null)
    		.forEach(store -> {
    			if(store.getReferenceStoreId() == null) {
    				store.setExpectedSales(expectedSaleAverage);
    			} else {
    				if(!storeMap.containsKey(store.getReferenceStoreId()) || 
    						storeMap.get(store.getReferenceStoreId()).getExpectedSales() == null){
        				store.setExpectedSales(expectedSaleAverage);
    				} else {
    					changeAfterStores.add(store);
    				}
    			}
    		});
    	
    	changeAfterStores.forEach(store -> store.setExpectedSales(storeMap.get(store.getReferenceStoreId())
																			.getExpectedSales()));

    	return true;
	}

//	private static List<Store> getItems() {
//        return Arrays.asList(
//            new Store(1L, null, bd(18), bd(40), Boolean.TRUE),
//                new Store(2L, null, bd(19), bd(20), Boolean.TRUE),
//                new Store(3L, null, bd(21), bd(17), Boolean.TRUE),
//                new Store(4L, null, bd(14), bd(31), Boolean.TRUE),
//                new Store(5L, null, bd(14), bd(10), Boolean.TRUE),
//                new Store(6L, null, bd(15), bd(30), Boolean.TRUE),
//                new Store(7L, 2L, bd(15), null, Boolean.TRUE),
//                new Store(8L, null, bd(12), bd(19), Boolean.TRUE),
//                new Store(9L, null, bd(17), bd(26), Boolean.TRUE),
//                new Store(10L, 7L, bd(18), null, Boolean.TRUE),
//                new Store(11L, null, bd(22), null, Boolean.FALSE)
//        );
//    }
	
	private static List<Store> getItems() {
        return Arrays.asList(
            new Store(1L, null, bd(18), bd(23), Boolean.TRUE),
                new Store(2L, null, bd(19), bd(20), Boolean.TRUE),
                new Store(3L, 2L, bd(15), null, Boolean.TRUE),
                new Store(4L, null, bd(17), bd(26), Boolean.TRUE),
                new Store(5L, 7L, bd(18), null, Boolean.TRUE)
        );
    }

    private static BigDecimal bd(long value) {
        return BigDecimal.valueOf(value);
    }

    private static Map<Long, Long> doAllocation(List<Store> data, Integer allocationAmount) {
    	selectedStore = data.stream()
				.filter(Store::getSelected)
				.collect(Collectors.toList());
    	
    	// Step One: filling in missing “Expected Sales” values
    	if(!fillMissingExpectedSaleValue(data)) {
    		System.err.print("Expected sales cannot be calculated. "
    				+ "Please add a reference store or include stores with expected sales for interpolation");
    		return null;
    	}
    	
    	// Step Two: Calculation of “Allocation Key”
    	Map<Long, BigDecimal> allocationKeyMap = calculateAllocationKey(data);
    	
    	// Step Three: Calculation of “Amount Allocated”
    	calculateAmountAllocated(allocationAmount, data, allocationKeyMap);
    	
    	// Step Four: Fix Rounding Issues
		fixRoundingIssues(allocationAmount, selectedStore);
		
		Map<Long, Long> result = selectedStore.stream()
							.collect(Collectors.toMap(Store::getStoreId, 
									Store::getAmountAllocated, 
									(s1, s2) -> s1));
    	result.forEach((s1, s2) -> System.out.println(s1 + ", " + s2));
    	
        return result;
    }
}
