package declaration.exe;

import java.util.Arrays;
import java.util.function.Predicate;

import bean.DigitDto;

public class Ex01 {
	public static void main(String[] args) {
		int[] digits = {1,9,5,36,13,33};
		int sum = sum(digits, t -> t%2==1);
		System.out.println(sum);
		DigitDto digitDto = getMaxMin(digits);
		System.out.println(digitDto.getMax() + " " + digitDto.getMin());
		
		int[] add = add(digits, 10, 3);
		for (int value : add) {
			System.out.println(value);
		}
		
		int[] remove = remove(digits ,3);
		for (int value : remove) {
			System.out.println(value);
		}
		
		sort(digits);
		for (int value : digits) {
			System.out.println(value);
		}
	}
	
	// a. 
	private static int  sum (int[] digits,Predicate<Integer> predicate) {
		if (digits.length ==0) {
			return 0;
		}
		int sum =0;
		for (int value : digits) {
			if (predicate.test(value)) {
				sum += value;
			}
		}
		return sum;
	}
	
	private static DigitDto getMaxMin (int[] digits) {
		if (digits == null || digits.length ==0) {
			throw new IllegalArgumentException("Invalid argument");
		}
		int min = digits[0];
		int max = digits[0];
		
		for (int value : digits) {
			if (min > value) {
				min = value;
			}
			
			if (max < value) {
				max = value;
			}
		}
		
		DigitDto result = new DigitDto(max, min);
		return result;
	}
	
	private static int[] add (int[] digits,int newValue, int index) {
		int[] result = new int[digits.length +1];
		for (int i =0 ; i< digits.length;i++) {
			if (i == index) {
				result[i] = newValue;
				result[i + 1] = digits[i];
				continue;
			}
			if (i > index ) {
				result[i+1] = digits[i];
				continue;
			}
			
			result[i] = digits[i];
		}
		return result;
	}
	
	private static int[] remove (int[] digits, int index) {
		int[] result = new int[digits.length -1];
		for (int i =0 ; i< digits.length;i++) {
			if (i == index) {
				continue;
			}
			if (i > index ) {
				result[i-1] = digits[i];
				continue;
			}
			
			result[i] = digits[i];
		}
		return result;
	}
	
	private static void reverse (int[]  digits) {
		for (int i =0; i < digits.length /2; i++) {
			int tmp = digits[i];
			digits[i] = digits[digits.length -i -1];
			digits[digits.length -i -1] = tmp;
		}
	}
	
	private static void sort (int[] digits) {
		for (int i = 0; i< digits.length -1;i++) {
			for (int j = i +1; j< digits.length;j++) {
				if (digits[i] > digits[j]) {
					int tmp = digits[i];
					digits[i] = digits[j];
					digits[j] = tmp;
				}
			}
		}
	}
}
