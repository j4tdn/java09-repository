package allocation;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import beans.Store;

public class WhAllocatedAmountManager {
	public static void main(String[] args) {
		List<Store> data = getItem();
		Map<Integer, Integer> result = doAllocation(data, 300);
		for(Entry<Integer, Integer> entry : result.entrySet()) {
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
	}
	private static List<Store> getItem() {
		return Arrays.asList(
				new Store(1, null, 18, 40, Boolean.TRUE),
				new Store(2, null, 19, 20, Boolean.TRUE),
				new Store(3, null, 21, 17, Boolean.TRUE),
				new Store(4, null, 14, 31, Boolean.TRUE),
				new Store(5, null, 14, 10, Boolean.TRUE),
				new Store(6, null, 15, 30, Boolean.TRUE),
				new Store(7, 2, 15, null, Boolean.TRUE),
				new Store(8, null, null, 19, Boolean.TRUE),
				new Store(9, null, 17, 26, Boolean.TRUE),
				new Store(10, 7, 18, null, Boolean.TRUE),
				new Store(11, null, 18, 40, Boolean.FALSE)
				);
	}
	
	/**
	 * Do Allocation.
	 * 
	 * Key: storeId with Long type Value: storeAllocatedAmount after calculation
	 * with 4 steps
	 * 
	 * @return map of storeId, storeAllocatedAmount
	 */
	
	private static Map<Integer, Integer> doAllocation(List<Store> data, Integer allocationAmount) {
		// step 1 : assign value for empty field
		data.stream().forEach(Store -> {
			if(Store.getExpectedSales() == null && Store.getReferenceStoreId() != null) {
				Integer referenceId = Store.getReferenceStoreId() - 1;
				Integer assignedValue = data.get(referenceId).getExpectedSales();
				if(assignedValue != null) {
					Store.setExpectedSales(assignedValue);
				}
			}	
		});
		
		int sum = 0;
		for(Store element : data) {
			sum += element.getExpectedSales();
		}
		int averageNumber = sum / data.size();
		data.stream().forEach(Store -> {
			if(Store.getExpectedSales() == null) {
				Store.setExpectedSales(averageNumber);
			}
		});
		// step 2: calculate Allocation Key
		Map<Integer, Integer> allocationKeys = new HashMap<Integer, Integer>();
		data.stream().forEach(Store -> {
			Integer id = Store.getStoreId();
			Integer allocationKey = Store.getExpectedSales() / averageNumber;
			allocationKeys.put(id, allocationKey);
		});
		
		// step 3: calculate Amount Allocated
		Integer totalOfStockPreviousDay = 0;
		for(Store element : data) {
			totalOfStockPreviousDay += element.getStorePreviousDay();
		}
		Map<Integer, Integer> result = new HashMap<Integer, Integer>();
		for(Entry<Integer, Integer> entry : allocationKeys.entrySet()) {
			Integer id = entry.getKey();
			Integer stockPreviousDayOfElement = data.get(id - 1).getStorePreviousDay();
			Integer amountAllocated = entry.getValue()*(allocationAmount + totalOfStockPreviousDay) - stockPreviousDayOfElement;
			result.put(id, amountAllocated);
		}
		return result;
	}
}
