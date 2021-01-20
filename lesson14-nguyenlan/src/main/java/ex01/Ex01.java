package ex01;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex01 {
	public static void main(String[] args) {
		Integer[] N = {1, 2, 3, 4, 5, 6, 5, 3, 1};
		getUniqueNumbers(N);
	}
	
	private static void getUniqueNumbers(Integer[] n) {
		Collection<Integer> list = Arrays.asList(n); 
		List<Integer> result = list.stream().distinct().collect(Collectors.toList());
		result.forEach(System.out::println);
	}
}
