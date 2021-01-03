package allocation;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import static allocation.WhAllocatedAmountManager.*;

public class Calculate {
	
	private static List<Store> data = WhAllocatedAmountManager.getItems();
	public static void main(String[] args) {
		List<Store> selectedStores = new ArrayList<>();
		selectedStores = data.stream()
				.filter(t -> t.getSelected() == Boolean.TRUE)
				.collect(Collectors.toList());
		//Step 1
		FillExpectedSales(selectedStores); 
		
		//Step 2
		Map<Store, Double> storesWithAllocationKey = findAllocationKey(selectedStores);
		
		//Step 3
		Map<Store, Long> storesWithAllocatedAmount = findAmountAllocated(storesWithAllocationKey);
		
		//Step 4
		Long sumOfAllocatedAmount = 0L;
		for (Entry<Store, Long> entry : storesWithAllocatedAmount.entrySet()) {
			sumOfAllocatedAmount += entry.getValue();
		}
		Map<Store, Long> finalResult = new HashMap<>();
		if (WhAllocatedAmountManager.allocationAmount < sumOfAllocatedAmount) {
			finalResult = fixingIssuesUp(storesWithAllocatedAmount, sumOfAllocatedAmount);
		} else if (WhAllocatedAmountManager.allocationAmount < sumOfAllocatedAmount) {
			finalResult = fixingIssuesDown(storesWithAllocatedAmount, sumOfAllocatedAmount);
		} else {
			finalResult = storesWithAllocatedAmount;
		}
		finalResult
			.entrySet()
			.stream()
			.map(t -> t.getValue())
			.forEach(System.out::println);
	}
	
	private static void FillExpectedSales(List<Store> selectedStores) {

		List<Store> originalStores = Store.setListStore(selectedStores);

		for (Store store : selectedStores) {
			if (store.getExpectedSales() == null) {
				Store referenceStoreLv1 = null; 
				for(Store store1 : originalStores) {
					if (store.getReferenceStoreId()==store1.getStoreId()) {
						referenceStoreLv1 = store1;
					}
				}

				if (referenceStoreLv1.getExpectedSales() == null) {
					Long sum = 0L;
					Long count = 0L;
					for (Store store2 : selectedStores) {
						if (store2.getExpectedSales()!= null) {
							sum+= store2.getExpectedSales();
							count ++;
						}
					}
					Long averageValue = sum / count;
					store.setExpectedSales(averageValue);
				} else {
					store.setExpectedSales(referenceStoreLv1.getExpectedSales());
				}
			}
		}
	
	}
	
	private static Map<Store, Double> findAllocationKey(List<Store> selectedStores){
		double sum = 0;
		Map<Store, Double> result = new HashMap<Store, Double>();
		for (Store store : selectedStores) {
			sum += store.getExpectedSales();
		}

		for (Store store : selectedStores) {
			double allocationKey;
			allocationKey = store.getExpectedSales()/sum;
			result.put(store, allocationKey);
		}
		return result;
	}
	
	private static Map<Store, Long> findAmountAllocated(Map<Store, Double> selectedStores){
		Long sumStockPreviousDay = 0L;
		Map<Store, Long> result = new HashMap<Store, Long>();
		for (Entry<Store, Double> store : selectedStores.entrySet()) {
			sumStockPreviousDay += store.getKey().getStorePreviousDay();
		}
		Long amountAllocated = 0L;
		for (Entry<Store, Double> store : selectedStores.entrySet()) {
			amountAllocated = (long) (store.getValue()*(WhAllocatedAmountManager.allocationAmount + sumStockPreviousDay)
					- store.getKey().getStorePreviousDay());
			result.put(store.getKey(), amountAllocated);
		}
		return result;
	}
	private static Map<Store, Long> fixingIssuesUp(Map<Store, Long> selectedStores,Long sumOfAllocatedAmount ) {
		Long demand = 0L;
		Map<Store, Long> map = new HashMap<>();
		for (Entry<Store, Long> store : selectedStores.entrySet()) {
			demand = store.getKey().getExpectedSales() - store.getKey().getStorePreviousDay();
			map.put(store.getKey(), demand);
		}
		Long max = 0L;
		for (Entry<Store, Long> store : selectedStores.entrySet()){
			max = map.entrySet()
					.stream()
					.map(k -> k.getValue())
					.reduce((long) 0, Long::max);
		}
		
		while (sumOfAllocatedAmount > WhAllocatedAmountManager.allocationAmount) {
			for (Entry<Store, Long> store : map.entrySet()) {
				if (store.getValue() == max) {
					store.setValue(store.getValue() - 1);
					break;
				}
			}
			max --;
		}
		return map;
	}
	
	private static Map<Store, Long> fixingIssuesDown(Map<Store, Long> selectedStores,Long sumOfAllocatedAmount ) {
		Long demand = 0L;
		Map<Store, Long> map = new HashMap<>();
		for (Entry<Store, Long> store : selectedStores.entrySet()) {
			demand = store.getKey().getExpectedSales() - store.getKey().getStorePreviousDay();
			map.put(store.getKey(), demand);
		}
		Long min = 0L;
		for (Entry<Store, Long> store : selectedStores.entrySet()){
			min = map.entrySet()
					.stream()
					.map(k -> k.getValue())
					.reduce((long) 0, Long::min);
		}
		
		while (sumOfAllocatedAmount < WhAllocatedAmountManager.allocationAmount) {
			for (Entry<Store, Long> store : map.entrySet()) {
				if (store.getValue() == min) {
					store.setValue(store.getValue() + 1);
					break;
				}
			}
			min ++ ;
		}
		return map;
	}
}
