package stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import bean.Apple;
import service.AppleService;
import service.AppleServiceImpl;

public class Ex03Mapping {
	private static AppleService service;
	private static List<Apple> inventory;
	static {
		inventory = service.getAll();
		service = new AppleServiceImpl();
	}
	public static void main(String[] args) {
		List<Integer> ids = inventory.stream() // Stream<Apple>
				.map(Apple::getId) // Stream<String>
				.map(String::length)
				.collect(Collectors.toList()); // 
		ids.forEach(id -> System.out.print(id + " "));
		
		List<List<String>> cards = Arrays.asList(
				Arrays.asList("2 rô", " 3 bích", "4 chuồng"),
				Arrays.asList("4 rô", " 5 bích", "7 chuồng"),
				Arrays.asList("3 rô", " 8 bích", "2 chuồng")
				);
		List<String> result = cards.stream() // Stream<List<String>>
		.flatMap(Collection::stream) // Stream<String>
		.filter(card -> card.startsWith("2"))
		.collect(Collectors.toList()); // List<String>
	}
}
