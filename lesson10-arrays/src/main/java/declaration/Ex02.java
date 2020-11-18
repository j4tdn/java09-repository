package declaration;

import java.util.Arrays;
import java.util.function.Predicate;

public class Ex02 {
	public static void main(String[] args) {
		int[] digits = {1, 9, 5, 44, -95, 34};
		iterate(digits);
		int[] evenDigits = getDigits(digits, number -> number % 2 == 0);
		iterate(evenDigits);
	}
	
	private static void iterate(int[] digits) {
		for(int digit : digits) {
			System.out.print(digit + " ");
		}
		System.out.println();
	}
	
	private static int[] getDigits(int[] digits, Predicate<Integer> predicate) {
		int[] result = new int[digits.length];
		int count = 0;
		
		for(int digit : digits) {
			if(predicate.test(digit)) {
				result[count++] = digit;
			}
		}
		
		return Arrays.copyOf(result, count);
	}
}
