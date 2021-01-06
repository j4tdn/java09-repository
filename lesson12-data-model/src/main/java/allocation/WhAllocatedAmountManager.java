package allocation;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Comparator.*;

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
	
    public static void main(String[] args) {
    	final Integer allocationAmount = 300;
    	final List<Store> data = getItems();
    	
    	Map<Long, Integer> finalAmountAllocated = doAllocation(data, allocationAmount);
    	System.out.println("=====Output=====");
    	finalAmountAllocated.entrySet().stream().forEach(System.out::println);
    	System.out.println("Ok");
    	
    }

    private static List<Store> getItems() {
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
        return Arrays.asList(new Store(1L, null, bd(18), bd(40), Boolean.TRUE),
	             new Store(2L, null, bd(19), null, Boolean.TRUE), 
	             new Store(3L, null, bd(21), bd(10), Boolean.TRUE),
	             new Store(4L, null, bd(14), bd(31), Boolean.TRUE), 
	             new Store(5L, null, bd(14), bd(10), Boolean.TRUE),
	             new Store(6L, null, bd(15), bd(33), Boolean.TRUE), 
	             new Store(7L, 2L, bd(15), null, Boolean.TRUE),
	             new Store(8L, null, bd(12), bd(19), Boolean.TRUE), 
	             new Store(9L, null, bd(17), bd(20), Boolean.TRUE),
	             new Store(10L, 7L, bd(18), null, Boolean.TRUE), 
	             new Store(11L, null, bd(22), null, Boolean.FALSE));
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
    private static Map<Long, Integer> doAllocation(List<Store> data, Integer allocationAmount) {
    	System.out.println("=====Step1=====");
    	Map<Long, BigDecimal> interpolatedExpectedSales = calculateInterpolatedExpectedSales(data);
    	interpolatedExpectedSales.entrySet().stream().forEach(System.out::println);
    	System.out.println("=====Step2=====");
    	Map<Long, BigDecimal> allocationKeys = calculateAllocationKey(data, interpolatedExpectedSales);
    	allocationKeys.entrySet().stream().forEach(System.out::println);
    	System.out.println("=====Step3=====");
    	Map<Long, Integer> amountAllocateds = calculateAmountAllocated(data, allocationKeys, allocationAmount);
    	amountAllocateds.entrySet().stream().forEach(System.out::println);
    	System.out.println("=====Step4=====");
    	
    	Map<Long, Integer> finalAmountAllocated = amountAllocateds;
    	Integer sumAmountAllocated = finalAmountAllocated.entrySet()
    											 .stream()
    											 .map(m -> m.getValue())
    											 .reduce(0, Integer::sum);
    	Integer valDemand = null;
    	Integer valDiff = null;
    	List<ComparatorClass> coms = new ArrayList<>();
    	while(sumAmountAllocated.compareTo(allocationAmount) != 0) {
    		for (Store store : data) {
    			if(store.getSelected() == true) {
    				valDemand = (interpolatedExpectedSales.get(store.getStoreId())
							.subtract(store.getStorePreviousDay()))
							.setScale(0, RoundingMode.HALF_UP)
							.intValue();
    				valDemand = (valDemand > 0) ? valDemand : 0;
    				valDiff = finalAmountAllocated.get(store.getStoreId()) - valDemand;
    				if(finalAmountAllocated.get(store.getStoreId()).compareTo(0) != 0) {
    					coms.add(new ComparatorClass(valDiff
								, valDemand
								, interpolatedExpectedSales.get(store.getStoreId())
								, store.getStoreId()));
    				} else {
    					coms.add(null);
    				}
    				coms.add(null);
    			}
			}
    		if(sumAmountAllocated > allocationAmount) {
    			coms.sort(nullsLast(comparing(ComparatorClass::getDifferenceAmoAndDem, reverseOrder())
    								.thenComparing(ComparatorClass::getDemand)
    								.thenComparing(ComparatorClass::getInterpolatedExpectedSales)
    								.thenComparing(ComparatorClass::getStoreId)));
    			finalAmountAllocated.replace(coms.get(0).getStoreId()
    										, finalAmountAllocated.get(coms.get(0).getStoreId()) - 1);
    			sumAmountAllocated --;
    		} else {
    			coms.sort(nullsLast(comparing(ComparatorClass::getDifferenceAmoAndDem)
						.thenComparing(ComparatorClass::getDemand, reverseOrder())
						.thenComparing(ComparatorClass::getInterpolatedExpectedSales, reverseOrder())
						.thenComparing(ComparatorClass::getStoreId)));
    			finalAmountAllocated.replace(coms.get(0).getStoreId()
								, finalAmountAllocated.get(coms.get(0).getStoreId()) + 1);
    			sumAmountAllocated ++;
    		}
    	}
    	return finalAmountAllocated;
    }
    
    private static Map<Long, BigDecimal> calculateInterpolatedExpectedSales(List<Store> data){
		Map<Long, BigDecimal> interpolatedExpectedSales = new HashMap<>();
		Map<Long, Store> storesMap = new HashMap<>();
		double average, sum = 0.0;
		int count = 0;
		for (Store store : data) {
			storesMap.put(store.getStoreId(), store);
			if(store.getExpectedSales() != null) {
				sum += store.getExpectedSales().doubleValue();
				count ++;
			}
		}
		average = sum/count;
		for (int i = 0; i < data.size(); i++) {
			if(data.get(i).getSelected() == true) {
				if(data.get(i).getExpectedSales() != null) {
					interpolatedExpectedSales.put(data.get(i).getStoreId(), data.get(i).getExpectedSales());
				}else {
					if(data.get(i).getReferenceStoreId() != null) {
						if(storesMap.get(data.get(i).getReferenceStoreId()).getExpectedSales() != null
								&& storesMap.get(data.get(i).getReferenceStoreId()).getReferenceStoreId() == null) {
							interpolatedExpectedSales.put(data.get(i).getStoreId()
									,storesMap.get(data.get(i).getReferenceStoreId()).getExpectedSales());
						} else {
							interpolatedExpectedSales.put(data.get(i).getStoreId()
									, BigDecimal.valueOf((double)Math.round(average * 10)/10));
						}
					} else {
						interpolatedExpectedSales.put(data.get(i).getStoreId()
								, BigDecimal.valueOf((double)Math.round(average * 10)/10));
					}
				}
			}
		}
		return interpolatedExpectedSales;
	}
    
    private static Map<Long, BigDecimal> calculateAllocationKey(List<Store> data, Map<Long, BigDecimal> interpolatedExpectedSales){
    	BigDecimal sumInterpolatedExpectedSales = interpolatedExpectedSales
    												.entrySet()
    												.stream()
    												.map(m -> m.getValue())
    												.reduce(bd(0), (a, b) -> a.add(b));
    	Map<Long, BigDecimal> allocationKeys = new HashMap<>();
    	for (Store store : data) {
    		if(store.getSelected() == true) {
    			allocationKeys.put(store.getStoreId()
    					, interpolatedExpectedSales.get(store.getStoreId())
    											   .divide(sumInterpolatedExpectedSales, MathContext.DECIMAL64)
    											   .setScale(10, RoundingMode.HALF_UP));
    		}
			
		}
    	return allocationKeys;
    }
    
    private static Map<Long, Integer> calculateAmountAllocated(List<Store> data, Map<Long
    														, BigDecimal> allocationKeys
    														, Integer allocationAmount){
    	Map<Long, Integer> amountAllocates = new HashMap<>();
    	Integer amountAllocate = 0;
    	BigDecimal sumStockPreviousDay = data.stream()
    										.filter(m -> m.getSelected() == true)
    										.map(m -> m.getStorePreviousDay())
    										.reduce(bd(0),( a, b) -> a.add(b));
    	for (Store store : data) {
    		if(store.getSelected() == true) {
    			amountAllocate = ((allocationKeys.get(store.getStoreId())
										.multiply(bd(allocationAmount).add(sumStockPreviousDay)))
											.subtract(store.getStorePreviousDay()))
										.setScale(0, RoundingMode.HALF_UP).intValue();
    			amountAllocates.put(store.getStoreId(), (amountAllocate > 0) ? amountAllocate : 0);
    		}
		}
    	return amountAllocates;
    }
    
    private static Map<Long, Integer> calculateFinalAmountAllocated(List<Store> data
    																, Map<Long, BigDecimal> interpolatedExpectedSales
    																, Map<Long, Integer> amountAllocateds
    																, Integer allocationAmount){
    	Map<Long, Integer> finalAmountAllocated = amountAllocateds;
    	Integer sumAmountAllocated = finalAmountAllocated.entrySet()
    											 .stream()
    											 .map(m -> m.getValue())
    											 .reduce(0, Integer::sum);
    	Integer valDemand = null;
    	Integer valDiff = null;
    	List<ComparatorClass> coms = new ArrayList<>();
    	while(sumAmountAllocated.compareTo(allocationAmount) != 0) {
    		for (Store store : data) {
    			if(store.getSelected() == true) {
    				valDemand = (interpolatedExpectedSales.get(store.getStoreId())
							.subtract(store.getStorePreviousDay()))
							.setScale(0, RoundingMode.HALF_UP)
							.intValue();
    				valDemand = (valDemand > 0) ? valDemand : 0;
    				valDiff = finalAmountAllocated.get(store.getStoreId()) - valDemand;
    				if(finalAmountAllocated.get(store.getStoreId()).compareTo(0) != 0) {
    					coms.add(new ComparatorClass(valDiff
								, valDemand
								, interpolatedExpectedSales.get(store.getStoreId())
								, store.getStoreId()));
    				} else {
    					coms.add(null);
    				}
    				coms.add(null);
    			}
			}
    		if(sumAmountAllocated > allocationAmount) {
    			coms.sort(nullsLast(comparing(ComparatorClass::getDifferenceAmoAndDem, reverseOrder())
    								.thenComparing(ComparatorClass::getDemand)
    								.thenComparing(ComparatorClass::getInterpolatedExpectedSales)
    								.thenComparing(ComparatorClass::getStoreId)));
    			finalAmountAllocated.replace(coms.get(0).getStoreId()
    										, finalAmountAllocated.get(coms.get(0).getStoreId()) - 1);
    			sumAmountAllocated --;
    		} else {
    			coms.sort(nullsLast(comparing(ComparatorClass::getDifferenceAmoAndDem)
						.thenComparing(ComparatorClass::getDemand, reverseOrder())
						.thenComparing(ComparatorClass::getInterpolatedExpectedSales, reverseOrder())
						.thenComparing(ComparatorClass::getStoreId)));
    			finalAmountAllocated.replace(coms.get(0).getStoreId()
								, finalAmountAllocated.get(coms.get(0).getStoreId()) + 1);
    			sumAmountAllocated ++;
    		}
    	}
    	return finalAmountAllocated;
    }

}
