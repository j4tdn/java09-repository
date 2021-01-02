package allocation;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

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

		// step 1:

		Map<Long, BigDecimal> expectedSaleIncludeExpectedAndReference = new LinkedHashMap<Long, BigDecimal>();
		expectedSaleIncludeExpectedAndReference = createDataForExpectedSaleInclu(
				expectedSaleIncludeExpectedAndReference, data);

		Map<Long, BigDecimal> expectedSale = new LinkedHashMap<Long, BigDecimal>();
		expectedSale = createDataForExpectedSaleInclu(expectedSale, data);

		Map<Long, Long> referenceStore = new LinkedHashMap<Long, Long>();
		referenceStore = createDataForReferenceStore(referenceStore, data);

		expectedSaleIncludeExpectedAndReference = caculateExpectSaleInclu(expectedSaleIncludeExpectedAndReference,
				referenceStore, expectedSale);
		System.out.println("step1 expectsaleinclu");
		for (Entry<Long, BigDecimal> entry : expectedSaleIncludeExpectedAndReference.entrySet()) {
			System.out.println(entry);
		}

		// step 2 :calculate Allocation key

		Map<Long, BigDecimal> allocationKey = new LinkedHashMap<Long, BigDecimal>();
		allocationKey = createDataForAllocationKey(allocationKey, data);

		allocationKey = calculateAllocationKey(allocationKey, expectedSaleIncludeExpectedAndReference);
		System.out.println("step 2  allocation key------------------------------");
		for (Entry<Long, BigDecimal> entry : allocationKey.entrySet()) {
			System.out.println(entry);
		}

		// step 3 : calculate amount allocated

		Map<Long, BigDecimal> stockPreDay = new LinkedHashMap<Long, BigDecimal>();
		stockPreDay = createDataForStockPreDay(stockPreDay, data);

		Map<Long, BigDecimal> amountAllocated = new LinkedHashMap<Long, BigDecimal>();
		amountAllocated = createDataForAmountAllocated(amountAllocated, data);

		amountAllocated = calculateAmountAllocated(amountAllocated, allocationAmount, allocationKey, stockPreDay);
		System.out.println("step 3 amount allocated ------------------------------");
		for (Entry<Long, BigDecimal> entry : amountAllocated.entrySet()) {
			System.out.println(entry);
		}
		BigDecimal sum = sumAmountAllocated(amountAllocated);
		System.out.println("sum:" + sum);

		// step 4: fix round

		Map<Long, BigDecimal> demand = new LinkedHashMap<Long, BigDecimal>();
		demand = createDataForDemand(demand, data);

		demand = calculateDemand(demand, expectedSaleIncludeExpectedAndReference, stockPreDay);

		System.out.println("step 4 demand ------------------------------");
		for (Entry<Long, BigDecimal> entry : demand.entrySet()) {
			System.out.println(entry);
		}

		Map<Long, BigDecimal> difference = new LinkedHashMap<Long, BigDecimal>();
		difference = createDataForDifferce(difference, data);

		difference = calculateDifference(difference, demand, amountAllocated);
		System.out.println("difference------------------------------");
		for (Entry<Long, BigDecimal> entry : difference.entrySet()) {
			System.out.println(entry);
		}

		while (true) {

			if (sumAmountAllocated(amountAllocated).intValue() > allocationAmount) {
				List<Long> maxDifference = maxDifference(difference);
				if (maxDifference.size() == 1) {
					amountAllocated = setSubAmountAllocated(amountAllocated, maxDifference.get(0));
				} else {
					List<Long> minDemand = minDemand(demand, maxDifference);
					if (minDemand.size() == 1) {
						amountAllocated = setSubAmountAllocated(amountAllocated, minDemand.get(0));
					} else {
						List<Long> minExpectedSaleInc = minExpectedSaleInclu(expectedSaleIncludeExpectedAndReference,
								minDemand);
						if (minExpectedSaleInc.size() == 1) {
							amountAllocated = setSubAmountAllocated(amountAllocated, minExpectedSaleInc.get(0));
						} else {
							amountAllocated = setSubAmountAllocated(amountAllocated,
									minId(expectedSaleIncludeExpectedAndReference, minExpectedSaleInc));
						}
					}
				}

			}

			if (sumAmountAllocated(amountAllocated).intValue() < allocationAmount) {

				List<Long> minDifference = minDifference(difference);
				if (minDifference.size() == 1) {
					amountAllocated = setAddAmountAllocated(amountAllocated, minDifference.get(0));
				} else {
					List<Long> maxDemand = maxDemand(demand, minDifference);
					if (maxDemand.size() == 1) {
						amountAllocated = setAddAmountAllocated(amountAllocated, maxDemand.get(0));
					} else {
						List<Long> maxExpectedSaleInc = maxExpectedSaleInclu(expectedSaleIncludeExpectedAndReference,
								maxDemand);
						if (maxExpectedSaleInc.size() == 1) {
							amountAllocated = setAddAmountAllocated(amountAllocated, maxExpectedSaleInc.get(0));
						} else {
							amountAllocated = setAddAmountAllocated(amountAllocated,
									minId(expectedSaleIncludeExpectedAndReference, maxExpectedSaleInc));
						}
					}
				}

			}

			if (sumAmountAllocated(amountAllocated).intValue() == allocationAmount) {
				break;
			}
		}
		System.out.println("OUTPUT ------------------------------");
		for (Entry<Long, BigDecimal> entry : amountAllocated.entrySet()) {
			System.out.println(entry);
		}

		BigDecimal sum3 = sumAmountAllocated(amountAllocated);
		System.out.println("sum:" + sum3);

		///////////////////////////////////////

	}

	// function step 1
	private static Map<Long, BigDecimal> createDataForExpectedSaleInclu(
			Map<Long, BigDecimal> expectedSaleIncludeExpectedAndReference, List<Store> data) {
		Map<Long, BigDecimal> result = new LinkedHashMap<Long, BigDecimal>();
		for (Store store : data) {
			if (store.getSelected()) {
				result.put(store.getStoreId(), store.getExpectedSales());
			}
		}
		return result;
	}

	private static Map<Long, Long> createDataForReferenceStore(Map<Long, Long> referenceStore, List<Store> data) {
		Map<Long, Long> result = new LinkedHashMap<Long, Long>();
		for (Store store : data) {
			if (store.getSelected()) {
				result.put(store.getStoreId(), store.getReferenceStoreId());
			}
		}
		return result;
	}

	private static Map<Long, BigDecimal> caculateExpectSaleInclu(
			Map<Long, BigDecimal> expectedSaleIncludeExpectedAndReference, Map<Long, Long> referenceStore,
			Map<Long, BigDecimal> expectedSale) {
		Map<Long, BigDecimal> result = new LinkedHashMap<Long, BigDecimal>();
		result = expectedSaleIncludeExpectedAndReference;
		for (Entry<Long, BigDecimal> entry : expectedSaleIncludeExpectedAndReference.entrySet()) {
			if (entry.getValue() == null) {
				result.put(entry.getKey(), (getReference(entry.getKey(), referenceStore,
						expectedSaleIncludeExpectedAndReference, expectedSale)));
			}
		}
		return result;
	}

	private static BigDecimal averageExpectedSale(Map<Long, BigDecimal> expectedSale) {
		BigDecimal result = BigDecimal.valueOf(0);
		BigDecimal count = BigDecimal.valueOf(0);
		for (Entry<Long, BigDecimal> entry : expectedSale.entrySet()) {
			if (entry.getValue() != null) {
				result = result.add(entry.getValue());
				count = count.add(BigDecimal.valueOf(1));
			}
		}
		return result.divide(count);
	}

	private static BigDecimal getReference(Long key, Map<Long, Long> referenceStore,
			Map<Long, BigDecimal> expectedSaleIncludeExpectedAndReference, Map<Long, BigDecimal> expectedSale) {
		BigDecimal result = null;
		for (Entry<Long, Long> entry : referenceStore.entrySet()) {
			if (entry.getKey() == key) {
				if (entry.getValue() != null) {
					if (getExpectedSale(entry.getValue(), expectedSale) != null) {
						result = getExpectedSale(entry.getValue(), expectedSale);
					} else {
						result = averageExpectedSale(expectedSale);
					}
				} else {
					result = averageExpectedSale(expectedSale);
				}
				break;
			}
		}
		return result;
	}

	private static BigDecimal getExpectedSale(Long key, Map<Long, BigDecimal> expectedSale) {
		BigDecimal result = null;
		for (Entry<Long, BigDecimal> entry : expectedSale.entrySet()) {
			if (entry.getKey() == key) {
				result = entry.getValue();
			}
		}
		return result;
	}

	// function step 2

	private static Map<Long, BigDecimal> createDataForAllocationKey(Map<Long, BigDecimal> allocationKey,
			List<Store> data) {
		for (Store store : data) {
			if (store.getSelected()) {
				allocationKey.put(store.getStoreId(), null);
			}
		}
		return allocationKey;
	}

	private static BigDecimal sumExpectedSaleInclude(Map<Long, BigDecimal> expectedSaleIncludeExpectedAndReference) {
		BigDecimal result = BigDecimal.valueOf(0);
		for (Entry<Long, BigDecimal> entry : expectedSaleIncludeExpectedAndReference.entrySet()) {
			result = result.add(entry.getValue());
		}
		System.out.println("result:" + result);
		return result;
	}

	private static Map<Long, BigDecimal> calculateAllocationKey(Map<Long, BigDecimal> allocationKey,
			Map<Long, BigDecimal> expectedSaleIncludeExpectedAndReference) {

		Map<Long, BigDecimal> result = new LinkedHashMap<Long, BigDecimal>();
		result = allocationKey;

		BigDecimal sum = sumExpectedSaleInclude(expectedSaleIncludeExpectedAndReference);
		for (Entry<Long, BigDecimal> entry : expectedSaleIncludeExpectedAndReference.entrySet()) {
			BigDecimal temp = new BigDecimal(0);
			temp = (entry.getValue()).divide(sum, 10, RoundingMode.HALF_UP);
			for (Entry<Long, BigDecimal> e : allocationKey.entrySet()) {
				if (e.getKey() == entry.getKey()) {
					result.put(e.getKey(), temp);
					break;
				}
			}
		}

		return result;
	}

	// function step 3:
	private static Map<Long, BigDecimal> createDataForStockPreDay(Map<Long, BigDecimal> stockPreDay, List<Store> data) {
		for (Store store : data) {
			if (store.getSelected()) {
				stockPreDay.put(store.getStoreId(), store.getStorePreviousDay());
			}
		}
		return stockPreDay;
	}

	private static BigDecimal sumStockPreDay(Map<Long, BigDecimal> stockPreDay) {
		BigDecimal sum = BigDecimal.valueOf(0);
		for (Entry<Long, BigDecimal> entry : stockPreDay.entrySet()) {
			sum = sum.add(entry.getValue());
		}
		return sum;
	}

	private static Map<Long, BigDecimal> createDataForAmountAllocated(Map<Long, BigDecimal> amountAllocated,
			List<Store> data) {
		for (Store store : data) {
			if (store.getSelected()) {
				amountAllocated.put(store.getStoreId(), null);
			}

		}

		return amountAllocated;
	}

	private static Map<Long, BigDecimal> calculateAmountAllocated(Map<Long, BigDecimal> amountAllocated,
			Integer allocationAmount, Map<Long, BigDecimal> allocationKey, Map<Long, BigDecimal> stockPreDay) {
		BigDecimal result = BigDecimal.valueOf(0);
		BigDecimal sum = sumStockPreDay(stockPreDay);

		for (Entry<Long, BigDecimal> entry : amountAllocated.entrySet()) {
			result = getAllocationKey(entry.getKey(), allocationKey);
			result = result.multiply(BigDecimal.valueOf(allocationAmount).add(sum));
			result = result.subtract(getStockPreDay(entry.getKey(), stockPreDay));
			int t = result.intValue();

			amountAllocated.put(entry.getKey(), BigDecimal.valueOf(t));
		}
		return amountAllocated;

	}

	private static BigDecimal getStockPreDay(Long key, Map<Long, BigDecimal> stockPreDay) {
		BigDecimal result = BigDecimal.valueOf(0);
		for (Entry<Long, BigDecimal> entry : stockPreDay.entrySet()) {
			if (entry.getKey() == key) {
				result = entry.getValue();
				break;
			}
		}
		return result;
	}

	private static BigDecimal getAllocationKey(Long key, Map<Long, BigDecimal> allocationKey) {
		BigDecimal result = BigDecimal.valueOf(0);
		for (Entry<Long, BigDecimal> entry : allocationKey.entrySet()) {
			if (entry.getKey() == key) {
				result = entry.getValue();
				break;
			}
		}
		return result;
	}

	private static BigDecimal sumAmountAllocated(Map<Long, BigDecimal> amountallocated) {
		BigDecimal result = bd(0);
		for (Entry<Long, BigDecimal> entry : amountallocated.entrySet()) {
			result = result.add(entry.getValue());
		}
		return result;
	}

	// function step 4

	private static Map<Long, BigDecimal> setSubAmountAllocated(Map<Long, BigDecimal> amountAllocated, Long index) {
		for (Entry<Long, BigDecimal> entry : amountAllocated.entrySet()) {
			if (entry.getKey() == index) {
				BigDecimal t = entry.getValue().subtract(BigDecimal.valueOf(1));
				amountAllocated.put(entry.getKey(), t);
				break;
			}
		}
		return amountAllocated;
	}

	private static Map<Long, BigDecimal> setAddAmountAllocated(Map<Long, BigDecimal> amountAllocated, Long index) {
		for (Entry<Long, BigDecimal> entry : amountAllocated.entrySet()) {
			if (entry.getKey() == index) {
				BigDecimal t = entry.getValue().add(BigDecimal.valueOf(1));
				amountAllocated.put(entry.getKey(), t);
				break;
			}
		}
		return amountAllocated;
	}

	private static List<Long> maxDifference(Map<Long, BigDecimal> difference) {
		List<Long> result = new ArrayList<>();
		int max = -999;
		for (Entry<Long, BigDecimal> entry : difference.entrySet()) {
			if (entry.getValue().intValue() > max) {
				max = entry.getValue().intValue();
			}
		}

		for (Entry<Long, BigDecimal> entry : difference.entrySet()) {
			if (entry.getValue().intValue() == max) {
				result.add(entry.getKey());
			}
		}
		return result;
	}

	private static List<Long> minDifference(Map<Long, BigDecimal> difference) {
		int min = 999;
		int index = 0;
		List<Long> result = new ArrayList<>();
		for (Entry<Long, BigDecimal> entry : difference.entrySet()) {
			if (entry.getValue().intValue() < min) {
				min = entry.getValue().intValue();
			}
		}

		for (Entry<Long, BigDecimal> entry : difference.entrySet()) {
			if (entry.getValue().intValue() == min) {
				result.add(entry.getKey());
			}
		}

		return result;
	}

	private static List<Long> maxDemand(Map<Long, BigDecimal> demand, List<Long> list) {
		int max = -999;

		List<Long> result = new ArrayList<>();
		for (Entry<Long, BigDecimal> entry : demand.entrySet()) {
			if (isContain(list, entry.getKey())) {
				if (entry.getValue().intValue() > max) {
					max = entry.getValue().intValue();

				}
			}

		}

		for (Entry<Long, BigDecimal> entry : demand.entrySet()) {
			if (isContain(list, entry.getKey())) {
				if (entry.getValue().intValue() == max) {
					result.add(entry.getKey());
				}
			}
		}

		return result;
	}

	private static boolean isContain(List<Long> list, Long item) {
		for (Long element : list) {
			if (element == item) {
				return true;
			}
		}
		return false;

	}

	private static List<Long> minDemand(Map<Long, BigDecimal> demand, List<Long> list) {
		int min = 999;
		List<Long> result = new ArrayList<>();
		for (Entry<Long, BigDecimal> entry : demand.entrySet()) {
			if (isContain(list, entry.getKey())) {
				if (entry.getValue().intValue() < min) {
					min = entry.getValue().intValue();
				}
			}
		}

		for (Entry<Long, BigDecimal> entry : demand.entrySet()) {
			if (isContain(list, entry.getKey())) {
				if (entry.getValue().intValue() == min) {
					result.add(entry.getKey());
				}
			}
		}

		return result;
	}

	private static List<Long> maxExpectedSaleInclu(Map<Long, BigDecimal> expectedSaleIncludeExpectedAndReference,
			List<Long> list) {
		int max = 0;

		List<Long> result = new ArrayList<>();
		for (Entry<Long, BigDecimal> entry : expectedSaleIncludeExpectedAndReference.entrySet()) {
			if (isContain(list, entry.getKey())) {
				if (entry.getValue().intValue() > max) {
					max = entry.getValue().intValue();
				}
			}
		}
		for (Entry<Long, BigDecimal> entry : expectedSaleIncludeExpectedAndReference.entrySet()) {
			if (isContain(list, entry.getKey())) {
				if (entry.getValue().intValue() == max) {
					result.add(entry.getKey());
				}
			}
		}

		return result;
	}

	private static List<Long> minExpectedSaleInclu(Map<Long, BigDecimal> expectedSaleIncludeExpectedAndReference,
			List<Long> list) {
		int min = 999;
		List<Long> result = new ArrayList<Long>();
		for (Entry<Long, BigDecimal> entry : expectedSaleIncludeExpectedAndReference.entrySet()) {
			if (list.contains(entry.getKey())) {
				if (entry.getValue().intValue() < min) {
					min = entry.getValue().intValue();
				}
			}
		}

		for (Entry<Long, BigDecimal> entry : expectedSaleIncludeExpectedAndReference.entrySet()) {
			if (list.contains(entry.getKey())) {
				if (entry.getValue().intValue() == min) {
					result.add(entry.getKey());
				}
			}
		}
		return result;
	}

	private static Long minId(Map<Long, BigDecimal> expectedSaleIncludeExpectedAndReference, List<Long> list) {

		Long index = 0l;
		List<Long> result = new ArrayList<Long>();
		for (Entry<Long, BigDecimal> entry : expectedSaleIncludeExpectedAndReference.entrySet()) {
			if (list.contains(entry.getKey())) {
				index = entry.getKey();
				break;
			}
		}

		return index;
	}

	private static Map<Long, BigDecimal> createDataForDemand(Map<Long, BigDecimal> demand, List<Store> data) {
		for (Store store : data) {
			if (store.getSelected()) {
				demand.put(store.getStoreId(), null);
			}
		}
		return demand;
	}

	private static Map<Long, BigDecimal> createDataForDifferce(Map<Long, BigDecimal> difference, List<Store> data) {
		for (Store store : data) {
			if (store.getSelected()) {
				difference.put(store.getStoreId(), null);
			}
		}
		return difference;
	}

	private static Map<Long, BigDecimal> calculateDemand(Map<Long, BigDecimal> demand,
			Map<Long, BigDecimal> expectedSaleIncludeExpectedAndReference, Map<Long, BigDecimal> stockPreDay) {
		for (Entry<Long, BigDecimal> entry : demand.entrySet()) {
			BigDecimal temp = getExpectedSaleInclu(entry.getKey(), expectedSaleIncludeExpectedAndReference)
					.subtract(getStockPreDay(entry.getKey(), stockPreDay));
			int t = temp.intValue();
			if (t < 0) {
				t = 0;
			}
			demand.put(entry.getKey(), BigDecimal.valueOf(t));
		}

		return demand;
	}

	private static BigDecimal getIndexDifference(Long key, Map<Long, BigDecimal> difference) {
		BigDecimal result = BigDecimal.valueOf(0);
		for (Entry<Long, BigDecimal> entry : difference.entrySet()) {
			if (entry.getKey() == key) {
				result = entry.getValue();
			}
		}
		return result;
	}

	private static Map<Long, BigDecimal> calculateDifference(Map<Long, BigDecimal> difference,
			Map<Long, BigDecimal> demand, Map<Long, BigDecimal> amountAllocated) {
		for (Entry<Long, BigDecimal> entry : demand.entrySet()) {
			BigDecimal temp = getAmoutAllocated(entry.getKey(), amountAllocated)
					.subtract(getDemand(entry.getKey(), demand));
			difference.put(entry.getKey(), temp);
		}

		return difference;
	}

	private static BigDecimal getAmoutAllocated(Long key, Map<Long, BigDecimal> amountAllocated) {
		BigDecimal result = BigDecimal.valueOf(0);
		for (Entry<Long, BigDecimal> entry : amountAllocated.entrySet()) {
			if (entry.getKey() == key) {
				result = entry.getValue();
			}
		}
		return result;
	}

	private static BigDecimal getExpectedSaleInclu(Long key,
			Map<Long, BigDecimal> expectedSaleIncludeExpectedAndReference) {
		BigDecimal result = BigDecimal.valueOf(0);
		for (Entry<Long, BigDecimal> entry : expectedSaleIncludeExpectedAndReference.entrySet()) {
			if (entry.getKey() == key) {
				result = entry.getValue();
			}
		}
		return result;
	}

	private static BigDecimal getDemand(Long key, Map<Long, BigDecimal> demand) {
		BigDecimal result = BigDecimal.valueOf(0);
		for (Entry<Long, BigDecimal> entry : demand.entrySet()) {
			if (entry.getKey() == key) {
				result = entry.getValue();
			}
		}
		return result;
	}

	/////////////////////////////
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
	private Map<Long, Integer> doAllocation(List<Store> data) {
		return null;
	}

}
