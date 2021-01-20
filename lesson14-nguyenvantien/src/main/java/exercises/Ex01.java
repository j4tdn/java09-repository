package exercises;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Ex01 {
	public static void main(String[] args) {
//		int[] arr = {1, 2, 3, 4, 5, 6, 5, 5, 3, 1};
		int[] arr = {5, 7, 9, 10, 20, 9, 7, 11};
		Map<Integer, Integer> map1 = getMap(arr);
		Map<Integer, Integer> map2 = getMap(arr);
		map1.entrySet().stream().filter(v -> v.getValue() == 1).map(m -> m.getKey()).forEach(System.out::println);
		map2.entrySet().stream().filter(v -> v.getValue()  != 1).map(m -> m.getKey()).forEach(System.out::println);
	}
	
	public static Map<Integer, Integer> getMap(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		Arrays.stream(arr).forEach(a -> {
			if(!map.containsKey(a)) {
				map.put(a, 1);
			}else {
				map.replace(a,2);
			}
		});
		return map;
	}
}
