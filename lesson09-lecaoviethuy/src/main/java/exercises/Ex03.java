package exercises;

import java.util.ArrayList;
import java.util.List;

public class Ex03 {
	
	private static int[] flags;
	private static char[] characters;
	private static char[] mixedString;
	private static List<String> result;
	public static void main(String[] args) {
		String string = "xyz";
		String[] result = permutation(string);
		for(String s : result) {
			System.out.println(s);
		}
	}
	
	private static String[] permutation(String string) {
		characters = string.toCharArray();
		flags = new int[characters.length];
		mixedString = new char[characters.length];
		result = new ArrayList<>();

		mix(0);
		return result.toArray(String[]::new);
	}

	private static void mix(int count) {
		if(count == characters.length) {
			result.add(String.valueOf(mixedString));
			return;
		}
		
		for(int i = 0; i < characters.length; i++) {
			if(flags[i] == 0) {
				flags[i] = 1;
				mixedString[count++] = characters[i];
				mix(count);
				count--;
				flags[i] = 0;
			}
		}
	}
}
