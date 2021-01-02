package stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import java.util.stream.Collector;
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
		String[] data = Pattern.compile("[,\\s]+")
		.splitAsStream("a,b,c,d,b,c")
		.distinct()
		.limit(2)
		.skip(1)
		.toArray(new IntFunction<String[]>() {// hoac String[]::new
			@Override
			public String[] apply(int length) {
				System.out.println(length );
				return new String[length]; 
			}
		});
		Arrays.stream(data).forEach(item -> System.out.print(item+" "));
		System.out.println();
		List<Apple> inventory = service.getAll();
		inventory.stream().distinct().forEach(System.out::println);
		//distinct:depend on hashcode,equal
		System.out.println("=============================");
		
		//using distinct by
		inventory.stream()
				.filter(distinctBy(Apple::getColor))//== apple -> apple.getOrigin()
				.forEach(System.out::println);
		
		//using map
		//convert from list to map
		//y tuoong la tao 2
		Map<String, Apple> map = inventory.stream()
									.collect(Collectors.toMap(Apple::getId,Function.identity() ,
											(v1,v2) -> v1, LinkedHashMap::new));
		//Apple::getId == a -> a.getId
		//Function.identity() == a -> a
		//v1,v2 == merge function(vo merge function coi)
		//LinkedHashMap::new == Supplier (truyen vao cai void, tra ve linkHashmap) ==
		
//		Supplier<HashMap<String, Apple>> supplier = new Supplier<HashMap<String,Apple>>() {
//			@Override
//			public HashMap<String, Apple> get() {
//				return new HashMap<String, Apple>();
//			}
//		};
		
		
	}
	
	private static <T,R> Predicate<T> distinctBy(Function<T, R> function){
		Set<R> origins = new HashSet<R>();
		return t -> origins.add(function.apply(t));
	}
		

	
}
