package interfaceFunction;

import java.util.Arrays;

public class ArrayProcessing {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6 };
		int[] odds = findNumber(numbers, num -> num % 2 == 1);
		forEach(odds);

		System.out.println("================");

		int[] evens = findNumber(numbers, num -> num % 2 == 0);
		forEach(evens);

	}

	private static void forEach(int[] numbers) {
		for (int i : numbers) {
			System.out.println(i);
		}
	}

	// find odd, even numbers
	private static int[] findNumber(int[] numbers, Operation operation) {
		int[] result = new int[numbers.length];
		int k = 0;
		for (int number : numbers) {
			if (operation.perform(number)) {
				result[k] = number;
				k++;
			}
		}
		return Arrays.copyOfRange(result, 0, k);
	}

}
