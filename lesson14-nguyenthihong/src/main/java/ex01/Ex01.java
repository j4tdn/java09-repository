package ex01;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Ex01 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 5, 5, 3, 1);
		Map<Integer, Long> map = groupElements(numbers);
		// 1. cac phan tu xuat hien 1 lan
		List<Integer> uniqueElements = getResult(map, t -> t.getValue() == 1);
		uniqueElements.forEach(System.out::println);

		// 2. cac phan tu xuat hien > 1 lan
		List<Integer> duplicateElement = getResult(map, t -> t.getValue() > 1);
		duplicateElement.forEach(System.out::println);
	}

	public static Map<Integer, Long> groupElements(List<Integer> numbers) {
		Map<Integer, Long> result = numbers.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		return result;
	}

	public static List<Integer> getResult(Map<Integer, Long> map, Predicate<Entry<Integer, Long>> predicate) {
		return map.entrySet().stream().filter(t -> predicate.test(t)).map(Entry::getKey).collect(Collectors.toList());
	}

}
