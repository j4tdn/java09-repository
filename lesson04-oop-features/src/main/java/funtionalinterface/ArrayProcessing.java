package funtionalinterface;

import java.util.Arrays;

public class ArrayProcessing {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6 };
		
		int[] oddNumbers = findNumbers(numbers, number -> number % 2 == 0);
		int[] powerNumbers = findNumbers(numbers, number -> number % 5 == 0);
		
		forEach("Print even numbers", oddNumbers);
		forEach("\nPrint power numbers", powerNumbers);
	}

	private static void forEach(String title, int[] numbers) {
		System.out.println(title);
		for (int number : numbers) {
			System.out.print(number + " ");
		}
	}
	
	// strategy pattern
	private static int[] findNumbers(int[] numbers, Condition condition) {
		int[] result = new int[numbers.length];
		int k = 0;
		for (int number : numbers) {
			if (condition.test(number)) {
				result[k++] = number;
			}
		}
		return Arrays.copyOfRange(result, 0, k);
	}

	// Find odd numbers
	private static int[] findOddNumbers(int[] numbers) {
		int[] result = new int[numbers.length];
		int k = 0;
		for (int number : numbers) {
			if (number % 2 != 0) {
				result[k++] = number;
			}
		}
		return Arrays.copyOfRange(result, 0, k);
	}

	// Find even numbers
	private static int[] findEvenNumbers(int[] numbers) {
		int[] result = new int[numbers.length];
		int k = 0;
		for (int number : numbers) {
			if (number % 2 == 0) {
				result[k++] = number;
			}
		}
		return Arrays.copyOfRange(result, 0, k);
	}

	// Find power of 5
	private static int[] findPowerOf(int[] numbers) {
		int[] result = new int[numbers.length];
		int k = 0;
		for (int number : numbers) {
			if (number % 5 == 0) {
				result[k++] = number;
			}
		}
		return Arrays.copyOfRange(result, 0, k);
	}
}
