package ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex01 {
	public static void main(String[] args) {
		List<Integer> data = Arrays.asList(5 ,7 ,9 ,10 ,20 ,9 ,7 ,11);
		List<Integer> result1 = getElementAppearOnce(data);
		
		List<Integer> result2 = getElementAppearTimes(data);
		result2.forEach(e -> System.out.println(e));
	}
	
	public static Map<Integer, Integer> handlerData (List<Integer> data){
		Map<Integer, Integer> result = new HashMap<Integer, Integer>();
		data.forEach(element -> {
			if (result.get(element) == null) {
				result.put(element, 1);
			} else {
				result.put(element, result.get(element) + 1);
			}
		});
		
		return result;
	}
	
	public static List<Integer> getElementAppearOnce(List<Integer> data) {
		Map<Integer, Integer> result = handlerData(data);
		return result.entrySet().stream().filter(e -> e.getValue() == 1).map(e -> e.getKey()).collect(Collectors.toList());
	}
	
	public static List<Integer> getElementAppearTimes (List<Integer> data) {
		Map<Integer, Integer> result = handlerData(data);
		return result.entrySet().stream().filter(e -> e.getValue() > 1).map(e -> e.getKey()).collect(Collectors.toList());
	}
	
}
