package stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Pattern;import java.util.stream.Collector;
import java.util.stream.Collectors;

import bean.Apple;
import service.AppleService;
import service.AppleServiceImpl;

public class Ex02FilteringAndSlicing {
	
	private static final AppleService service;
	
	static {
		service = new AppleServiceImpl();
	}
	
	public static void main(String[] args) {
		
		//shallow compare => string pool
		String[] data = Pattern.compile("[,\\s]+")
				.splitAsStream("a, b, c, d, e")
				.distinct()
				.skip(1)
				.limit(3)
				.toArray(String[]::new);
		
		Arrays.stream(data)
				.forEach(System.out::println);

		System.out.println("\n==================");
		
		//inventory
		List<Apple> inventory = service.getAll();
		inventory.stream()
				 .distinct()//depend on hash code, equals
				 .forEach(System.out::println);
		
		System.out.println("=====================");
		
		//distinct by origin
		//using distincBy()
		inventory.stream()
			.filter(distinctBy(apple -> apple.getOrigin()))
			.forEach(System.out::println);;
		
		System.out.println("=====================");
		//using map
		Map<String, Apple> map = inventory.stream()
				.collect(Collectors.toMap(
								Apple::getOrigin,
								Function.identity(),
								(v1, v2) -> v1,
								LinkedHashMap::new));
		map.entrySet().stream().forEach(System.out::println);
	}
	
	private static <T, R> Predicate<T> distinctBy(Function<T, R> function){
		Set<R> elements = new HashSet<R>();
		return t -> elements.add(function.apply(t));
	}
}
