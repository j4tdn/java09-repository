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
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Store;

public class WhAllocatedAmountManager {
	
	/**
	 * BigDecimal a = BigDecimal.valueOf(10); 
	 * BigDecimal b = BigDecimal.valueOf(20);
	 * BigDecimal mul = a.multiply(b); 
	 * BigDecimal div = a.divide(b); 
	 * BigDecimal add = a.add(b); 
	 * BigDecimal sub = a.subtract(b); 
	 * 
	 * Rounding
	 * a.setScale(10, RoundingMode.HALF_UP);
	 */
	
	private static List<Store> selectedStore;
	
    public static void main(String[] args) {
    	final Integer allocationAmount = 300;
    	final List<Store> data = getItems();
    	
    	doAllocation(data, allocationAmount);
    }

    private static void fixRoundingIssues(Integer allocationAmount, Map<Long, Long> amountAllocatedMap) {
    	int different = compare(allocationAmount, amountAllocatedMap);
    	if(different == 0) {
    		return;
    	}
    	
		if(different < 0) {
			for(int i = 0; i < -different; i++) {
				Entry<Long, Long> highestValue = Collections.max(amountAllocatedMap.entrySet(), 
																	(e1, e2) -> e1.getValue().compareTo(e2.getValue()));
				highestValue.setValue(highestValue.getValue() - 1);
			}
		} else {
			for(int i = 0; i < different; i++) {
				Entry<Long, Long> smallestValue = Collections.min(amountAllocatedMap.entrySet(), 
																	(e1, e2) -> e1.getValue().compareTo(e2.getValue()));
				smallestValue.setValue(smallestValue.getValue() + 1);
			}
		}
	}

	private static int compare(Integer allocationAmount, Map<Long, Long> amountAllocatedMap) {
    	long sumOfamountAllocated = amountAllocatedMap.values()
						    						.stream()
						    						.mapToLong(Long::valueOf)
						    						.sum();
		return (int) (allocationAmount - sumOfamountAllocated);
	}

	private static Map<Long, Long> calculateAmountAllocated(Integer allocationAmount, 
    		List<Store> data,
			Map<Long, BigDecimal> allocationKeyMap) {
    	
    	Map<Long, Long> result = new HashMap<>();
    	
    	BigDecimal stockPreviousDaySum = getSumWithField(selectedStore, Store::getStorePreviousDay);
    	selectedStore.forEach(store -> {
    		BigDecimal allocationKey = allocationKeyMap.get(store.getStoreId());
    		Long amountAllocated = allocationKey.multiply(stockPreviousDaySum.add(BigDecimal.valueOf(allocationAmount)))
												.subtract(store.getStorePreviousDay())
												.setScale(0, RoundingMode.HALF_UP)
												.longValue();
    		result.put(store.getStoreId(), amountAllocated);
    	});
    	
    	return result;
    	
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
    	Map<Long, Store> storeMap = data.stream()
    									.collect(Collectors.toMap(Store::getStoreId, 
    																Function.identity(), 
    																(s1, s2) -> s1));
    	
    	BigDecimal expectedSaleSum = getSumWithField(selectedStore, Store::getExpectedSales);
    	if(expectedSaleSum.intValue() == 0) {
    		return false;
    	}
    	
    	long validStoreNumber = selectedStore.stream().filter(store -> store.getExpectedSales() != null).count();
    	BigDecimal expectedSaleAverage = expectedSaleSum.divide(new BigDecimal(validStoreNumber))
    													.setScale(1, RoundingMode.HALF_UP);
    	
    	List<Store> changeAfterStores = new ArrayList<>();
    	
    	selectedStore.stream()
    		.filter(store -> store.getExpectedSales() == null)
    		.forEach(store -> {
    			if(store.getReferenceStoreId() == null) {
    				store.setStoreId(10000L);
    				store.setExpectedSales(expectedSaleAverage);
    			} else {
    				if(storeMap.get(store.getReferenceStoreId())
								.getExpectedSales() == null) {
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

	private static List<Store> getItems() {
        return Arrays.asList(
            new Store(1L, null, bd(18), bd(40), Boolean.TRUE),
                new Store(2L, null, bd(19), bd(20), Boolean.TRUE),
                new Store(3L, null, bd(21), bd(17), Boolean.TRUE),
                new Store(4L, null, bd(14), bd(31), Boolean.TRUE),
                new Store(5L, null, bd(14), bd(10), Boolean.TRUE),
                new Store(6L, null, bd(15), bd(30), Boolean.TRUE),
                new Store(7L, 2L, bd(15), null, Boolean.TRUE),
                new Store(8L, null, bd(12), bd(19), Boolean.TRUE),
                new Store(9L, null, bd(17), bd(26), Boolean.TRUE),
                new Store(10L, 7L, bd(18), null, Boolean.TRUE),
                new Store(11L, null, bd(22), null, Boolean.FALSE)
        );
    }

    private static BigDecimal bd(long value) {
        return BigDecimal.valueOf(value);
    }

    /**
     * Do Allocation.
     * 
     * Key: storeId with Long type
     * Value: storeAllocatedAmount after calculation with 4 steps
     * @return map of storeId, storeAllocatedAmount
     */
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
    	Map<Long, Long> amountAllocatedMap = calculateAmountAllocated(allocationAmount, data, allocationKeyMap);
    	
    	// Step Four: Fix Rounding Issues
		fixRoundingIssues(allocationAmount, amountAllocatedMap);
    	amountAllocatedMap.forEach((s1, s2) -> System.out.println(s1 + ", " + s2));
    	
        return amountAllocatedMap;
    }


}
