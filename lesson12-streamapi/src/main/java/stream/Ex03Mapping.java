package stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import bean.Apple;
import service.AppleServiceImpl;

public class Ex03Mapping {
	
	private static AppleServiceImpl service;
	
	static {
		service =new AppleServiceImpl();
		inventory= service.getAll();
	}
	private static List<Apple> inventory;
	
	public static void main(String[] args) {
		List<Integer> ids = inventory.stream()
				                    .map(Apple::getId).map(String::length).collect(Collectors.toList());
		ids.forEach(id -> System.out.println(id));
		
		System.out.println("==========");
		
		List<List<String>> cards = Arrays.asList(
				Arrays.asList("2 ro","3 bich", "4 chuon"),
				Arrays.asList("4 ro","5 bich", "7 chuon"),
				Arrays.asList("3 co","8 bich", "2 chuon")
		);
		
	    List<String> result = 	cards.stream()
		     .flatMap(Collection::stream)
		     .filter(card->card.startsWith("2"))
		     .collect(Collectors.toList());
	    
	    result.forEach(card -> System.out.println(card));
	}
}
