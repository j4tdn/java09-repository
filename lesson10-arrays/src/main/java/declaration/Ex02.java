package declaration;

import java.util.Arrays;
import java.util.function.Predicate;

public class Ex02 {
	public static void main(String[] args) {
		int[] digits = {1, 9, 5, 36, 12, 44, 7};
//		int[] evenNumbers = getDigits(digits, new Predicate<Integer>() {
//
//			@Override
//			public boolean test(Integer t) {
//				return t % 2 == 0;
//			}
//		});
		int[] evenNumbers = getDigits(digits, t -> t % 2 == 0);
		iterate(evenNumbers);
	}
	
	//iteration: forIndex, forEach
	private static void iterate(int[] digits) {
		for (int digit:digits) {
			System.out.printf(digit + " ");
		}
		System.out.println();
	}
	
	private static int[] getDigits(int[] digits, Predicate<Integer> predicate) {
		int[] result = new int[digits.length];
		int count = 0;
		for (int i =0; i<digits.length; i++) {
			if (predicate.test(digits[i])) {
				result[count++] = digits[i];
			}
		}
		
		return Arrays.copyOfRange(result, 0, count);
	}
}
