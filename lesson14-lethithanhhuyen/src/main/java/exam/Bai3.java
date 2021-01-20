package exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bai3 {
	public static void main(String[] args) {
		String s1 = "Word";
		String s2 = "Wodr";
		System.out.println("1.Có phải là đảo ngữ không: " + anagram(s1, s2));
		
		System.out.println("2.Số kí tự xuất hiện nhiều lần nhất");
		String s = "aaabbcccsa";
		List<Character> res = max(s);
		res.forEach(System.out::println);
	}
	
	private static boolean anagram(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		for (int i=0; i<s1.length(); i++) {
			if (!s2.contains(String.valueOf(s1.charAt(i)))) {
				return false;
			}
		}
		return true;
	}
	
	private static List<Character> max(String s) {
		List<Character> res = new ArrayList<>();
		char[] distinctChar = new char[s.length()];
		int[] countChar = new int[s.length()];
		int dem = 0;
		char[] sequences = s.toCharArray();
		Arrays.sort(sequences);
		int i=0;
		int count = 1;
		while (i<sequences.length){
			distinctChar[dem] = sequences[i];
			while (sequences[i] == sequences[i+1]) {
				count++;
				i++;
			}
			countChar[dem] = count;
			count = 1;
			dem++;
		}
		int max = 0;
		for (int count2:countChar) {
			if (max < count2) {
				max = count2;
			}
		}
		
		for (int j=0; j<dem; j++) {
			if (max == countChar[j]) {
				res.add(distinctChar[j]);
			}
		}
		return res;
	}
}
