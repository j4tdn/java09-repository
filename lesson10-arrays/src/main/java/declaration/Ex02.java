package declaration;

import java.util.Arrays;
import java.util.function.Predicate;

public class Ex02 {
	public static void main(String[] args) {
		int[] digits= {1,9,5,36,12,44,33};
		
		
		int[] evenNumber=getdigits(digits,t-> t%2 == 0);
		internate(evenNumber);
	}
	
	
	private static int[] getdigits(int[] digit, Predicate<Integer> predicate) {
		int[] result=new int[digit.length];
		int count=0;
		for(int i=0;i<digit.length;i++) {
			if(predicate.test(digit[i])) {
				result[count++]=digit[i];
			}
		}
		
		
		return Arrays.copyOfRange(result, 0, count);
	}
	
	private static void internate(int[] digits) {
		for(int digit: digits){
			System.out.print(digit+" ");
		}
	
	}
}
