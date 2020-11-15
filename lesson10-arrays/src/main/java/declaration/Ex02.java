package declaration;

import java.util.Arrays;
import java.util.function.Predicate;

public class Ex02 {
	public static void main(String[] args) {
		int[] digits = { 1, 9, 5, 36, 12, 44, 33 };

		int[] evenNbers = getDigits(digits, t -> t % 2 == 0);
		iterate(evenNbers);
	}

	// interation
	private static void iterate(int[] digits) {
		for (int digit : digits) {
			System.out.print(digit + "   ");
		}
		System.out.println();
	}

	private static int[] getDigits(int[] digits, Predicate<Integer> predicate) {
		int[] result = new int[digits.length];
		int count = 0;
		for (int num : digits) {
			if (predicate.test(num)) {
				result[count++] = num;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
}
