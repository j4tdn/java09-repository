package declaration.exe;

import java.util.Arrays;
import java.util.function.Predicate;

import bean.DigitDto;

public class Ex01 {
	public static void main(String[] args) {
		int[] numbers = {1, 9, 5, 36, 45, 44, 2};
		
		int sumOfOddNumbers = sum(numbers, number -> number % 2 == 1);
		System.out.println("sum: " + sumOfOddNumbers);
		DigitDto digitDto = getMaxMin(numbers);
		System.out.println(digitDto);
		int[] addedArr = add(numbers, 999, 3);
		iterate(addedArr);
		int[] removedArr = remove(numbers, 2);
		iterate(removedArr);
		sort(removedArr);
		iterate(removedArr);
		
	}
	
	// a. tinh tong phan tu le:
	private static int sum(int[] numbers, Predicate<Integer> predicate) {
		int sum = 0;
		for(int number : numbers) {
			if(predicate.test(number)) {
				sum += number;
			}
		}
		
		return sum;
	}
	
	// b. tim max, min
	private static DigitDto getMaxMin(int[] numbers) {
		if(numbers.length == 0) {
			return null;
		}
		
		int max = numbers[0], min = numbers[0];
		
		for(int number : numbers) {
			if(number > max) {
				max = number;
			}
			if(number < min) {
				min = number;
			}
		}
		return new DigitDto(max, min);
	}
	
	// c. them phan tu vao vi tri k
	private static int[] add(int[] numbers, int newValue, int k) {
		if(k > numbers.length) {
			k = numbers.length;
		}
		
		int[] result = new int [numbers.length + 1];
		for(int i = 0; i < k; i++) {
			result[i] = numbers[i];
		}
		result[k] = newValue;

		for(int i = k + 1; i < result.length; i++) {
			result[i] = numbers[i - 1];
		}
		
		return result;
	}
	
	// d. xoa phan tu tai vi tri k
	private static int[] remove(int[] numbers, int index) {
		if(numbers == null || numbers.length == 0) {
			return null;
		}
		
		if(index >= numbers.length) {
			index = numbers.length - 1;
		}
		
		int[] result = new int[numbers.length - 1];
		for(int i = 0; i < index; i++) {
			result[i] = numbers[i];
		}
		for(int i = index; i < numbers.length - 1; i++) {
			result[i] = numbers[i + 1];
		}
		
		return result;
	}
	
	// e. sort an array
	private static void sort(int[] numbers) {
		for(int i = 0; i < numbers.length - 1; i++) {
			for(int j = i + 1; j < numbers.length; j++) {
				if(numbers[i] > numbers[j]) {
					int tmp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = tmp;
				}
			}
		}
	}
	
	private static void reverse(int[] digits) {
		for(int i = 0; i < digits.length / 2; i++) {
			int tmp = digits[i];
			digits[i] = digits[digits.length - 1 - i];
			digits[digits.length - 1 - i] = tmp;
		}
	}

	private static void iterate(int[] digits) {
		for(int digit : digits) {
			System.out.print(digit + " ");
		}
		System.out.println();
	}
}
