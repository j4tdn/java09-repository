package funtionalinterface;

import java.util.Arrays;

public class ArrayProcessing {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6 };
		int[] oddNumbers = findOddNumbers(numbers);
		forEach("Odd numbers: ", oddNumbers);

		int[] evenNumbers = findEvenNumbers(numbers);
		forEach("even numbers: ", evenNumbers);

		int[] powerOf = findNumbers(numbers, a -> a % 5 == 0);
		forEach("So chia het cho 5: ", powerOf);

	}

	private static void forEach(String tilte, int[] numbers) {
		System.out.println(tilte);
		for (int num : numbers) {
			System.out.print(num + "  ");
		}
		System.out.println();
	}

	private static int[] findNumbers(int[] numbers, Condition condition) {
		int[] result = new int[numbers.length];
		int k = 0;
		for (int num : numbers) {
			if (condition.test(num)) {
				result[k++] = num;
			}
		}
		return Arrays.copyOfRange(result, 0, k);
	}

	// find odd numbers
	private static int[] findOddNumbers(int[] numbers) {
		int[] result = new int[numbers.length];
		int k = 0;
		for (int num : numbers) {
			if (num % 2 != 0) {
				result[k++] = num;
			}
		}
		return Arrays.copyOfRange(result, 0, k);
	}

	// find even numbers
	private static int[] findEvenNumbers(int[] numbers) {
		int[] result = new int[numbers.length];
		int k = 0;
		for (int num : numbers) {
			if (num % 2 == 0) {
				result[k++] = num;
			}
		}
		return Arrays.copyOfRange(result, 0, k);
	}

	// find power numbers
	private static int[] findPowerOfNumbers(int[] numbers, int number) {
		int[] result = new int[numbers.length];
		int k = 0;
		for (int num : numbers) {
			if (num % number == 0) {
				result[k++] = num;
			}
		}
		return Arrays.copyOfRange(result, 0, k);
	}
}
