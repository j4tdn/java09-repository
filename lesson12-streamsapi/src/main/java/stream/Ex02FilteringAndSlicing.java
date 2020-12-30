package stream;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

import bean.Apple;
import service.AppleService;
import service.AppleServiceImpl;

public class Ex02FilteringAndSlicing {
	
	private static final AppleService service;
	
	static {
		service = new AppleServiceImpl();
	}
	
	public static void main(String[] args) {
		String[] data = Pattern.compile("[,\\s]+")
				.splitAsStream("a, b, c, b")
				.distinct()
				.toArray(String[]::new);
		Arrays.stream(data).forEach(System.out::println);
		
		System.out.println("====================");
		
		// inventory
		List<Apple> inventory = service.getAll();
		inventory.stream().distinct().forEach(System.out::println);
		
		//homework: distinct by color, origin
	}
}
