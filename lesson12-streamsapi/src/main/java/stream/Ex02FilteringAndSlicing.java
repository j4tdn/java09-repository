package stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

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
		
		System.out.println("------------------------------------");
		//homework:distinct by origin
		inventory.stream().filter(distinctBy(Apple::getColor))
		.forEach(System.out::println);
		
		//using map
		Map<String, Apple> map=inventory.stream().collect(
				Collectors.toMap(Apple::getOrigin,
						Function.identity(), 
						(v1, v2)->v1,LinkedHashMap::new));
		
		map.entrySet().stream().forEach(System.out::println);
		
	
	}
	
	private static <T,R> Predicate<T> distinctBy(Function<T, R> func) {
		Set<R> origins=new HashSet<R>();
		return t->origins.add(func.apply(t));
	}
}
