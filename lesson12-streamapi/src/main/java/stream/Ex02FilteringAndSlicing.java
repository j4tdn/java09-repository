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
	private static final AppleService SERVICE;
	static {
		SERVICE = new AppleServiceImpl();
	}
	public static void main(String[] args) {
		String[] data = Pattern.compile("[,\\s]+").splitAsStream("a,b  ,c,d ,b,c ").skip(1).toArray(String[]::new);
		Arrays.stream(data).forEach( e -> System.out.print(e + " "));
		System.out.println(data.length);
		System.out.println("\n=======================");
		List<Apple> inventory = SERVICE.getAll();
		inventory.stream().distinct()  // depends on hash code, equals
		    .forEach(System.out::println);
		
		// homework : distinct by color, origin
		
		System.out.println("================================");
		Set<String> origins = new HashSet<>();
		inventory.stream().filter(distinctBy(Apple::getColor))
		                     .forEach(System.out::println);
		System.out.println("============================");
		//Using map
		Map<String, Apple> map = inventory.stream() // Stream <Apple>
		   .collect(Collectors.toMap(Apple::getOrigin, Function.identity(), (v1,v2)-> v1, LinkedHashMap::new));
		map.entrySet().stream().forEach(System.out::println);
	}
	
	/**
	 * 
	 * @param <T> generic type
	 * @param <R> given property type to distinct
	 * @param function
	 * @return
	 */
	private static <T,R> Predicate<T> distinctBy (Function<T, R>  function){
		Set<R> origins = new HashSet<R>();
		return t -> origins.add(function.apply(t));
	}
}
