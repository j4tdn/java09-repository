package declaration;

import java.util.Arrays;
import java.util.function.Predicate;

public class FunctionalInterface {
	public static void main(String[] args) {
		int[] digits = {1,9,5,36,12,44};
		
		int[] evenNumbers = getEvenDigits(digits, t -> t % 2 == 0);
		
		interate(evenNumbers);
	}
	private static void interate(int[] digits) {
		for(int digit : digits) {
			System.out.println(digit);
		}
		System.out.println();
	}
	private static int[] getEvenDigits(int[] digits, Predicate<Integer> predicate) {
		int[] result = new int[digits.length];
		int count = 0;
		for(int i = 0 ; i < digits.length ; i ++) {
			if (predicate.test(digits[i])) {
				result[count ++] = digits[i];
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
}
