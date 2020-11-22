package declaration.exe;

import java.util.Arrays;
import java.util.function.Predicate;

import bean.DigitDto;

public class Ex01 {
	public static void main(String[] args) {
		int[] digit = {1, 9, 5, 36, 12, 33};
		
		int sum = sum(digit, t -> t%2!=0);
		System.out.println(sum);
		DigitDto result = getMaxMin(digit);
		System.out.println(result.getMax());
		System.out.println(result.getMin());
		iteration(add(digit, 99, 3));
		
		iteration(remove(digit, 2));
		
		
		iteration(digit);
		sort(digit);
		Arrays.sort(digit);
		reverse(digit);
		iteration(digit);
		
	}

	// a
	private static int sum(int[] digits, Predicate<Integer> predicate) {
			int[] result = new int [digits.length];
			int sum=0;
			if(digits.length==0) {
				for(int i = 0; i< digits.length;i++) {
					if(predicate.test(i)) {
						sum+=digits[i];
						
					}
				}	
		}
			return sum;
	}
	
	private static DigitDto getMaxMin(int[] digits) {
		DigitDto results = new DigitDto();
		results.setMax(digits[0]);
		results.setMin(digits[0]);
		for(int digit:digits) {
			if(digit>results.getMax()) {
				results.setMax(digit);
			}
			if(digit<results.getMin()) {
				results.setMin(digit);
			}
			
		}
		return results;
	}
	private static int[] add(int[] digits, int newValue,int index) {
		int[]result = new int[digits.length+1];
		
		for(int i=0;i < index;i++) {
			result[i]= digits[i];
			
		}
		result[index]=newValue;
		for(int i = index; i<digits.length;i++) {
			result[i+1]=digits[i];
		}
		return result;
		
	}
	private static int[] remove(int[] digits, int index) {
		int[]result = new int[digits.length-1];
		
		for(int i=0;i < index;i++) {
			result[i]= digits[i];
			
				}
		for(int i = index; i<result.length;i++) {
			result[i]=digits[i+1];
		}
		return result;
		
		
	}
	private static void sort(int[] digits) {
			for ( int i = 0 ; i < digits.length;i++ ) {
				for (int j=i+1;j<digits.length;j++) {
					if(digits[i] > digits[j]) {
						int tmp = digits[i];
						digits[i] = digits[j];
						digits[j]=tmp;
					}
				}
			}
			
	}
	private static void iteration(int[] digits){
		for(int digit:digits) {
			System.out.print(digit+" ");
		}
		System.out.println();
	}
	private static void reverse(int[] digits) {
		for (int i=0 ; i< digits.length/2; i++) {
			int tmp = digits[i];
			digits[i]=digits[digits.length-i-1];
			digits[digits.length-i-1]=tmp;
		}
	}
	}

