package stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import javax.naming.spi.DirStateFactory.Result;

import bean.Apple;
import service.AppleService;
import service.AppleServiceImpl;

public class Ex03Mapping {
	private static List<Apple> inventory;	
	private static AppleService service;
	
	static {
		service = new  AppleServiceImpl();
		inventory = service.getAll();
	}
public static void main(String[] args) {
	List<Integer> ids = inventory.stream() // stream <apple>
			.map(Apple::getId) //stream <string>
			.map(String::length) //stream <integer>
			.collect(Collectors.toList()); //string <integer>
	ids.forEach(id -> System.out.println(id+ " "));

	//flatMap
List<List<String>> cards = Arrays.asList(
			Arrays.asList("2 r", "3 b", "4 c"),
			Arrays.asList("4 r", "5 b", "4 c"),
			Arrays.asList("3 r", "8 b", "2 c")
		);

		List<String> result = cards.stream() // Stream<List<List<STring>>
		.flatMap(Collection::stream) // Stream<String>
		.filter(card -> card.startsWith("2"))
		.collect(Collectors.toList()); //List<String>
		
		result.forEach(card -> System.out.println(card + " "));

}


}
