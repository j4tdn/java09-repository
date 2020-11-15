package declaration.exe;

import java.util.Arrays;
import java.util.function.Predicate;

import bean.DigitDto;

public class Ex01 {
	public static void main(String[] args) {
		int[] digits = { 1, 9, 5, 36, 12, 33 };
		int s = sum(digits, t -> t % 2 == 1);
		System.out.println(s);
		DigitDto result = getMaxMin(digits);
		System.out.println(result);

		int[] add = add(digits, 100, 3);
		iterate(add);
		int[] remove = remove(digits, 2);
		iterate(remove);
		System.out.println("sort:");
		sort(digits);
		Arrays.sort(digits);
		iterate(digits);
		reverse(digits);
		iterate(digits);

	}

	private static void iterate(int[] digits) {
		for (int digit : digits) {
			System.out.print(digit + " ");
		}
		System.out.println();
	}

	// sum of odd number
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

	// find max, min in one loop
	// object:max,min

	private static DigitDto getMaxMin(int[] digits) {
		if (digits == null || digits.length == 0) {
			throw new IllegalArgumentException();
		}
		DigitDto digit = new DigitDto();
		digit.setMax(digits[0]);
		digit.setMin(digits[0]);
		for (int i : digits) {
			if (digit.getMax() < i) {
				digit.setMax(i);
			}
		}

		for (int i : digits) {
			if (digit.getMax() > i) {
				digit.setMin(i);
			}
		}
		return digit;
	}

	// add element into array
	private static int[] add(int[] digits, int newValue, int index) {
		int[] result = new int[digits.length + 1];
		for (int i = 0; i < index; i++) {
			result[i] = digits[i];
		}
		result[index] = newValue;
		for (int i = index; i < result.length - 1; i++) {
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

	// sort an array
	private static void sort(int[] digits) {
		for (int i = 0; i < digits.length - 1; i++) {
			for (int j = i + 1; j < digits.length; j++) {
				if (digits[i] > digits[j]) {
					int temp = digits[i];
					digits[i] = digits[j];
					digits[j] = temp;
				}
			}
		}

	}
	//reverse array
	
	private static void reverse(int[] digits) {
		for(int i=0;i<digits.length/2;i++) {
			int temp=digits[i];
			digits[i]=digits[digits.length-1-i];
			digits[digits.length-1-i]=temp;
		}
	}
}
