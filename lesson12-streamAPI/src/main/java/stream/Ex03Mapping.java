package stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import bean.Apple;
import service.AppleService;
import service.AppleServiceimpl;

public class Ex03Mapping {
	private static AppleService service= new AppleServiceimpl();
	private static List<Apple> inventory;
	
	static {
		service = new AppleServiceimpl();
		inventory=service.getAll();
	}
 public static void main(String[] args) {
	List<Integer> ids=inventory.stream()
			.map(Apple::getId)
			.map(String::length)
			.collect(Collectors.toList());
	ids.forEach(id->System.out.println(id+ " "));
	System.out.println("-----------Tim bài bắt đầu có 2---------------");
	List<List<String>> cards= Arrays.asList(
			Arrays.asList("2 rô", "3 bich", "4 chuồn"),
			Arrays.asList("4 rô", "5 bich", "7 chuồn"),
			Arrays.asList("3 cơ", "8 bich", "4 chuồn")
			);
	List<String> result=cards.stream()// Stream<List<String>>
		.flatMap(Collection::stream)// Stream<String
		.filter(card-> card.startsWith("2"))
		.collect(Collectors.toList());//List<String>
	
	result.forEach(card-> System.out.print(card + " "));
		
}
}
