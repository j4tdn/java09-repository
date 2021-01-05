package allocation;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
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
    private Map<Long, Integer> doAllocation(List<Store> data, Integer allowcationAmout) {
    	
    	List<Store>storeSelected= data.stream()
    	.filter(store->store.getSelected())
    	.collect(Collectors.toList());
    	
    	List<Store> storeClone = new ArrayList<Store>();
    	
    	
    	
    	Map<Long, Store>storeExpectedSale =	storeClone.stream().collect(Collectors.toMap(Store::getStoreId, 
    			Function.identity(), 
    			(k1,k2)->k1,
    			LinkedHashMap::new ));
    	
    	Optional<BigDecimal>sumExpectedSaleNotNull =storeSelected.stream().filter(a-> a.getExpectedSales()!=null)
    	.map(store->store.getExpectedSales())
    	.reduce((a,b) -> a.add(b));
    	Long countAllExpectedNotNull=
    	storeSelected.stream()
    	.filter(store->store.getExpectedSales() !=null).count();
    	
    	BigDecimal averageOfExpectedSale=sumExpectedSaleNotNull.get()
    	.divide(BigDecimal.valueOf(countAllExpectedNotNull), RoundingMode.HALF_UP);
    	
    	storeSelected.stream().forEach(store->{
    	BigDecimal expectedSales =	store.getExpectedSales();
    	long storeId =	store.getStoreId();
    	Store referenceStore =	storeExpectedSale.get(storeId);
    	if (expectedSales == null) {
			if (referenceStore != null) {
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
    	Optional<BigDecimal> sumAllExpectedSale = storeSelected.stream().map(Store::getExpectedSales)
				.reduce((a, b) -> a.add(b));

		Map<Long, BigDecimal> allocationKeys = storeSelected.stream()
				.collect(Collectors.toMap(Store::getStoreId, store -> {
					BigDecimal allocationKey = store.getExpectedSales().divide(sumAllExpectedSale.get(),
							10, RoundingMode.HALF_UP);
					return allocationKey;
				}, (s1, s2) -> s1, LinkedHashMap::new));
		
		
		return null;
    	
    	
    }


}
