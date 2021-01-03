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
import java.util.Set;
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
	final static Integer allocationAmount = 300;
    public static void main(String[] args) {
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
		Map<Long,BigDecimal> demand=demand(storeSelected);
		Map<Long,Integer> difference=difference(storeSelected);
		fixingIssuesUp(storeSelected, amountAllocated, difference);
		for (Store store2 : storeSelected) {
			System.out.println(amountAllocated.get(store2.getStoreId())+"  "+demand.get(store2.getStoreId())+"  "+difference.get(store2.getStoreId()));
		}
		//step4
		fixingIssuesDown(storeSelected, amountAllocated, difference);
		for (Store store2 : storeSelected) {
			System.out.println(amountAllocated.get(store2.getStoreId()));
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

		BigDecimal sum=bd(0);
		for (Store store2 : storeSelected) {
			if(store2.getExpectedSales()!=null) {
				sum=sum.add(store2.getExpectedSales());
			}
		}
		Long count = storeSelected.stream().filter(store -> store.getExpectedSales() != null)
				.count();

		BigDecimal average = sum.divide(BigDecimal.valueOf(count),1,RoundingMode.HALF_UP);

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
	private static int sumAmountAllocated(List<Store> storeSelected,Map<Long,BigDecimal> amountAllocated) {
		BigDecimal sum=bd(0);
		for (Store store : storeSelected) {
			sum=sum.add(amountAllocated.get(store.getStoreId()));
		}
		return sum.toBigInteger().intValueExact();
	}
	private static Map<Long,BigDecimal> demand(List<Store> storeSelected){
		Map<Long,BigDecimal> demand=new HashMap<Long,BigDecimal >();
		for (Store store : storeSelected) {
			 BigDecimal d=store.getExpectedSales().subtract(store.getStorePreviousDay()).setScale(0, RoundingMode.HALF_UP);
			 //d.setScale(0, RoundingMode.HALF_UP);
			 if(d.signum()<0) {
				 d=bd(0);
			 }
			demand.put(store.getStoreId(), d);
		}
		return demand;
	}
	private static Map<Long,Integer> difference(List<Store> storeSelected){
		Map<Long,BigDecimal> amountAllocated=calAmountAllocated(storeSelected, 300);
		Map<Long,BigDecimal> demand=demand(storeSelected);
		Map<Long,Integer> difference=new HashMap<Long, Integer>();
		for (Store store : storeSelected) {
			BigDecimal am=amountAllocated.get(store.getStoreId());
			BigDecimal dm=demand.get(store.getStoreId());
			difference.put(store.getStoreId(), am.subtract(dm).toBigInteger().intValueExact());
		}
		return difference;
	}
	private static void fixingIssuesUp(List<Store> storeSelected,Map<Long,BigDecimal> amountAllocated,Map<Long,Integer> difference){
		//amountAllocated=calAmountAllocated(storeSelected, 300);
		//difference=difference(storeSelected);
		//Map<Long,BigDecimal> result=new HashMap<Long, BigDecimal>();
		int max=0;
		Set<Long> key=difference.keySet();
		for(Long k:key) {
			if(difference.get(k)>max) {
				max=difference.get(k);
			}
		}
		while(sumAmountAllocated(storeSelected, amountAllocated)>300) {
			for (Store store : storeSelected) {
				if(difference.get(store.getStoreId())==max) {
					amountAllocated.put(store.getStoreId(), amountAllocated.get(store.getStoreId()).subtract(bd(1)));
					break;
				}
			}
		}
	}
	private static void fixingIssuesDown(List<Store> storeSelected,Map<Long,BigDecimal> amountAllocated,Map<Long,Integer> difference){
		//amountAllocated=calAmountAllocated(storeSelected, 300);
		//difference=difference(storeSelected);
		//Map<Long,BigDecimal> result=new HashMap<Long, BigDecimal>();
		int min=0;
		Set<Long> key=difference.keySet();
		for(Long k:key) {
			if(difference.get(k)<min) {
				min=difference.get(k);
			}
		}
		while(sumAmountAllocated(storeSelected, amountAllocated)<300) {
			for (Store store : storeSelected) {
				if(difference.get(store.getStoreId())==min) {
					amountAllocated.put(store.getStoreId(), amountAllocated.get(store.getStoreId()).add(bd(1)));
					break;
				}
			}
		}
	}
}