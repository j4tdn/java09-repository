package stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.swing.Box.Filler;

import bean.Apple;
import service.AppleService;
import service.AppleServiceImpl;

public class Ex03Mapping {
	private static AppleService service;
	private static List<Apple> inventory;
	static {
		service = new AppleServiceImpl();

		inventory = service.getAll();
	}

	public static void main(String[] args) {
		List<Integer> ids = inventory.stream().map(Apple::getId).map(String::length).collect(Collectors.toList());

		ids.forEach(id -> System.out.println(id + ""));

		System.out.println("====================");

		List<List<String>> cards = Arrays.asList(Arrays.asList("2 rô", "3 bich", "4 chuon"),
				Arrays.asList("4 rô", "5 bich", "7 chuon"), Arrays.asList("3 cơ", "8 bich", "2 chuon"));
		List<String> results = cards.stream()
				.flatMap(Collection::stream)
				.filter(card -> card.startsWith("2"))
				.collect(Collectors.toList());

		results.forEach(card -> System.out.println(card + " "));
	}

}
