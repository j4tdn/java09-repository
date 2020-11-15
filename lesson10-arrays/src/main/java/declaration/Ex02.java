package declaration;

import java.util.function.Predicate;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] digits = {1,9,5,36,12,44,33};
		
		int[] evenNumbers= getDigits(digits, t -> t%2 ==0);
		
		iterate(digits);
		
	}
	
	private static int[] getDigits (int[] digits, Predicate<Integer> predicate){
		int[] result = new int[digits.length];
		int count = 0;
		for (int i =0; i< digits.length; i++) {
			if (predicate.test(digits[i])) {
				result[count++] = digits[i];
			}
		}
		return result;
	}
	
	private static void iterate (int[] digits) {
		for (int digit : digits) {
			System.out.print(digit + " ");
		}
		
		System.out.println();
	}

}
