package allocation;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class WhAllocatedAmountManager {
	
	private static List<Store> selectedStore;

	public static void main(String[] args) {
		final Integer allocationAmount = 300;
		final List<Store> data = getItems();
		selectedStore = data.stream().filter(s -> s.getSelected()).collect(Collectors.toList());

		Map<Long, Store> step1 = calculateExpectedSales(data);
		System.out.println("STEP 1");
		step1.entrySet().forEach(t -> System.out.println(t));

		Map<Long, BigDecimal> step2 = allocationKey(step1);
		System.out.println("STEP 2");
		step2.entrySet().forEach(t -> System.out.println(t));
		
		Map<Long, BigDecimal> step3 = amountAllocated(step1, step2, allocationAmount);
		System.out.println("STEP 3");
		step3.entrySet().forEach(t -> System.out.println(t));

		Map<Long, BigDecimal> demand = getFinalAmountAllocated(step3, step1, allocationAmount);
		System.out.println("STEP 4");
		demand.entrySet().forEach(t -> System.out.println(t));

	}

	private static List<Store> getItems() {
		return Arrays.asList(new Store(1L, null, bigDe(18), bigDe(40), Boolean.TRUE),
				new Store(2L, null, bigDe(19), bigDe(20), Boolean.TRUE), 
				new Store(3L, null, bigDe(21), bigDe(17), Boolean.TRUE),
				new Store(4L, null, bigDe(14), bigDe(31), Boolean.TRUE), 
				new Store(5L, null, bigDe(14), bigDe(10), Boolean.TRUE),
				new Store(6L, null, bigDe(15), bigDe(30), Boolean.TRUE), 
				new Store(7L, 2L, bigDe(15), null, Boolean.TRUE),
				new Store(8L, null, bigDe(12), bigDe(19), Boolean.TRUE), 
				new Store(9L, null, bigDe(17), bigDe(26), Boolean.TRUE),
				new Store(10L, 7L, bigDe(18), null, Boolean.TRUE));
	}

	// step 1
	public static Map<Long, Store> calculateExpectedSales(List<Store> data) {
		Map<Long, Store> map = selectedStore.stream()
				.collect(Collectors.toMap(Store::getStoreId, 
						Function.identity(), (s1, s2) -> s1, LinkedHashMap::new));
		//System.out.println(map.hashCode());

		List<Store> notNullExpectedSale = selectedStore.stream().filter(s -> s.getExpectedSales() != null)
				.collect(Collectors.toList());
		
		Optional<BigDecimal> sum = notNullExpectedSale.stream()
				.map(Store::getExpectedSales).reduce((a, b) -> a.add(b));

		BigDecimal averageExpectedSale = sum.get().divide(bigDe(notNullExpectedSale.size()),
				1, RoundingMode.HALF_UP);
		
		List<Long> idChange = new ArrayList<>();
		Map<Long, Store> result = selectedStore.stream().peek(s -> {
			if (s.getExpectedSales() == null) {
				if (s.getReferenceStoreId() != null) {
					Store a = map.get(s.getReferenceStoreId());
					if (a.getExpectedSales() != null && !idChange.contains(a.getStoreId())) {
						s.setExpectedSales(a.getExpectedSales());
						idChange.add(s.getStoreId());
					} else {
						s.setExpectedSales(averageExpectedSale);
					}
				} else {
					System.out.println(
							"khong the tinh");
					return;
				}
			}
		})
		.collect(Collectors.toMap(Store::getStoreId, Function.identity(), (s1, s2) -> s1, LinkedHashMap::new));
		return result;
	}

	// step 2
	private static Map<Long, BigDecimal> allocationKey(Map<Long, Store> selected) {

		BigDecimal sumExpectedSale = selected.entrySet().stream()
				.map(e -> e.getValue().getExpectedSales()).reduce(bigDe(0), (a, b) -> a.add(b));
		
		Map<Long, BigDecimal> result = selected.entrySet().stream()
				.collect(Collectors.toMap(Entry::getKey, s -> {
					return s.getValue().getExpectedSales().divide(sumExpectedSale, 10, RoundingMode.HALF_UP);
				}, (s1, s2) -> s1, LinkedHashMap::new));
		return result;
	}

	// step 3
	private static Map<Long, BigDecimal> amountAllocated(Map<Long, Store> selected,
			Map<Long, BigDecimal> allocationKeys, Integer allocationAmount) {
		BigDecimal sumStock = selected.entrySet().stream()
										.map(e -> e.getValue().getStorePreviousDay()).reduce(bigDe(0), (a, b) -> a.add(b));
		Map<Long, BigDecimal> map = selected.entrySet().stream()
				.collect(Collectors.toMap(Entry::getKey, s -> {
					BigDecimal value = allocationKeys.get(s.getKey())
							.multiply(bigDe(allocationAmount).add(sumStock))
							.subtract(selected.get(s.getKey()).getStorePreviousDay())
							.setScale(0, RoundingMode.HALF_UP);
					return value;
				}, (s1, s2) -> s1, LinkedHashMap::new));
		return map;
	}

	// step 4
	private static Map<Long, BigDecimal> getFinalAmountAllocated(Map<Long, BigDecimal> amountAllocated,
			Map<Long, Store> stores, Integer allocationAmount) {
		
		BigDecimal sumAmountAllocated = amountAllocated.entrySet().stream().map(e -> e.getValue()).reduce(bigDe(0),
				(a, b) -> a.add(b));
		System.out.println("sum amount located: "+ sumAmountAllocated);
		
		BigDecimal sumExpectedSale = stores.entrySet().stream().map(e -> e.getValue().getExpectedSales()).reduce(bigDe(0),
				(a, b) -> a.add(b));
		System.out.println("sum expected sale: "+ sumExpectedSale);
		
		BigDecimal sumStock = stores.entrySet().stream().map(e -> e.getValue().getStorePreviousDay()).reduce(bigDe(0),
				(a, b) -> a.add(b));
		System.out.println("sum expected sale: "+ sumStock);
		
					Map<Long, BigDecimal> demand = stores.entrySet().stream().map(Entry::getValue)
					.collect(Collectors.toMap(Store::getStoreId, s -> {
						BigDecimal value =s.getExpectedSales().subtract(s.getStorePreviousDay()).setScale(0,RoundingMode.HALF_UP);
						return value;
					}, (s1, s2) -> s1, LinkedHashMap::new));
		return demand ;

	}
	
	private static BigDecimal bigDe(long value) {
		return BigDecimal.valueOf(value);
	}


}