package declaration;

import java.util.Arrays;
import java.util.function.Predicate;

public class Ex02 {
	public static void main(String[] args) {
		int[] digits = { 1, 9, 5, 12, 44, 36 };

		int[] eventNumbers = getDigits(digits, t -> t % 2 == 0);
		iterate(eventNumbers);

	}

	// strategy pattern
	// Function
	private static int[] getDigits(int[] digits, Predicate<Integer> predicate) {
		int[] result = new int[digits.length];
		int count = 0;
		for (int i = 0; i < digits.length; i++) {
			// if(digits[i]%2==0) {
			if (predicate.test(digits[i])) {
				result[count++] = digits[i];
			}
		}
		return Arrays.copyOfRange(result, 0, count);

	}

	// iteration
	private static void iterate(int[] digits) {
		for (int digit : digits) {
			System.out.print(digit + " ");

		}
		System.out.println();
	}
}
