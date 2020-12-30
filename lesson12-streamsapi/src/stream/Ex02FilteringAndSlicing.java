package stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collector;
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
		List<Apple> inventory = service.getAll();

		inventory.stream().distinct().forEach(System.out::println);

		/*
		 * String[] data = Pattern.compile(",")
		 * .splitAsStream("a,j,fdg,ds,df,sd,e,r,vc,df") .toArray(String[]::new);
		 * 
		 * // distinct by color, origin
		 */

		// distinct by
		inventory.stream().filter(distinctBy(Apple::getColor)).forEach(System.out::println);

		// map
		System.out.println("========================");
		Map<String, Apple> map = inventory.stream()
				.collect(Collectors.toMap(Apple::getId, Function.identity(), (v1, v2) -> v1, LinkedHashMap::new));

		map.entrySet().stream().forEach(System.out::println);

		
		
	}

	private static <T, R> Predicate<T> distinctBy(Function<T, R> function) {
		Set<R> origins = new HashSet<R>();
		return t -> origins.add(function.apply(t));
	}

}