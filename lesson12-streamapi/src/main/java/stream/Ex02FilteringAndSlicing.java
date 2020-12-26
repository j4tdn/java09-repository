package stream;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

import bean.Apple;
import service.AppleService;
import service.AppleServiceImpl;

public class Ex02FilteringAndSlicing {
	private static final AppleService SERVICE;
	static {
		SERVICE = new AppleServiceImpl();
	}
	public static void main(String[] args) {
		String[] data = Pattern.compile("[,\\s]+")
			.splitAsStream("a, b, c, d, b, c")
			.distinct()
			.skip(2)
			.toArray(String[]::new);
		
		Arrays.stream(data)
			.forEach(item -> System.out.print(item + "   "));
		System.out.println("=========================");
		
		//inventory
		List<Apple> inventory = SERVICE.getAll();
		inventory.stream().distinct()  // depends on hash code, equal
		    .forEach(System.out::println);
	}
}
