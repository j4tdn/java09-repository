package utils;

import java.util.Arrays;

public class ArrayUtils {
private ArrayUtils() {
	
}
public static void printf(int[] numbers) {
	for(int number: numbers) {
		System.out.println(number + " ");
	}
	System.out.println("");
}
public static void printf(String[] sequences) {
	for(String sequence: sequences) {
		System.out.println(sequence + " ");
	}
	System.out.println("");
}

public static void sort(int[] numbers, SortOrder order) {
	Arrays.sort(numbers);
	if (order == SortOrder.DESC) {
		reverse(numbers);
	}
}

public static void bubbleSort(int[] numbers) {
	for(int out = numbers.length - 1; out > 0; out--) {
		//out: bubble element
		for(int in = 0; in < out; in++) {
			if(numbers[in] < numbers[out]) {
				int tmp = numbers[in];
				numbers[in] = numbers[out];
				numbers[out] = tmp;
			}
		}
	}
}

public static void bubbleSort(String[] sequences) {
	for(int out = sequences.length - 1; out > 0; out--) {
		//out: bubble element
		if(sequences[out] == null) {
			continue;
		}
		for(int in = 0; in < out; in++) {
			if(sequences[in] == null) {
				String tmp = sequences[in];
				sequences[in] = sequences[out];
				sequences[out] = tmp;
				break;
			}
			if(sequences[in].compareTo(sequences[out]) > 0) {
				String tmp = sequences[in];
				sequences[in] = sequences[out];
				sequences[out] = tmp;
			}
		}
	}
}

public static void reverse(int[] numbers) {
	
	for ( int i = 0; i < numbers.length/2; i++) {
		int tmp = numbers[i];
		numbers[i] = numbers[numbers.length -i - 1];
		numbers[numbers.length -i - 1] = tmp;
	}
}
public enum SortOrder{
	ASC, DESC
}
}
