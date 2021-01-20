package ex03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;


public class Ex03 {
	public static void main(String[] args) {
		System.out.println(isAnagram("word", "Dorww"));
		
		List<String> maxAppear = maxAppear("aaaabaccccbbbddc");
		maxAppear.forEach(e -> System.out.println(e));
	}
	
	public static boolean isAnagram (String string1, String string2) {
		List<String> charactersString1 = Arrays.asList(string1.split("")).stream()
															.map(character -> character.toUpperCase())
															.sorted()
															.collect(Collectors.toList());
		List<String> charactersString2 = Arrays.asList(string2.split("")).stream()
				.map(character -> character.toUpperCase())
				.sorted()
				.collect(Collectors.toList());
		
		boolean check = true;
		if (charactersString1.size() != charactersString2.size()) {
			return false;
		}
		for (int i =0; i< charactersString1.size() ; i++) {
			if (!charactersString1.get(i).equals(charactersString2.get(i))) {
				check = false;
				return check;
			}
		}
		return check;
	}
	
	public static List<String> maxAppear (String s) {
		Map<String, Integer> result = new HashMap<String, Integer>();
		List<String> data = Arrays.asList(s.split(""));
        data.forEach(element -> {
			if (result.get(element) == null) {
				result.put(element, 1);
			} else {
				result.put(element, result.get(element) + 1);
			}
		});
		List<Entry<String,Integer>> handler = result.entrySet().stream()
													.sorted(Comparator.comparing(Entry::getValue,Comparator.reverseOrder()))
													.collect(Collectors.toList());
		
		List<String> maxAppearChar = new ArrayList<String>();
		maxAppearChar.add(handler.get(0).getKey());
		for (int i = 1 ; i < handler.size(); i++) {
			if (handler.get(i).getValue() < handler.get(i -1).getValue()) {
				break;
			}
			
			maxAppearChar.add(handler.get(i).getKey());
		}
		return maxAppearChar;
	}
}
