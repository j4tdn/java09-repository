package utils;

import java.util.Arrays;

import static utils.ArrayUtils.*;

public class ArrayUtils {
	private ArrayUtils() {

	}

	public static void printf(String[] numbers) {
		for (String number : numbers) {
			System.out.print(number + " ");
		}
		System.out.println();
	}

	public static void reverse(int[] numbers) {
		for (int i = 0; i < numbers.length / 2; i++) {
			int tmp = numbers[i];
			numbers[i] = numbers[numbers.length - i - 1];
			numbers[numbers.length - i - 1] = tmp;
		}
	}

	public static void sort(int[] numbers, SortOrder sortOrder) {
		Arrays.sort(numbers);
		if (sortOrder != SortOrder.Ascending) {
			reverse(numbers);
		}
	}

	public static void bubbleSort(String[] sequences) {
		for (int out = sequences.length - 1; out > 0; out--) {
			if (sequences[out] == null) {
				continue;
			}
			for (int in = 0; in < out; in++) {			
				if (sequences[in] ==null || sequences[in].compareTo(sequences[out]) > 0) {
					String tmp = sequences[in];
					sequences[in] = sequences[out];
					sequences[out] = tmp;
					if (sequences[out] == null) {
						break;
					}
				}
			}
		}
	}

	public enum SortOrder {
		Ascending, Descending
	}
}
