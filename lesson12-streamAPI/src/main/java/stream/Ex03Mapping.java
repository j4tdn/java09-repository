package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import bean.Apple;
import service.AppleService;
import service.AppleServiceImpl;

public class Ex03Mapping {
	private static List<Apple> inventory;
	private static AppleService service ;
	static {
		service = new AppleServiceImpl();
		inventory = service.getAll();
	}
	public static void main(String[] args) {
		List<String> ids = inventory.stream()
								.map(Apple::getId)
//								.forEach(t -> System.out.println(t));
								.collect(Collectors.toList());
		ids.forEach(t -> System.out.println(t));
		
		List<List<String>> cards = Arrays.asList(
				Arrays.asList("2 ro","3 bich","4 chuon"),
				Arrays.asList("4 ro","5 bich","7 chuon"),
				Arrays.asList("3 ro","8 bich","10 chuon")
				);
		
		List<String> result = cards.stream()
				.flatMap(t -> t.stream())
				.filter(card -> card.startsWith("2"))
				.collect(Collectors.toList());
		result.forEach(card -> System.out.println(card + " "));
	}
	
	
}
