package ex02;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int n = 3;
		String[] strings = new String[n];
		strings[0] = "01a2b3456csd12";
		strings[1] = "01a2b356csd123";
		strings[2] = "a";
		

		
		String[] result = getLargestNumbers(strings);
		for (String string : result) {
			System.out.println(string);
		}
		
		
	}
	
	
	private static String[] getLargestNumbers(String[] strings) {
		String[] result = new String[strings.length];
		int max = 0;
		int[] maxNumber = new int[strings.length];
		
		for (int i = 0; i < strings.length; i++) {
			String[] arrayString = strings[i].split("[a-z]+");
			max = 0;
			for (String string : arrayString) {
				int number = Integer.parseInt(string);
				if(number > max) {
					max = number;
				}
			}
			maxNumber[i] = max;
		}
		Arrays.sort(maxNumber);
		for (int i = 0; i < maxNumber.length; i++) {
			result[i] = String.valueOf(maxNumber[i]);
		}
		return result;
	}
}
