package stream;

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
		String[] data = Pattern.compile(",").splitAsStream("a,j,fdg,ds,df,sd,e,r,vc,df").distinct().skip(1).limit(3)
				.toArray(String[]::new);

		// using distinct by
		inventory.stream().filter(distinctBy(Apple::getColor)).collect(Collectors.toList())
				.forEach(System.out::println);
		System.out.println("--------------------");
		// using map
		Map<String, Apple> map = inventory.stream()
				.collect(Collectors.toMap(Apple::getColor, Function.identity(), (a1, a2) -> a1, LinkedHashMap::new));
		map.entrySet().stream().forEach(System.out::println);
	}

	private static <T, R> Predicate<T> distinctBy(Function<T, R> function) {
		Set<R> set = new HashSet<R>();
		return t -> set.add(function.apply(t));
	}
}