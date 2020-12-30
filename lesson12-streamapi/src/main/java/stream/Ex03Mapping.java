package stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import bean.Apple;
import service.AppleService;
import service.AppleServiceImpl;

public class Ex03Mapping {
	private static List<Apple> inventory;
	private static AppleService service;
	static {
		service = new AppleServiceImpl();
		inventory = service.getAll();
	}

	public static void main(String[] args) {
		List<String> ids = inventory.stream().map(Apple::getId)
				.collect(Collectors.toList());
		
		ids.forEach(id -> System.out.print(id + " "));

		List<List<String>> cards = Arrays.asList(
				Arrays.asList("2 ro", "3 bich", "4 chuon"),
				Arrays.asList("2 co", "3 bich", "4 chuon"), 
				Arrays.asList("2 bich", "3 bich", "4 chuon"));
		List<String> result = cards.stream().
				flatMap(Collection::stream).
				filter(card -> card.startsWith("2"))
				.collect(Collectors.toList());
		result.forEach(System.out::println);
	}
}
