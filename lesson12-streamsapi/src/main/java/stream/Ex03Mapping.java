package stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import bean.Apple;
import service.AppleService;
import service.AppleServiceImpl;

public class Ex03Mapping {
	private static AppleService service = new AppleServiceImpl();
	private static List<Apple> inventory;
	static {
		inventory = service.getAll();
	}

	public static void main(String[] args) {

		List<String> ids = inventory.stream().map(Apple::getId).collect(Collectors.toList());

		ids.forEach(id -> System.out.print(id + " "));

		List<List<String>> cards = Arrays.asList(Arrays.asList("2 ro", "3 bich", "4 chuon"),
				Arrays.asList("4 ro", "5 bich", "7 chuon"), Arrays.asList("3 co", "8 bich", "2 chuon"));
		
		List<String> result=cards.stream() //stream<list<str>>
		.flatMap(Collection::stream)//stream<str>
		.filter(card ->card.startsWith("2"))
		.collect(Collectors.toList());
		
		result.forEach(card -> System.out.print(card +"    "));

	}
}
