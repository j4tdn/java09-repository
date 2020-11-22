package utils;

import java.util.Arrays;
import static utils.ArrayUtils.*;

public class ArrayUtils {
	private ArrayUtils() {

	}

	public static void println(int[] numbers) {
		for (int number : numbers) {
			System.out.print(number + " ");
		}
		System.out.println();
	}

	public static void println(String[] sequences) {
		for (String sequence : sequences) {
			System.out.print(sequence + " ");
		}
		System.out.println();
	}

	public static void reverse(int[] numbers) {
		for (int i = 0; i < numbers.length / 2; i++) {
			int tmp = numbers[i];
			numbers[i] = numbers[numbers.length - 1 - i];
			numbers[numbers.length - 1 - i] = tmp;
		}
	}

	public static void bubbleSort(int[] numbers) {
		for (int out = numbers.length - 1; out > 0; out--) {
			for (int in = 0; in < out; in++) {
				if (numbers[in] > numbers[out]) {
					int tmp = numbers[in];
					numbers[in] = numbers[out];
					numbers[out] = tmp;
				}
			}
		}
	}

	public static void bubbleSort(String[] sequences) {
		for (int out = sequences.length - 1; out > 0; out--) {
			for (int in = 0; in < out; in++) {
				if (sequences[in] == null) {
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

	public static void bubbleSortNullLast(String[] sequences) {
		for (int out = sequences.length - 1; out > 0; out--) {
			if (sequences[out] == null) {
				break;
			}

			for (int in = 0; in < out; in++) {
				if (sequences[in] == null) {
					String tmp = sequences[in];
					sequences[in] = sequences[out];
					sequences[out] = tmp;
					break;
				}

				if (sequences[in].compareTo(sequences[out]) > 0) {
					String tmp = sequences[in];
					sequences[in] = sequences[out];
					sequences[out] = tmp;
				}
			}
		}
	}

	public static void sort(int[] numbers, SortOrder sortOrder) {
		Arrays.parallelSort(numbers);
		if (sortOrder == SortOrder.DESC) {
			reverse(numbers);
		}
	}

	public enum SortOrder {
		ASC, DESC
	}
}