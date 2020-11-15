package declaration.exe;

import java.util.Arrays;
import java.util.function.Predicate;

import bean.DigitDto;

public class Ex01 {
	public static void main(String[] args) {
		int[] digits = {1, 9, 5, 36, 12, 33};
		System.out.println("sum: " + sum(digits, t -> t % 2 == 1));
		System.out.println(getMaxMin(digits));
		
		System.out.println("thêm một phần tử: ");
		digits = add(digits, 99, 3);
		iterate(digits);
		
		System.out.println("xoá phần tử thứ i:");
		digits = remove(digits, 0);
		iterate(digits);
		
		System.out.println("sắp xếp mảng tăng dần");
		sort(digits);
		iterate(digits);
		
		System.out.println("đảo ngược mảng");
		reverse(digits);
		iterate(digits);
		
		
	}
	//a, caculate sum of odd numbers (lẻ)
	private static int sum(int[] digits, Predicate<Integer> predicate) {
		int[] result = new int[digits.length];
		if(digits.length == 0) {
			return 0;
		}
		int sum = 0;
		for(int digit: digits) {
			if(predicate.test(digit)) {
				sum += digit;
			}
		}
		return sum;
	}
	
	//b, find max, min in one loop
	//object: max, min
	private static DigitDto getMaxMin(int[] digits) {
		int max = digits[0];
		int min = digits[0];
		for(int digit: digits) {
			if(max < digit) {
				max = digit;
			}
			if(min > digit) {
				min = digit;
			}
		}
		DigitDto result = new DigitDto(max, min);
		return result;
	}
	
	private static void iterate(int[] digits) {
		for(int digit:digits) {
			System.out.print(digit + " ");
		}
		System.out.println();
	}
	
	//c. add an element into array
	
	private static int[] add(int[] digits, int newValue, int index) {
		int[] result = new int[digits.length + 1];
		for(int i = 0; i < index; i++) {
			result[i] = digits[i];
		}
		result[index] = newValue;
		for(int i = index + 1; i < result.length; i++) {
			result[i] = digits[i-1];		
		}
		
		return result;
		
	}
	
	//d. remove an element into array
	private static int[] remove(int[] digits, int index) {
		int[] result = new int[digits.length - 1];
		for(int i = 0; i < index; i++) {
			result[i] = digits[i];
		}
		for(int i = index; i < result.length; i++) {
			result[i] = digits[i+1];		
		}
		
		return result;
	}
	
	//e. sort an array (increase)
	
	private static void sort(int[] digits) {
		for(int i = 0; i < digits.length - 1; i++) {
			for(int j = i + 1; j < digits.length; j++) {
				if(digits[i] > digits[j]) {
					int tmp = digits[i];
					digits[i] = digits[j];
					digits[j] = tmp;
				}
			}
		}
	}
	
	//f. reverse
	private static void reverse(int[] digits) {
		for(int i = 0; i < digits.length/2; i++) {
			int tmp = digits[i];
			digits[i] = digits[digits.length - i - 1];
			digits[digits.length - i - 1] = tmp;
		}
		
	}
	
}
