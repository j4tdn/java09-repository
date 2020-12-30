package stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import bean.Apple;
import service.AppleService;
import service.AppleServiceImpl;

public class Ex03Mapping {
	
	private static AppleService service = new AppleServiceImpl();
	private static List<Apple> inventory = service.getAll();
	
	public static void main(String[] args) {
		List<String> ids = inventory.stream()
									.map(Apple::getId)
									.collect(Collectors.toList());
		
		List<List<String>> cards = Arrays.asList(
						Arrays.asList("2 ro", "3 bich", "4 chuon"),
						Arrays.asList("5 co", "9 bich", "2 chuon"),
						Arrays.asList("A co", "J bich", "8 chuon"));
		
		List<String> result = cards.stream()
								.flatMap(Collection::stream)
								.filter(card -> card.startsWith("2"))
								.collect(Collectors.toList());
		result.forEach(System.out::println);
	}
}
