package utils;

import java.util.Arrays;

public class ArrayUtils {
	private ArrayUtils() {
		
	}
	
	public static void printf(int[] numbers) {
		for(int number : numbers) {
			System.out.print(number + " ");
		}
		System.out.println();
	}
	
	
	public static void printf(String[] sequences) {
		for(String s : sequences) {
			System.out.print(s + " ");
		}
		System.out.println();
	}
	
	
	public static void bubbleSort(int[] numbers) {
		for(int out = numbers.length - 1; out > 0 ; out --) {
			for(int in = 0 ; in < out ; in++) {
				if(numbers[in] < numbers[out]) {
					int tmp = numbers[in];
					numbers[in] = numbers[out];
					numbers[out] = tmp;
				}
			}
		}
	}
	
	public static void bubbleSort(String[] sequences) {
		for(int out = sequences.length - 1; out > 0 ; out --) {
			for(int in = 0 ; in < out ; in++) {
				if (sequences[in] == null) {
					continue;
				}
				if(sequences[out] == null || sequences[in].compareTo(sequences[out]) > 0) {
					String tmp =sequences[in];
					sequences[in] = sequences[out];
					sequences[out] = tmp;
				}
			}
		}
	}
	
	
	public static void reverse(int[] digits) {
	
		for(int i = digits.length -1 ; i >= 0 ; i --) {
			digits[digits.length -1 - i] = digits[i];
		}

	}
	
	public static void sort(int[] numbers,SortOrder order) {
		Arrays.sort(numbers);
		if (order == SortOrder.DECREASE) {
			reverse(numbers);
		}
	}
	
	public enum SortOrder {
		INCREASE,DECREASE;
	}
}