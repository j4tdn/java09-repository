package stream;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import bean.Apple;
import service.AppleService;
import service.AppleServiceImpl;

public class Ex02FilteringAndSlising {
	private static AppleService service;

	static {
		service = new AppleServiceImpl();
	}

	public static void main(String[] args) {
		String[] data = Pattern.compile("[,\\s]+").splitAsStream("a,b,c,d")

				.distinct().skip(1).limit(3).toArray(String[]::new);
		;
//		Arrays.stream(data).forEach(item->SystemAppleprintln(item+" "));

		List<Apple> inventory = service.getAll();
		inventory.stream().distinct().forEach(System.out::println);
// 		using distinct by
		System.out.println("==============");
		inventory.stream().filter(distinctBy(Apple::getColor)).forEach(System.out::println);
//	 	using map
		System.out.println("==============");
		Map<String, Apple> map = inventory.stream().collect(Collectors.toMap(
				Apple::getColor,
				Function.identity(),
				(v1,v2) -> v1,
				LinkedHashMap :: new));
	}

	private static <T, R> Predicate<T> distinctBy(Function<T, R> function) {
		Set<R> origins = new HashSet<>();
		return t -> origins.add(function.apply(t));
	}
}