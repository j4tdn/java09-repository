package bt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex03 {
	public static void main(String[] args) {
		System.out.println("1:result:");
		System.out.println(isAnagram("World", "aorlw"));
		System.out.println("2:result:");
		List<Character> t = getLetters("aaaabbaccdeeedddd");
		t.forEach(System.out::print);
	}

	private static boolean isAnagram(String old, String news) {
		if (old.length() != news.length()) {
			return false;
		}
		old = old.toLowerCase();
		news = news.toLowerCase();
		char[] c1 = old.toCharArray();
		char[] c2 = news.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);

		for (int i = 0; i < c1.length; i++) {
			if (c1[i] != c2[i]) {
				return false;
			}
		}

		return true;
	}

	private static List<Character> getLetters(String in) {
		List<Character> result = new ArrayList<Character>();
		Set<Character> letterUniques = new HashSet<Character>();
		char[] c = in.toCharArray();
		for (char i : c) {
			letterUniques.add(i);
		}

		List<Integer> counts = new ArrayList<Integer>();
		int count = 0;
		for (Character item : letterUniques) {
			for (char c1 : c) {
				if (item == c1) {
					count++;
				}
			}
			counts.add(count);
			count = 0;
		}

		int max = counts.get(0);
		for (Integer item : counts) {
			if (item >= max) {
				max = item;
			}
		}
		int index = 0;
		for (Character i : letterUniques) {
			if (counts.get(index++) == max) {
				result.add(i);
			}
		}

		return result;

	}
}
