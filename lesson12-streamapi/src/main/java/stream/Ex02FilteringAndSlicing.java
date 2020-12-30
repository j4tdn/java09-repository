package stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import bean.Apple;
import service.AppleService;
import service.AppleServiceImpl;

public class Ex02FilteringAndSlicing {
	private static final AppleService SERVICE;
	static {
		SERVICE = new AppleServiceImpl();
	}

	public static void main(String[] args) {
		String[] data = Pattern.compile("[,\\s]+").splitAsStream("a, b, c, d, b, c").distinct().skip(2)
				.toArray(String[]::new);

		Arrays.stream(data).forEach(item -> System.out.print(item + "   "));
		System.out.println("\n=========================");

		// inventory
		List<Apple> inventory = SERVICE.getAll();
		inventory.stream().distinct() // depends on hash code, equal
				.forEach(System.out::println);

		// homework: distinct by origin, color
		//
		System.out.println("======distinct by origin======");
		Set<String> origins = new HashSet<>();
		inventory.stream().filter(distinctBy(Apple::getOrigin)).forEach(System.out::println);

		// Using map
		System.out.println("======distinct by origin Using Map======");

		Map<String, Apple> map = inventory.stream()
				.collect(Collectors.toMap(Apple::getOrigin,
						Function.identity(),
						(v1,v2) -> v1,
						LinkedHashMap::new));
		map.entrySet().stream()
			.forEach(System.out::println);

	}

	/*
	 * <T> property's holder type <R> given property type to distinct
	 * 
	 */
	private static <T, R> Predicate<T> distinctBy(Function<T, R> function) {
		Set<R> origins = new HashSet<>();
		return t -> origins.add(function.apply(t));
	}

}
