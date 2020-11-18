package declaration.exe;

import java.util.Arrays;
import java.util.function.Predicate;

import bean.DigitDto;

public class Ex01 {
	public static void main(String[] args) {
		int[] digitsInit = { 5, 4, 3, 1, 123, 2, 3 };
		int sum = sum(digitsInit, t -> t % 2 == 0);
		System.out.println("sum :" + sum);
		DigitDto result = getMaxmin(digitsInit);
		System.out.println(result.getMax());
		System.out.println(result.getMin());
		iterate(digitsInit);
		System.out.println("====================");
		int[] digits = add(digitsInit, 5, 2);
		iterate(digits);
		System.out.println("===================");
		 int[] digit = remove(digitsInit, 1);
		
		 iterate(digit);
//		 reverse(digitsInit);

	}

	private static void iterate(int[] digits) {
		for (int digit : digits) {
			System.out.print(digit + " ");
		}
		System.out.println();
	}

	private static int sum(int[] digits, Predicate<Integer> predicate) {
		int sum = 0;
		if (digits.length == 0) {
			return 0;
		}
		for (int digit : digits) {
			if (predicate.test(digit)) {
				sum += digit;
			}
		}

		return sum;
	}

	private static DigitDto getMaxmin(int[] digits) {
		if (digits == null) {
			throw new IllegalArgumentException();
		}
		DigitDto digitDto = new DigitDto();
		digitDto.setMax(digits[0]);
		digitDto.setMin(digits[0]);
		for (int digit : digits) {
			if (digit > digitDto.getMax())
				digitDto.setMax(digit);
			if (digit < digitDto.getMin())
				digitDto.setMin(digit);
			;
		}

		return digitDto;
	}

	// c: add element into array
	private static int[] add(int[] digits, int newValue, int index) {
		index = index < 0 ? 0 : index;
		index = index > digits.length ? digits.length : index;
		int[] result = new int[digits.length + 1];
		for (int i = 0; i < digits.length; i++) {
			result[i] = digits[i];
		}
		for (int i = result.length; i < index; i++) {
			result[i] = result[i - 1];
		}
		result[index] = newValue;
		return result;
	}
private static void reverse (int [] digits)
{
	for ( int i=0;i<digits.length/2;i++)
	{
		int tmp=digits[i];
		digits[i]=digits[digits.length-i-1];
		digits[digits.length-i-1]=tmp;
	}
}
	private static int[] remove(int[] digits, int index) {
		int[] result = new int[digits.length];
		for (int i = 0; i < digits.length; i++) {
			result[i] = digits[i];
		}
		for (int i = index; i < result.length-1; i++) {
			result[i] = result[i+1];
		}
		return result;
	}
	private static void sort(int[] digits) {
		for (int i = 0; i < digits.length - 1; i++) {
			for (int j = i + 1; j > digits.length; j++) {
				if (digits[i] > digits[j]) {
					int tmp = digits[i];
					digits[i] = digits[j];
					digits[j] = tmp;
				}
			}
		}
	}
}
