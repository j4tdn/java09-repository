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
import java.util.stream.Collector;
import java.util.stream.Collectors;

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
		System.out.println();
		System.out.println("===================");
		List<Apple> inventory = service.getAll();
		inventory.stream()
		.distinct()
		.forEach(System.out::println);
		//homework distinct by origin
		System.out.println("===================");
		
		
		inventory.stream().
		filter(distinctBy(Apple::getOrigin))
		.forEach(System.out::println);
		System.out.println("=====================");
	//using map
		
		Map<String,Apple> map = inventory.stream()
				.collect(Collectors.toMap(
						Apple::getOrigin,
						Function.identity(), 
						(v1,v2) -> v1, 
						LinkedHashMap::new));
		map.entrySet().stream().forEach(System.out::println);
		
		
		
		
		
	}
	
	private static<T, R> Predicate<T> distinctBy(Function<T, R> funtion){
		Set<R> origins = new HashSet<>();
		return t->origins.add(funtion.apply(t));
		
	}
}
