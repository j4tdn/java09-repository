package allocation;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
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
		List<Store> storeSelected=data.stream()
				.filter(store->store.getSelected()==Boolean.TRUE)
				.collect(Collectors.toList());
		//step1
		calExceptedSale(storeSelected);
		//step2
		Map<Long,BigDecimal> allocationKey=calAllocationKey(storeSelected);
		//step3
		Map<Long,BigDecimal> amountAllocated=calAmountAllocated(storeSelected, 300);
		for (Store store2 : storeSelected) {
			System.out.println(amountAllocated.get(store2.getStoreId())+"   "+store2.getStorePreviousDay());
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

    /**
     * Do Allocation.
     * 
     * Key: storeId with Long type
     * Value: storeAllocatedAmount after calculation with 4 steps
     */
	private static void calExceptedSale(List<Store> storeSelected){
		Map<Long, Store> storeWithExpectedSale = storeSelected.stream()
				.collect(Collectors.toMap(Store::getStoreId, Function.identity(), (s1, s2) -> s1, LinkedHashMap::new));

		Optional<BigDecimal> sumAllExpectedSaleNotNull = storeSelected.stream()
				.filter(store -> store.getExpectedSales() != null).map(Store::getExpectedSales)
				.reduce((a, b) -> a.add(b));

		Long count = storeSelected.stream().filter(store -> store.getExpectedSales() != null)
				.count();

		BigDecimal average = sumAllExpectedSaleNotNull.get()
				.divide(BigDecimal.valueOf(count),1,RoundingMode.HALF_UP);

		storeSelected.stream().forEach(store -> {
			BigDecimal expectedSale = store.getExpectedSales();
			Long referenceStoreId = store.getReferenceStoreId();
			Store referenceStore = storeWithExpectedSale.get(referenceStoreId);
			
			if (expectedSale == null) {
				if (referenceStoreId != null) {
					if (referenceStore.getExpectedSales() == null) {
						store.setExpectedSales(average);
					}
				}
			}
		});
		storeSelected.stream().forEach(store -> {
			BigDecimal expectedSale = store.getExpectedSales();
			Long referenceStoreId = store.getReferenceStoreId();
			Store referenceStore = storeWithExpectedSale.get(referenceStoreId);
			
			if (expectedSale == null) {
				if (referenceStoreId != null) {
					if (referenceStore.getExpectedSales() != null) {
						store.setExpectedSales(referenceStore.getExpectedSales());
					}
				}
			}
		});
	}
	private static Map<Long,BigDecimal> calAllocationKey(List<Store> storeSelected){
		Map<Long,BigDecimal> rs=new HashMap<Long, BigDecimal>();
		BigDecimal sum=bd(0);
		for (Store store : storeSelected) {
			sum=sum.add(store.getExpectedSales());
		}
		for (Store store : storeSelected) {
			rs.put(store.getStoreId(), store.getExpectedSales().divide(sum,
					10, RoundingMode.HALF_UP));
		}
		return rs;
	}
	private static Map<Long,BigDecimal> calAmountAllocated(List<Store> storeSelected,long amountAllocation){
		Map<Long,BigDecimal> rs=new HashMap<Long,BigDecimal>();
		Map<Long,BigDecimal> allocationKeys=calAllocationKey(storeSelected);
		BigDecimal sum=bd(0);
		for (Store store : storeSelected) {
			sum=sum.add(store.getStorePreviousDay());
		}
		for (Store store : storeSelected) {
			BigDecimal allocationKey=allocationKeys.get(store.getStoreId());
			BigDecimal amountAllocated = allocationKey.multiply(sum.add(bd(amountAllocation)))
					  .subtract(store.getStorePreviousDay());
            amountAllocated = amountAllocated.setScale(0, RoundingMode.HALF_UP);
            rs.put(store.getStoreId(), amountAllocated);
		}
		return rs;
		
	}
}