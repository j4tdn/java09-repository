package exercises;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		int n = 2;
		String string = "aa6b546c6e22h";
		String[] result = getLargestNumbers(n, string);
		for(String s : result) {
			System.out.println(s);
		}
		
	}
	
	private static String[] getLargestNumbers(int n, String string) {
		String[] splitedStrings = string.split("[^\\d]+");
		int[] convertedStrings = Arrays.stream(splitedStrings)
				.filter(s -> !s.isEmpty())
				.mapToInt(Integer::parseInt)
				.toArray();
		for(int i = 0; i < convertedStrings.length - 1; i++) {
			for(int j = i + 1; j < convertedStrings.length; j++) {
				if(convertedStrings[i] > convertedStrings[j]) {
					int tmp = convertedStrings[i];
					convertedStrings[i] = convertedStrings[j];
					convertedStrings[j] = tmp;
				}
			}
		}
		
		if(n > convertedStrings.length) {
			n = convertedStrings.length;
		}
		
		String[] result = new String[n];
		int count = 0;
		for(int i = convertedStrings.length - n; i < convertedStrings.length; i++) {
			result[count++] = String.valueOf(convertedStrings[i]);
		}
		
		return result;
	}
}
