package stream;

import java.util.Arrays;
import java.util.Collections;
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
		service = new AppleServiceImpl();
	}
	
	public static void main(String[] args) {
		List<Apple> inventory = service.getAll();
		
		String[] data = Pattern.compile(",")
			.splitAsStream("a,j,fdg,ds,df,sd,e,r,vc,df")
			.toArray(String[]::new);
		
		System.out.println("==========");
		// distinct by color, origin
		Set<String> origins = new HashSet<String>();
		inventory.stream()
				.filter(distinctBy(Apple::getOrigin))
				.forEach(System.out::println);

		System.out.println("==========");
		Map<String, Apple> map = inventory.stream()
										.collect(Collectors.toMap(Apple::getOrigin, 
																Function.identity(), 
																(v1, v2) -> v1, 
																LinkedHashMap::new));
		map.entrySet().stream().forEach(System.out::println);
	}
	
	private static <T, R> Predicate<T> distinctBy(Function<T, R> function){
		System.out.println("in");
		Set<R> origins = new HashSet<R>();
		return t -> origins.add(function.apply(t));
	}
}
