package allocation;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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
    	
    	try {
			Map<Long, Integer> result = doAllocation(data);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
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
    
    private static List<BigDecimal> expSaleAfter() throws Exception {
		List<Store> data = getItems();
		Optional<BigDecimal> sum = data.stream()
			.filter(store -> store.getExpectedSales() != null)
			.map(Store::getExpectedSales)
			.reduce((a,b) -> a.add(b));
		List<Store> notNull = data.stream()
				.filter(store -> store.getExpectedSales() != null)
				.collect(Collectors.toList());
		BigDecimal average;
		if (sum.isEmpty()) {
			throw new Exception("Expected sales cannot be calculated. Please add "
					+ "reference store or include stores with expected sales for interpolation");
		} else {
			average = sum.get().divide(bd(notNull.size())).setScale(1, RoundingMode.HALF_UP);
		}
		
		List<BigDecimal> expSaleAfter = new ArrayList<>();
		for (Store item:data) {
			if (item.getExpectedSales() != null) {
				expSaleAfter.add(item.getExpectedSales());
			} else {
				if (item.getReferenceStoreId() != null){
					for (Store store:data) {
						if (store.getStoreId() == item.getReferenceStoreId()) {
							if (store.getExpectedSales() != null) {
								expSaleAfter.add(store.getExpectedSales());
							} else {
								expSaleAfter.add(average);
							}
							break;
						}
					}
				} else {
					expSaleAfter.add(average);
				}
			} 
		}
		return expSaleAfter;
	}
    

    /**
     * Do Allocation.
     * 
     * Key: storeId with Long type
     * Value: storeAllocatedAmount after calculation with 4 steps
     * @return map of storeId, storeAllocatedAmount
     * @throws Exception 
     */
    private static Map<Long, Integer> doAllocation(List<Store> data) throws Exception {
    	//Step 1
    	List<BigDecimal> expSale = expSaleAfter();
    	expSale.stream().forEach(System.out::println);
    	System.out.println("====================");
    	Optional<BigDecimal> sumExpSale = expSale.stream()
    				.reduce((a,b) -> a.add(b));
    	//Step 2
    	List<BigDecimal> allocationKey = new ArrayList<>();
    	for (BigDecimal digit:expSale) {
    		BigDecimal sum = sumExpSale.get().setScale(0, RoundingMode.HALF_UP);
    		BigDecimal temp = digit.divide(sum, 10, RoundingMode.CEILING);
    		allocationKey.add(temp);
    	}
    	allocationKey.stream().forEach(System.out::println);
    	System.out.println("===================");
    	//Step 3
    	BigDecimal allocationAmount = bd(300);
    	BigDecimal sumStock = data.stream()
    			.map(Store::getStorePreviousDay)
    			.reduce((a,b)->a.add(b))
    			.get();
    	List<BigDecimal> amountAllocated = new ArrayList<>();
    	for (int i=0; i<data.size(); i++) {
    		BigDecimal temp = allocationKey.get(i).multiply(allocationAmount.add(sumStock)).subtract(data.get(i).getStorePreviousDay())
    						.setScale(0, RoundingMode.HALF_UP);
    		if (temp.compareTo(bd(0)) == 1) {
    			amountAllocated.add(temp);
    		} else {
    			amountAllocated.add(bd(0));
    		}
    		
    	}
    	amountAllocated.stream().forEach(System.out::println);
    	BigDecimal sumAmountAllocated = amountAllocated.stream()
    				.reduce((a,b) -> a.add(b))
    				.get();
    	
    	System.out.println(sumAmountAllocated);
    	
    	//Step 4:
    	if (sumAmountAllocated != allocationAmount) {
    		List<BigDecimal> demand = new ArrayList<>();
    		for (int i=0; i<data.size(); i++) {
    			BigDecimal temp = expSale.get(i).subtract(data.get(i).getStorePreviousDay());
    			demand.add(temp);
    		}
    		if (sumAmountAllocated.compareTo(allocationAmount) == 1) {
    			BigDecimal max = bd(0);
    			List<BigDecimal> distance = new ArrayList<>();
    			List<Integer> maxDistance = new ArrayList<>();
    			for (int i=0; i<data.size(); i++) {
    				if (!amountAllocated.get(i).equals(bd(0))) {
    					BigDecimal temp = amountAllocated.get(i).subtract(demand.get(i)).abs();
        				distance.add(temp);
        				if (max.compareTo(temp) == -1) {
        					max = temp;
        					maxDistance = new ArrayList<>();
        					maxDistance.add(i);
        				} else if (max.compareTo(temp) == 0){
        					maxDistance.add(i);
        				}
    				}
    			if (maxDistance.size() == 1) {
    				BigDecimal temp = amountAllocated.get(maxDistance.get(0));
    				amountAllocated.set(maxDistance.get(0), temp.subtract(bd(1)));
    			}
    			}
    		}
    	}
        return null;
    }


}
