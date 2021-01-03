package stream;

import java.awt.HeadlessException;
import java.util.Arrays;
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
import java.util.stream.Collectors;

import javax.swing.text.Position.Bias;

import bean.Apple;
import service.AppleService;
import service.AppleServiceImpl;

public class Ex02FilteringAndSlicing {
	
	private static final AppleService service;
	
	static {
		service = new AppleServiceImpl();
	}
	
	public static void main(String[] args) {
		// shallow compare => string pool
		String[] data = Pattern.compile("[,\\s]+")
			  .splitAsStream("a, b, c, d, e")
			  .distinct()
			  .skip(1)
			  .limit(3)
			  .toArray(String[]::new);
		
		Arrays.stream(data)
			  .forEach(item -> System.out.print(item + "   "));
	
		System.out.println("\n============");
		
		// inventory
		List<Apple> inventory = service.getAll();
		inventory.stream()
				 .distinct() // depends on hash code, equals
			     .forEach(System.out::println);
		
		System.out.println("===========distinct by origin============");
		
		// homework: distinct by origin
		
		// Using distinct by
		inventory.stream()
			.filter(distinctBy(Apple::getColor))
			.forEach(System.out::println);
		
		// Using map
		Map<String, Apple> map = inventory.stream()
			.collect(Collectors.toMap(
					Apple::getId, 
					Function.identity(), 
					(v1, v2) -> v1, 
					LinkedHashMap::new));
		
		map.entrySet().stream()
			.forEach(System.out::println);
		
	}
	/**
	 * 
	 * @param <T> property's holder type
	 * @param <R> given property type to distinct
	 */
	private static <T, R> Predicate<T> distinctBy(Function<T, R> function) {
		Set<R> origins = new HashSet<>();
		return t -> origins.add(function.apply(t));
	}
}
