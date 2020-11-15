package declaration.exe;

import java.util.Arrays;
import java.util.function.Predicate;

import bean.DigitDto;

public class Ex01 {
	public static void main(String[] args) {
		int[] digits = {1, 9, 5, 36, 12, 33};
		int sum = sum(digits, t -> t % 2 ==1);
		System.out.println("sum: " + sum);
		
		DigitDto d = getMaxMin(digits);
		System.out.println("max: " + d.getMax() + ", min: " + d.getMin());
		
		int[] add = add(digits, 5, 2);
		iterate(add);
		int[] remove = remove(digits, 4);
		iterate(remove);
		//sort(digits);
		Arrays.sort(digits);
		reverse(digits);
		iterate(digits);
	}
	
	//f: reverse array
	private static void reverse(int[] digits) {
		for (int i = 0; i < digits.length/2; i++) {
			int tmp = digits[i];
			digits[i] = digits[digits.length-1-i];
			digits[digits.length-1-i] = tmp; 
		}
	}
	
	private static void iterate(int[] digits) {
		for (int digit:digits) {
			System.out.printf(digit + " ");
		}
		System.out.println();
	}
	
	//a.Calculate sum of odd numbers
	private static int sum(int[] digits, Predicate<Integer> predicate) {
		if (digits.length == 0) {
			return 0;
		}
		int sum = 0;
		for (int digit:digits) {
			if (predicate.test(digit)) {
				sum += digit;
			}
		}
		return sum;
	}
	
	//b.Find max, min in one loop
	//object: max, min
	private static DigitDto getMaxMin(int[] digits) {
		if (digits == null || digits.length == 0) {
			throw new IllegalArgumentException();
		}
		int max = digits[0];
		int min = digits[0];
		for (int digit:digits) {
			if (max < digit) {
				max = digit;
			}
			if (min > digit) {
				min = digit;
			}
		}
		return new DigitDto(max, min);
	}
	
	
	//c.add an element into array
	private static int[] add(int[] digits, int newValue, int index) {
		int[] result = new int[digits.length+1];
		for (int i = 0; i<index; i++) {
			result[i] = digits[i];
		}
		for (int i = index+1; i<result.length; i++) {
			result[i] = digits[i-1];
		}
		result[index] = newValue;
		return result;
	}
	
	//d.Remove an element
	private static int[] remove(int[] digits, int index) {
		int[] result = new int[digits.length-1];
		for (int i = 0; i<index; i++) {
			result[i] = digits[i];
		}
		for (int i = index; i<result.length; i++) {
			result[i] = digits[i+1];
		}
		return result;
	}
	
	//e.Sort an array
	private static void sort(int[] digits) {
		for (int i = 0; i<digits.length-1; i++) {
			for (int j = 0; j<digits.length-1-i; j++) {
				if (digits[j]>digits[j+1]) {
					int temp = digits[j];
					digits[j] = digits[j+1];
					digits[j+1] = temp;
				}
			}
		}
	}
}
