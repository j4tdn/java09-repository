package exercises;

import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex03 {
	public static void main(String[] args) {
		// 1. Kiểm tra 2 chuỗi Strings có phải là đảo ngữ (anagram) của nhau không
		String input1 = "Wokf";
		String input2 = "fKwO";
		String input3 = "Wookf";
		
		boolean isAnagram = isAnagram(input1, input3);
		System.out.println("2 chuoi 1 va 3 " + (isAnagram ? "la" : "khong") + " la anagram");

		boolean isAnagram2 = isAnagram(input1, input2);
		System.out.println("2 chuoi 1 va 2 " + (isAnagram2 ? "la" : "khong") + " anagram");
		
		// 2.Tìm kiếm kí tự có số lần xuất hiện nhiều nhất trong chuỗi.
		System.out.println("===========================");
		String input = "aaaccdcee";
		Character[] result = getMaxDuplicatedCharacters(input);
		for(Character ch : result) {
			System.out.print(ch + " ");
		}
	}

	private static Character[] getMaxDuplicatedCharacters(String input) {
		Map<Character, Long> result = input.chars().mapToObj(i -> (char) i)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		Long maxDuplicateNumber = result.entrySet()
				.stream()
				.mapToLong(entry -> entry.getValue())
				.max()
				.orElse(-1L);
		
		if(maxDuplicateNumber == -1) {
			return null;
		}
		
		return result.entrySet()
				.stream()
				.filter(entry -> entry.getValue() == maxDuplicateNumber)
				.map(entry -> (char) entry.getKey())
				.toArray(Character[]::new);
	}

	private static boolean isAnagram(String input1, String input2) {
		if(input1 == null || input2 == null) {
			return false;
		}
		
		if(input1.length() != input2.length()) {
			return false;
		}
		
		input1 = input1.toLowerCase();
		input2 = input2.toLowerCase();
		
		Map<Character, Long> charsMap1 = countMap(input1);
		Map<Character, Long> charsMap2 = countMap(input2);
		
		if(charsMap1.size() != charsMap2.size()) {
			return false;
		}
		
		for(Entry<Character, Long> entry : charsMap1.entrySet()) {
			Character key = entry.getKey();
			if(entry.getValue() != charsMap2.get(key)) {
				return false;
			}
		}
		
		return true;
	}
	
	private static Map<Character, Long> countMap(String input) {
		Map<Character, Long> result = input.chars().mapToObj(i -> (char) i)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
			
		return result;
	}
}
