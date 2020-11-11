package exercises;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		int n = 2;
		String string = "01a2b3456cde478";
		
		String[] splitedStrings = string.split("[^\\d]+");
		int[] convertedStrings = Arrays.stream(splitedStrings).mapToInt(Integer::parseInt).toArray();
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
		
		for(int i = convertedStrings.length - n; i < convertedStrings.length; i++) {
			System.out.println(convertedStrings[i]);
		}
	}
}
