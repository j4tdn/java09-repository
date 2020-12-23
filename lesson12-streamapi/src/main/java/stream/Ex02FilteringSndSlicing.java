package stream;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

import bean.Apple;
import service.AppleService;
import service.AppleServiceImpl;

public class Ex02FilteringSndSlicing {
	
private static final AppleService service;
static {
	service = new AppleServiceImpl();
}
	public static void main(String[] args) {
		String[] data=Pattern.compile("[,\\s]+")
		.splitAsStream("a,b,c,d,b,c")
		.distinct()
		.limit(2)
		.toArray(String[]::new);
		System.out.println("lenght"+data.length);
	
		Arrays.stream(data).forEach(item->System.out.print(item+ " "));
		System.out.println("===================");
		List<Apple> inventory = service.getAll();
		inventory.stream()
		.distinct()
		.forEach(System.out::println);
		
	}
	
}
