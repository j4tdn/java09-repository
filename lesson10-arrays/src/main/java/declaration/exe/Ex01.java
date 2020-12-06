package declaration.exe;

import java.util.Arrays;
import java.util.function.Predicate;

import bean.DigitDto;

public class Ex01 {
	public static void main(String[] args) {
		int[] digits = { 1, 9, 5, 36, 12, 33 };
		int sum = sum(digits, t -> t % 2 != 0);
		DigitDto result = getMaxMin(digits);
		int[] addedArray = add(digits, 99, 3);
		int[] removedArray = remove(digits, 3);

		System.out.println("sum: " + sum);
		System.out.println("max: " + result.getMax());
		System.out.println("min: " + result.getMin());
		System.out.println("===== ADD =====");
		iterate(addedArray);

		System.out.println("===== REMOVE =====");
		iterate(removedArray);
		
		System.out.println("===== SORTED =====");
		// sort(digits);
		Arrays.sort(digits);
		reverse(digits);
		iterate(digits);
	}

	// a. Calculate sum of odd numbers
	private static int sum(int[] digits, Predicate<Integer> predicate) {
		if (digits.length == 0) {
			return 0;
		}
		int sum = 0;
		for (int i = 0; i < digits.length; i++) {
			if (predicate.test(digits[i])) {
				sum += digits[i];
			}
		}
		return sum;
	}

	// b. Find max, min in one loop
	// Object: max, min
	private static DigitDto getMaxMin(int[] digits) {
		if (digits == null || digits.length == 0) {
			throw new IllegalArgumentException();
		}
		// 5 7
		DigitDto result = new DigitDto();
		result.setMax(digits[0]);
		result.setMin(digits[0]);

		for (int digit : digits) {
			if (digit > result.getMax()) {
				result.setMax(digit);
			}
			if (digit < result.getMin()) {
				result.setMin(digit);
			}
		}

		return result;
	}

	// Quốc, Trường
	// c: Add an element into array
	// 1, 9, 5, 36, 12, 33
	// 1, 9, 5, 99, 36, 12, 33
	// newValue = 99
	// index = 3 => 1, 9, 5, 99, 36, 12, 33
	// 1 2 3 4 5
	// 1 2 3 4 5 0
	// 1 2 3 99 4 5
	private static int[] add(int[] digits, int newValue, int index) {
		index = index < 0 ? 0 : index;
		index = index >= digits.length ? digits.length : index;
		int[] result = new int[digits.length + 1];
		for (int i = 0; i < index; i++) {
			result[i] = digits[i];
		}
		result[index] = newValue;
		for (int i = index; i < digits.length; i++) {
			result[i + 1] = digits[i];
		}
		return result;
	}

	// d: Remove an element into array
	// 5 7 9 8 7
	// 5 7 8 7 => index = 2

	// 5 7 9 8 7
	// 5 7 8 7 7

	// Thảo
	private static int[] remove(int[] digits, int index) {
		int[] result = new int[digits.length - 1];
		for (int i = 0; i < index; i++) {
			result[i] = digits[i];
		}
		for (int i = index; i < result.length; i++) {
			result[i] = digits[i + 1];
		}
		return result;
	}

	// e: Sort an array: ASC
	// 1 99 12 24 8 => 99
	// 1
	// 1 8 12 24 99
	// bubble sort: SX nổi bọt
	private static void sort(int[] digits) {
		for (int i = 0; i < digits.length - 1; i++) {
			for (int j = i + 1; j < digits.length; j++) {
				if (digits[i] < digits[j]) {
					int tmp = digits[i];
					digits[i] = digits[j];
					digits[j] = tmp;
				}
			}
		}
	}
	
	// f: reverse array
	// 8 9 3 2 4
	private static void reverse(int[] digits) {
		for (int i = 0; i < digits.length/2; i++) {
			int tmp = digits[i];
			digits[i] = digits[digits.length - i -1];
			digits[digits.length - i -1] = tmp;
		}
	}

	// iteration: forIndex, forEach
	private static void iterate(int[] digits) {
		for (int digit : digits) {
			System.out.print(digit + " ");
		}
		System.out.println();
	}

}
