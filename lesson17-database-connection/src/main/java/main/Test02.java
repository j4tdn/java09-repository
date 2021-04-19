package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Test02 {
	
	static int n;
	static int[] combinations;
	static int k = 3;
	static String stringInput;
	static List<int[]> result = new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		stringInput = sc.nextLine();
		
		n = stringInput.length();
		combinations = new int[n + 1];
		for(int i = 0; i < n; i++) {
			combinations[i] = 0;
		}
		
		Comparator<int[]> compa1 = (o1, o2) -> o1[0] - o2[0];
		Comparator<int[]> compa2 = (o1, o2) -> o1[1] - o2[1];
		Comparator<int[]> compa3 = (o1, o2) -> o1[2] - o2[2];
		Comparator<int[]> compa4 = (o1, o2) -> o1[3] - o2[3];
		
		getCombination(1);
		Collections.sort(result, compa1.thenComparing(compa2.thenComparing(compa3.thenComparing(compa4))));
		
		result.forEach(array -> {
			System.out.println(array[0] + "." + array[1] + "." + array[2] + "." + array[3]);
		});
	}

	private static void getCombination(int i)
	{
		for(int j = (combinations[i - 1] + 1); j < (n - k + i); j++)
		{
			combinations[i] = j;
			if(i == k) {
				check();
			}
			else getCombination(i + 1);
		}
	}

	private static void check() {
		String st1 = stringInput.substring(0, combinations[1]);
		String st2 = stringInput.substring(combinations[1], combinations[2]);
		String st3 = stringInput.substring(combinations[2], combinations[3]);
		String st4 = stringInput.substring(combinations[3]);
		
		if (!isValidString(st1) || !isValidString(st2) || !isValidString(st3) || !isValidString(st4)) {
			return;
		}
		
		int num1 = Integer.parseInt(st1);
		int num2 = Integer.parseInt(st2);
		int num3 = Integer.parseInt(st3);
		int num4 = Integer.parseInt(st4);
		
		if (isValidNumber(num1) && isValidNumber(num2) && isValidNumber(num3) && isValidNumber(num4)) {
			int[] validArr = new int[4];
			validArr[0] = num1;
			validArr[1] = num2;
			validArr[2] = num3;
			validArr[3] = num4;
			result.add(validArr);
		}
		
	}
	
	private static boolean isValidNumber(int number) {
		return number >= 0 && number <= 255;
	}
	
	private static boolean isValidString(String string) {
		if (string.length() > 1 && string.startsWith("0")) {
			return false;
		}
		
		return true;
	}
}
