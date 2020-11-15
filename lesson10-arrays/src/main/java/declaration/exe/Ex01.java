package declaration.exe;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;

import bean.DigitDto;

public class Ex01 {
	public static void main(String[] args) {
		int[] digits = { 1, 9, 5, 36, 12, 33 };
		System.out.println(sum(digits, t -> t % 2 != 0));
		System.out.println(getMaxMin(digits));
		show(add(digits, 10, 0));
		show(remove(digits, 0));
		sort(digits);
		show(digits);
		reverse(digits);
		show(digits);

	}

	private static int sum(int[] digits, Predicate<Integer> predicate) {
		int sum = 0;
		if (digits.length == 0) {
			return 0;
		}
		for (int i = 0; i < digits.length; i++) {
			if (predicate.test(digits[i])) {
				sum += digits[i];
			}
		}

		return sum;
	}
	
	private static void show(int[] digits) {
		for (int i : digits) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

	private static DigitDto getMaxMin(int[] digits) {
		if(digits == null || digits.length == 0) {
			throw new IllegalArgumentException();
		}
		
		DigitDto d = new DigitDto();
		d.setMax(digits[0]);
		d.setMin(digits[0]);
		for (int i = 1; i < digits.length; i++) {
			if(digits[i] > d.getMax()) {
				d.setMax(digits[i]);
			}
			if(digits[i] < d.getMin()) {
				d.setMin(digits[i]);
			}
		}
		return d;
	}
	
	private static int[] add(int[] digits, int newValue, int index) {
		index = index < 0 ? 0 : index;
		index = index >= digits.length ? digits.length - 1 : index;
		int[] result = new int[digits.length + 1];
		for (int i = 0; i < result.length; i++) {
			if(i < index) {
				result[i] = digits[i];
			} else {
				if(i == index) {
					result[i] = newValue;
				}else {
					result[i] = digits[i-1];
				}
			}
		}
		return result;
	}
	
	private static int[] remove(int[] digits, int index) {
		int[] result = new int[digits.length - 1];
		for (int i = 0; i < result.length; i++) {
			if(i < index) {
				result[i] = digits[i];
			} else {
				result[i] = digits[i+1];
			}
		}
		return result;
	}
	
	private static void sort(int[] digits) {
		for (int i = 0; i < digits.length - 1; i++) {
			for (int j = i + 1; j < digits.length; j++) {
				if(digits[i] > digits[j]) {
					int temp = digits[i];
					digits[i] = digits[j];
					digits[j] = temp;
				}
			}
		}
	}
	
	private static void reverse(int[] digits) {
		for (int i = 0; i < digits.length / 2; i++) {
			int tmp = digits[i];
			digits[i] = digits[digits.length - 1 - i];
			digits[digits.length - 1 - i] = tmp;
		}
	}
}
