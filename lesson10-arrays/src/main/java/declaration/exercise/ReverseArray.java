package declaration.exercise;

import java.util.Arrays;
import java.util.function.Predicate;

import bean.DigitDto;

public class ReverseArray {
	public static void main(String[] args) {
		int[] digits = {1,9,5,36,12,33};
		int sum = sumOfOddDigit(digits,t -> t % 2 == 1);
		System.out.println("Tong cua cac so le la : " + sum);
		System.out.println("So lon nhat la " + getMaxMin(digits).getMax());
		System.out.println("So be nhat la " + getMaxMin(digits).getMin());
		for(int number : add(digits, 100, 2)) {
			System.out.print(number + " ");
		}
		System.out.println();
		for(int number : remove(digits, 2)) {
			System.out.print(number + " ");
		}
		System.out.println();
		for(int number : sort(digits)) {
			System.out.print(number + " ");
		}
		System.out.println();
		for(int number : reverse(digits)) {
			System.out.print(number + " ");
		}

	}
	//a.tim sum cua cac so le
	private static int sumOfOddDigit(int[] digits,Predicate<Integer> predicate) {
		int result = 0;
		for(int i : digits) {
			if (predicate.test(i)) {
				result += i;
			}
		}
		return result ;
	}
	
	//b.tim so lon nhat va nho nhat cua mang
	private static DigitDto getMaxMin(int[] digits) {
		DigitDto d = new DigitDto();
		if(digits == null) {
			throw new IllegalArgumentException();
		}
		int max = digits[0];
		int min = digits[0];
		for(int number : digits) {
			if (number > max ) {
				max = number;
			}
			if (number < min ) {
				min = number ;
			}
		}	
		d.setMin(min);
		d.setMax(max);
		return d;
	}
	//c: Add element into array
	// 12345
	private static int[] add(int[] digits,int newValue,int k) {
		int[] result = new int[digits.length + 1];
		
		for(int i = 0 ; i < digits.length ; i ++) {
			result[i] = digits[i];
		}
		
		for(int i = digits.length-1 ; i >= k ; i--) {
			result[i+1] = result[i];
		}
		result[k] = newValue;
		return result;
	}
	//d: Remove an element into array
	private static int[] remove(int[] digits,int index) {
		int[] result = new int[digits.length];		
		for(int i = 0 ; i < digits.length ; i ++) {
			result[i] = digits[i];
		}
		for(int i = index ; i < digits.length - 1 ; i ++) {
			result[i] = result[i+1];
		}
//		result[digits.length] = 0;
		return Arrays.copyOfRange(result, 0, digits.length - 1);
	}
	//e:Sort an array
	private static int[] sort(int[] digits) {
		int[] result = new int[digits.length];		
		for(int i = 0 ; i < digits.length ; i ++) {
			result[i] = digits[i];
		}
		for(int i = 0 ; i < digits.length - 1 ; i ++) {
			for (int j = i + 1 ; j < digits.length ; j ++) {
				if (result[i] > result[j]) {
					int temp = result[i];
					result[i] = result[j];
					result[j] = temp;
				}
			}
		}
		return result;
	}
	//f:reverse array
	private static int[] reverse(int[] digits) {
		int[] result = new int[digits.length];		
		for(int i = digits.length -1 ; i >= 0 ; i --) {
			result[digits.length -1 - i] = digits[i];
		}
		return result;
	}

}
