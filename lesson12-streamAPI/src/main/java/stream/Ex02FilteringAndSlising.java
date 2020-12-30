package stream;

import java.util.Arrays;
import java.util.Collection;
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
import service.AppleServiceimpl;

public class Ex02FilteringAndSlising {
	private static AppleService service;

	static {
		service = new AppleServiceimpl();
	}

	public static void main(String[] args) {
		String[] data = Pattern.compile("[,\\s]+").splitAsStream("a,b,c,d")

				.distinct().skip(1).limit(3).toArray(String[]::new);
//		Arrays.stream(data).forEach(item->SystemAppleprintln(item+" "));

		List<Apple> inventory = service.getAll();
		inventory.stream().distinct().forEach(System.out::println);

		System.out.println("--------distinct by origin-----------");
		Set<String> origins = new HashSet<>();
		inventory.stream().filter(distinctBy(Apple::getOrigin)).forEach(System.out::println);
		
		System.out.println("----------using map--------------");
		Map<String, Apple> map = inventory.stream()
				.collect(Collectors.toMap(Apple::getOrigin,
				Function.identity(), 
				(v1, v2) -> v1, 
				LinkedHashMap::new));

		map.entrySet().stream().forEach(System.out::println);

	}

	
	private static <T,R> Predicate<T> distinctBy(Function<T,R> function) {
		Set<R> origins = new HashSet<>();
		return t-> origins.add(function.apply(t));
		
	}
}