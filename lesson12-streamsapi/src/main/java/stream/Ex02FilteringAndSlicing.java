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
		
		//shallow compare => string pool
		String[] data = Pattern.compile("[,\\s]+")
				.splitAsStream("a, b, c, d, e")
				.distinct()
				.skip(1)
				.limit(3)
				.toArray(String[]::new);
		
		Arrays.stream(data)
				.forEach(System.out::println);

		System.out.println("\n==================");
		
		//inventory
		List<Apple> inventory = service.getAll();
		inventory.stream()
				 .distinct()
				 .forEach(System.out::println);
	}
}
