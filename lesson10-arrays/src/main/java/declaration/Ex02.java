package declaration;

import java.util.Arrays;
import java.util.function.Predicate;

public class Ex02 {
	public static void main(String[] args) {
		int[] degits= {1,9,5,36,12,44,33};
		int[] evenNbers = getDigits(degits, t -> t%2==0);
		iteration(evenNbers);
		
	}
	//strategy parttern
	//funtional interface => bthuc lambda
	//FI:strategy method (int x -. boolean)
	private static int[] getDigits(int[] digits , Predicate<Integer> predicate) {
		int[] result = new int[digits.length];
		int count=0;
		for(int i=0;i<digits.length;i++) {
			if(predicate.test(digits[i])) {
				result[count] =digits[i];
				count++;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	//iteration : for index or forEach
	private static void iteration(int[] digits) {
		for(int digit:digits) {
			System.out.print(digit + " ");
		}
	}
	
	

}
