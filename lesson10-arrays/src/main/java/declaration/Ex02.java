package declaration;

import java.util.Arrays;
import java.util.function.Predicate;

public class Ex02 {
	public static void main(String[] args) {
		int[] digits = { 1, 9, 5, 36, 12, 44 };
		iterate(digits);
		int[] evenNumber = getDigits(digits, a -> a%2 ==0);
		for (int x : evenNumber) {
			System.out.println(x);
		}
	}

	// iteration :
	private static void iterate(int[] digits) {
		for (int digit : digits) {
			System.out.println(digit + " ");
		}
		System.out.println();
	}
	
	private static int[] getDigits (int[] digits, Predicate<Integer> predicate) {
		int[] result = new int[digits.length];
		int count =0;
		for (int i = 0; i < digits.length ; i++) {
			if (predicate.test(digits[i])) {
				result[count++] = digits[i];
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
}
