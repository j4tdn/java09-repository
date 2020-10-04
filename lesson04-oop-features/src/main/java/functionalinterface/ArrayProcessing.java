package functionalinterface;

import java.util.Arrays;

public class ArrayProcessing {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6};
		int[] oddNumbers = findNumbers(numbers, number -> number % 2 != 0);
		forEach("Print odd number:", oddNumbers);
		System.out.println();
		int[] evenNumbers = findNumbers(numbers, number -> number % 2 == 0);
		forEach("Print even number:", evenNumbers);
		System.out.println();
		int[] multipleOf5Numbers = findNumbers(numbers, number -> number % 5 == 0);
		forEach("Print multiple of 5 numbers:", multipleOf5Numbers);
		System.out.println();
	}
	
	private static void forEach(String title, int[] numbers) {
		System.out.println(title);
		for(int number:numbers) {
			System.out.print(number + "    ");
		}
	}
	
	private static int[] findNumbers(int[] numbers, Condition condition ) {
		int[] result = new int[numbers.length];
		int k = 0;
		for(int number:numbers) {
			if(condition.test(number)) {
				result[k++] = number;
			}
		}
		return Arrays.copyOfRange(result, 0, k);
		
	}
	
	
	
	//find odd numbers
	private static int[] findOddNumbers(int[] numbers) {
		int[] result = new int[numbers.length];
		int k = 0;
		for(int number:numbers) {
			if(number % 2 != 0) {
				result[k++] = number;
			}
		}
		return Arrays.copyOfRange(result, 0, k);
	}
	
	//find even numbers
	private static int[] findEvenNumbers(int[] numbers) {
		int[] result = new int[numbers.length];
		int k = 0;
		for(int number:numbers) {
			if(number % 2 == 0) {
				result[k++] = number;
			}
		}
		return Arrays.copyOfRange(result, 0, k);
	}
	
	//find multiple of 5
	private static int[] findMultipleOf5(int[] numbers) {
		int[] result = new int[numbers.length];
		int k = 0;
		for(int number:numbers) {
			if(number % 5 == 0) {
				result[k++] = number;
			}
		}
		return Arrays.copyOfRange(result, 0, k);
	}
}
