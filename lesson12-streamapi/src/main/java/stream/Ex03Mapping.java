package stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import bean.Apple;
import service.AppleServiceImpl;

public class Ex03Mapping {
	private static AppleServiceImpl service;
	private static List<Apple> inventory;

	static {
		service = new AppleServiceImpl();
		inventory = service.getAll();
	}

	public static void main(String[] args) {
		List<String> ids = inventory.stream().map(Apple::getId).collect(Collectors.toList());
		ids.forEach(System.out::println);

		List<List<String>> cards = Arrays.asList(Arrays.asList("2 rô", "3 bích", "4 chuồn"),
				Arrays.asList("2 chuồn", "3 cơ", "4 rô"), Arrays.asList("5 bích", "3 rô", "4 chuồn"));
		List<String> heo = cards.stream().flatMap(Collection::stream).filter(s -> s.startsWith("2"))
				.collect(Collectors.toList());
		heo.forEach(System.out::println);

		List<List<String>> test = cards.stream().filter(t -> t.stream().anyMatch(x -> x.startsWith("2")))
				.collect(Collectors.toList());
		test.forEach(t -> t.forEach(x -> System.out.print(x + ",")));
	}
}
