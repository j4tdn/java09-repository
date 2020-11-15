package declaration.exe;

import java.util.Arrays;
import java.util.function.Predicate;

import bean.DigitDto;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] digits = {1,9,5,36,12,33};
		
		sum(digits, t -> t%2 != 0);
		
		System.out.println("sum "+ sum(digits, t -> t%2 != 0));
		System.out.println("max " + getMaxMin(digits).getMax());
		iterate(add(digits,99,3));
		iterate(remove(digits,3));
		
		Arrays.sort(digits);
		iterate(digits);
		reverse(digits);
		
	}
	//a. odd sum
	private static int sum( int[] digits, Predicate<Integer> predicate) {
		if (digits.length ==0) {
			return 0;
		}
		
		int sum =0;
		
		for (int i =0; i< digits.length; i++) {
			if (predicate.test(digits[i])) {
				sum += digits[i];
			}
		}
		return  sum;
	}
	//b. max, min
	
	private static DigitDto getMaxMin(int[] digits) {
		if (digits == null || digits.length == 0) {
			throw new IllegalArgumentException();
		}
			
		
		DigitDto result = new DigitDto();
		result.setMax(digits[0]);
		for (int digit : digits) {
			if(digit > result.getMax()) {
				result.setMax(digit);
			}
		}
		
		return result;
	}
	
	private static int[] add(int[] digits, int newValue, int index) {
		
		index = index <0 ? 0:index;
		index = index >digits.length ? digits.length:index;
		
		int[] n = new int[digits.length+1];
		
		for (int i =0; i<= index; i++) {
			n[i] = digits[i];
		}
		
		for (int i =index; i< digits.length; i++) {
			n[i+1] = digits[i];
		}
		
		n[index] = newValue;
		return n;
	}
	
	private static int[] remove(int[] digits, int index) {
		int[] n = new int[digits.length-1];
		
		for (int i =0; i<= index; i++) {
			n[i] = digits[i];
		}
		
		for (int i =index+1; i< digits.length; i++) {
			n[i-1] = digits[i];
		}
		return n;
	}
	
	private static void sort (int[] digits) {
		for(int i =0; i< digits.length-1 ; i++) {
			for(int j=i+1; j< digits.length; j++) {
				if (digits[i] < digits[j]) {
					int t = digits[i];
					digits[i]= digits[j];
					digits[j]= t;
				}
			}
		}
		iterate(digits);
	}
	
	private static void reverse(int[] digits) {
		for (int i = 0; i< digits.length/2; i++) {
			int t = digits[i];
			digits[i]= digits[digits.length -i-1];
			digits[digits.length -i-1]= t;
			
		}
		iterate(digits);
	}
	
	private static void iterate (int[] digits) {
		for (int digit : digits) {
			System.out.print(digit + " ");
		}
		
		System.out.println();
	}
}
