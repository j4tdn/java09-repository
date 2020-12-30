package stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
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
		List<String> ids = inventory.stream()
					.map(Apple::getId)
					.collect(Collectors.toList());
		
		List<List<String>> cards = Arrays.asList(
				Arrays.asList("2 rô", "3 bích", "10 chuồn"),
				Arrays.asList("4 rô", "5 bích", "9 chuồn"),
				Arrays.asList("3 cơ", "8 bích", "2 chuồn")
				);
		List<String> result = cards.stream() //Stream<List<String>>
			.flatMap(Collection::stream) //Stream<String>
			.filter(card -> card.startsWith("2"))
			.collect(Collectors.toList()); //List<String>
		result.forEach(card -> System.out.print(card + "  "));
	}
	
}
