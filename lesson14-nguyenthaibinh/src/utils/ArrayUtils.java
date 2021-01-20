package utils;

import java.util.List;

public class ArrayUtils {
	
	public static void printf(int[] numbers) {
		for(int number : numbers) {
			System.out.print(number + " ");
		}
	}
	public static void printf(List<Integer> numbers) {
		for(Integer number : numbers) {
			System.out.print(number + " ");
		}
	}
}
