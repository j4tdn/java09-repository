package declaration.exe;

import java.util.Arrays;
import java.util.function.Predicate;

import javax.naming.spi.DirStateFactory.Result;

import bean.DigitDto;

public class Ex01 {
	public static void main(String[] args) {
		int[] digits = { 1, 9, 5, 36, 12, 33 };
		System.out.println(sum(digits, t -> t % 2 != 0));
		DigitDto result = getMaxMin(digits);
		System.out.println("max: " + result.getMax());
		System.out.println("min: " + result.getMin());
		int[] addArray = add(digits, 99, 3);
		iteration(addArray);
		System.out.println("====================");
		 int[] removeArray = remove(digits, 2);
		 iteration(removeArray);
		System.out.println("===================");
		sort(digits);
		Arrays.sort(digits);
		revertse1(digits);
		iteration(digits);


	}

	// cal sum of odd number
	private static int sum(int[] digits, Predicate<Integer> predicate) {
		if (digits.length == 0) {
			return 0;
		}
		int sum = 0;
		for (int i = 0; i < digits.length; i++) {
			if (predicate.test(digits[i])) {
				sum = sum + digits[i];

			}
		}

		return sum;
	}

	// find max min in one loop
	// object max, min
	private static DigitDto getMaxMin(int[] digits) {
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

	// add an element into array
	private static int[] add(int[] digits, int newvalue, int index) {
		index = index < 0 ? 0 : index;
		index = index > digits.length ? digits.length : index;
		int[] result = new int[digits.length + 1];
		for (int i = 0; i < index; i++) {
			result[i] = digits[i];

		}
		result[index] = newvalue;
		for (int i = index; i < digits.length; i++) {
			result[i + 1] = digits[i];
		}

		return result;

	}

	// remove an element into array
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

	// sort an arrays
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

	// revert arrays
	private static void revertse1(int[] digits) {
		for (int i = 0; i < digits.length / 2; i++) {
			int tmp = digits[i];
			digits[i] = digits[digits.length - i - 1];
			digits[digits.length - i - 1] = tmp;
		}
	}

	// iteration : for index or forEach
	private static void iteration(int[] digits) {
		for (int digit : digits) {
			System.out.print(digit + " ");
		}
	}

}
