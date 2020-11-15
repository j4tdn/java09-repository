package declaration;

import java.util.Arrays;
import java.util.function.Predicate;

public class Ex02 {
	public static void main(String[] args) {
		int[] digits = { 1, 9, 5, 36, 12, 44 };
		int[] eventNumbers = getDigits(digits, new Predicate<Integer>() {

			public boolean test(Integer t) {
				if (t % 2 == 0) {
					return true;
				}
				return false;
			}
		});
		int[] eventNumbers1 = getDigits(digits, t -> t % 2 == 0);
		iterate(eventNumbers1);
//		iterate(getDigits(digits));
	}

	private static void iterate(int[] digits) {
		for (int i : digits) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	private static int[] getDigits(int[] digits, Predicate<Integer> predicate) {
		int[] results = new int[digits.length];
		int index = 0;
		for (int i = 0; i < digits.length; i++) {
			if (predicate.test(digits[i])) {
				results[index++] = digits[i];
			}
		}
		return Arrays.copyOfRange(results, 0, index);
	}
}
