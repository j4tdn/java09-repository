package view;

import java.util.Arrays;

/**
 * Write a method to find odd || even number in array
 */
public class Page {
	public static void main(String[] args) {
		
		A[] as = {new B(), new C()};
		
		
		int[] numbers = {7, 2, 8, 4, 11, 6 };
		
		// sorry 1%2==1
		int[] result = filter(numbers, a -> a % 2 == 0);
		loop(result, (number) -> System.out.print(number + "  "));
	}
	
	private static void loop(int[] numbers, Performer performer) {
		for (int number: numbers) {
			performer.perform(number);
		}
	}
	
	private static int[] filter(int[] numbers, Condition condition) {
		int[] result = new int[numbers.length];
		int length = 0;
		for (int number: numbers) {
			if (condition.test(number)) {
				result[length++] = number;
			}
		}
		return Arrays.copyOfRange(result, 0, length);
	}
}
