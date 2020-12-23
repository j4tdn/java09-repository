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
		service=new AppleServiceImpl();
	}
	public static void main(String[] args) {
		String[]data=Pattern.compile("[,\\s]+").splitAsStream("a,b,c,d,b")
				.distinct()
				.skip(2)
				.toArray(String[]::new );
		
		Arrays.stream(data).forEach(item -> System.out.println(item+"      "));
		
		
		List<Apple> inventory=service.getAll();
		inventory.stream().distinct() //depends on hashcode,equals
		.forEach(System.out::println);
		
		
		//homework:distinct by color,origin
	}
}
