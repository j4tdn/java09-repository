package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Ex03 {
	public static void main(String[] args) {
		String a = "Hello";
		String b = "Hello0";
		System.out.println(isEqual(a, b));
		
		List<Character> result = getCharWithLengthMax("aaaccdcee");
		System.out.println(result);
		
	}
	
	private static boolean isEqual(String a, String b) {
		if(a.length() != b.length()) {
			return false;
		}
		char[] a1 = a.toLowerCase().toCharArray();
		char[] b1 = b.toLowerCase().toCharArray();
		Arrays.sort(a1);
		Arrays.sort(b1);
		for (int i = 0; i < b1.length; i++) {
			if(a1[i] != b1[i]) {
				return false;
			}
		}
		return true;
	} 
	
	private static List<Character> getCharWithLengthMax(String str) {
		
		List<Character> re = new ArrayList<>();
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			if(!map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), 1);
			} else {
				map.replace(str.charAt(i), Integer.sum(map.get(str.charAt(i)), 1));
			}
		}
		Optional<Entry<Character, Integer>> maxEntry = map.entrySet().stream().reduce(new BinaryOperator<Map.Entry<Character,Integer>>() {

			@Override
			public Entry<Character, Integer> apply(Entry<Character, Integer> t, Entry<Character, Integer> u) {
				return t.getValue().compareTo(u.getValue()) > 0 ? t : u;
			}
		});
		return map.entrySet().stream().filter(m ->m.getValue() == maxEntry.get().getValue())
				.map(t -> t.getKey())
				.collect(Collectors.toList());
		
	}
}
