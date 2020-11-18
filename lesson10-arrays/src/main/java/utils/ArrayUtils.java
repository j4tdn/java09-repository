package utils;

import java.util.Arrays;

public class ArrayUtils {
	public ArrayUtils() {

	}

	public static void printf(int[] numbers) {
		for (int number : numbers) {
			System.out.print(number + " ");
		}
		System.out.println();
	}

	public static void printf(String[] sequences) {
		for (String sequence : sequences) {
			System.out.print(sequence + " ");
		}
		System.out.println();
	}

	public static void sort(int[] numbers, SortOrder order) {
		Arrays.sort(numbers);
		if (order == SortOrder.DESC) {
			reverse(numbers);
		}
	}

	public static void bubbleSort(int[] numbers) {
		for (int out = numbers.length - 1; out >= 0; out--) {
			for (int in = 0; in < out; in++) {
				if (numbers[in] < numbers[out]) {
					int tmp = numbers[in];
					numbers[in] = numbers[out];
					numbers[out] = tmp;
				}
			}
		}
	}
	
	// first null
	public static void bubbleSort(String[] sequences) {
		for (int out = sequences.length - 1; out >= 0; out--) {
			for (int in = 0; in < out; in++) {
				if(sequences[in] == null) {
					continue;
				}
				if (sequences[out] == null || sequences[in].compareTo(sequences[out]) > 0) {
					String tmp = sequences[in];
					sequences[in] = sequences[out];
					sequences[out] = tmp;
				}
			}
		}
	}

	public static void reverse(int[] numbers) {
		for (int i = 0; i < numbers.length / 2; i++) {
			int tmp = numbers[i];
			numbers[i] = numbers[numbers.length - 1 - i];
			numbers[numbers.length - 1 - i] = tmp;
		}
	}

	public enum SortOrder {
		ASC, DESC
	}
}
