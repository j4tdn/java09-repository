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
	private static AppleService service;
	private static List<Apple> inventory;
	static {
		service=new AppleServiceImpl();
		inventory=service.getAll();
	}
	public static void main(String[] args) {
		List<Integer> ids=inventory.stream()//stream<apple>
				.map(Apple::getId) ///stream<string>
				.map(String::length)//stream<integer>
				.collect(Collectors.toList());//List<integer>
		
		ids.forEach(id->System.out.println(id+"  "));
	System.out.println("==========");
	//flatMap
		List<List<String>> cards=Arrays.asList(
				Arrays.asList("2 ro","3 bic", "4 chuon"),
				Arrays.asList("4 ro","5 bich", "7 chuon"),
				Arrays.asList("3 co","8 bich", "2 chuon")
				);
		
		List<String> result= cards.stream() ///tream<list<string>>
			  .flatMap(Collection::stream) ///tream<string>,card->card.stream()
			  .filter(card->card.startsWith("2"))
			  .collect(Collectors.toList()); ///list<stream>
		
		result.forEach(card->System.out.println(card+"   "));
	
	
	
	}
}
