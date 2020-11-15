package declaration.exe;

import java.util.Arrays;
import java.util.function.Predicate;

import bean.DigitDto;

public class Ex01 {
	public static void main(String[] args) {
		int[] digits = { 1, 9, 5, 36, 12, 33 };
		int sum = sum(digits, t -> t % 2 != 0);
		DigitDto result = getMaxMin(digits);

		System.out.println("sum : " + sum);
		// System.out.println("max :" + result.getMax());
		// System.out.println("min :" + result.getMin());

		System.out.println("=== sorted===");
		// sort(digits);
		Arrays.sort(digits);
		iterate(digits);
		System.out.println("===reverse===");
		reverse(digits);
		iterate(digits);
	}
	

	// a.calulate sum of odd numbers
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

	// b.Find max ,min in one loop
	// object: max , min
	private static DigitDto getMaxMin(int[] digits) {
		DigitDto relust = new DigitDto();
		relust.setMax(digits[0]);
		relust.setMin(digits[0]);

		for (int digit : digits) {
			if (digit > relust.getMax()) {
				relust.setMax(digit);
			}
			if (digit < relust.getMin()) {
				relust.setMin(digit);
			}
		}
		return null;
	}
	// c.add an element into array
	// 1,9,5,366,12,33

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

		return null;
	}

	// d.remove an element into array
	// 1 2 3 4 5
	// 1 2 4 5
	private static int[] remove(int[] digits, int newValue, int index) {
		int[] result = new int[digits.length - 1];
		for (int i = 0; i < index; i++) {
			result[i] = digits[i];
		}

		return null;
	}

	// sort an array
	// 1 8 12 24 99

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

	// reverse array
	// 8 9 3 2 4
	private static void reverse(int[] digits) {
		for (int i = 0; i < digits.length / 2; i++) {
			int tmp = digits[i];
			digits[i] = digits[digits.length - i - 1];
			digits[digits.length - i - 1] = tmp;
		}
	}

	// iteration: forIndex, forEach
	private static void iterate(int[] digits) {
		for (int digit : digits) {
			System.out.println(digit + " ");
		}
		System.out.println();
	}
}
