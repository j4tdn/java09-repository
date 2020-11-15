package declaration;

import java.util.Arrays;
import java.util.function.Predicate;

public class Ex02 {
		public static void main(String[] args) {
			int[] digit = {1, 9, 5, 12, 36};
			int[]eventNumbers = getdigits(digit, t-> t%2==0);
			
			iteration(eventNumbers);
			//System.out.println(eventNumbers);
		}
		private static int[] getdigits(int[] digits,Predicate<Integer> predicate) {
			int[] result = new int [digits.length];
			int count=0;
			for ( int i = 0 ; i< digits.length;i++) {
				if(predicate.test(i)) {
					result[count++]=digits[i];
				}
			}
		return Arrays.copyOfRange(result, 0, count);
		}
		//iteration 
		private static void iteration(int[] digits){
			for(int digit:digits) {
				System.out.print(digit+" ");
			}
			System.out.println();
		}
}

