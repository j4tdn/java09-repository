package declaration.exe;

import java.util.Arrays;
import java.util.function.Predicate;

import javax.imageio.IIOException;
import javax.naming.spi.DirStateFactory.Result;
import javax.naming.spi.ResolveResult;

import bean.DigitDto;

public class Ex01 {
	public static void main(String[] args) {
		int[] digits = { 1, 9, 5, 12, 44, 36 };
		int sum = sum(digits, t -> t % 2 != 0);
		//System.out.println(sum);
		
		Arrays.sort(digits);
		reverse(digits);
		iterate(digits);
	}
	private static void reverse(int[] digits) {
		for(int i=0;i<digits.length/2;i++) {
			int tmp=digits[i];
			digits[i]=digits[digits.length-i-1];
			digits[digits.length-i-1]=tmp;
		}
	}
	
	private static void iterate(int[] digits) {
		for (int digit : digits) {
			System.out.print(digit + " ");

		}
		System.out.println();
	}

	// a. Tim Sum cua cac phan tu le
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

	// b.Find max,min in the loop
	private static DigitDto getMaxMin(int[] digits) {
		if (digits == null || digits.length == 0) {
			throw new IllegalArgumentException();
		}

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
		return null;

	}

	// c.Add element into array
	private static int[] add(int[] digits, int newValues, int index) {
		index = index < 0 ? 0 : index;
		index=index>=digits.length ?digits.length:index;
		int[] result = new int[digits.length+1];
		for(int i=0;i<index;i++) {
			result[i]=digits[i];
		}
		result[index]=newValues;
		for(int i=index;i<digits.length;i++) {
			result[i+1]=digits[i];
		}
	
		return null;
	}

	//d.Delete an element
	private static int[] remove(int[] digits, int index) {
		int[] result = new int[digits.length+1];
		for(int i=0;i<digits.length;i++) {
			
		}
		return null;
	}
	
	// e.Sort an array
	private static void sort(int[] digits) {
		for (int i = 0; i < digits.length-1; i++) {
			for (int j = i ; j < digits.length; j++) {
				if (digits[i] > digits[j]) {
					int temp = digits[j];
					digits[j]=digits[i];
					digits[i]=temp;

				}
			}
		}
	}
}
