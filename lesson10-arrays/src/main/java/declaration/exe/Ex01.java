package declaration.exe;

import java.util.Arrays;
import java.util.function.Predicate;

import bean.DigitDto;

public class Ex01 {
	public static void main(String[] args) {
		int[] digits = { 1, 9, 5, 36, 12, 33 };
		int sum = sum(digits, t -> t % 2 != 0);
		System.out.println(sum);
		DigitDto result = getMaxMin(digits);
		System.out.println(result);

		int[] add = add(digits, 10, 2);
		iterate(add);
		int[] remove = remove(digits, 2);
		iterate(remove);

		// sort(digits);
		Arrays.sort(digits);
		iterate(digits);
		reverse(digits);
		iterate(digits);
	}

	// interation
	private static void iterate(int[] digits) {
		for (int digit : digits) {
			System.out.print(digit + "   ");
		}
		System.out.println();
	}

	// a. Calculate sum of odd Numbers
	private static int sum(int[] digits, Predicate<Integer> predicate) {
		if (digits.length == 0) {
			return 0;
		}
		int sum = 0;
		for (int num : digits) {
			if (predicate.test(num)) {
				sum += num;
			}
		}
		return sum;
	}

	// b. find max, min in one loop
	// object: max,min
	private static DigitDto getMaxMin(int[] digits) {
		if (digits == null || digits.length == 0) {
			throw new IllegalArgumentException();
		}

		int max = digits[0];
		int min = digits[0];
		for (int num : digits) {
			if (num > max) {
				max = num;
			}
			if (num < min) {
				min = num;
			}
		}
		return new DigitDto(max, min);
	}

	// c: add an element into array
	private static int[] add(int[] digits, int newValue, int index) {
		int[] result = new int[digits.length + 1];
		for (int count = 0; count < index; count++) {
			result[count] = digits[count];
		}
		result[index] = newValue;

		for (int count = index + 1; count < result.length; count++) {
			result[count] = digits[count - 1];
		}
		return result;
	}

	// d: remove an element into array
	private static int[] remove(int[] digits, int index) {
		int[] result = new int[digits.length - 1];

		for (int count = 0; count <= index - 1; count++) {
			result[count] = digits[count];
		}

		for (int count = index; count < result.length; count++) {
			result[count] = digits[count + 1];
		}
		return result;
	}

	// e: sort an array
	private static void sort(int[] digits) {
		for (int i = 0; i < digits.length - 1; i++) {
			for (int j = i + 1; j < digits.length; j++) {
				if (digits[i] > digits[j]) {
					int tmp = digits[i];
					digits[i] = digits[j];
					digits[j] = tmp;
				}
			}
		}
	}

	// f: reverse array
	private static void reverse(int[] digits) {
		for (int i = 0; i < digits.length / 2; i++) {
			int tmp = digits[i];
			digits[i] = digits[digits.length - i - 1];
			digits[digits.length - i - 1] = tmp;
		}
	}

}
