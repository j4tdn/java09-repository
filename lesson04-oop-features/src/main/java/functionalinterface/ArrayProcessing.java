package functionalinterface;

import java.util.Arrays;

import view.Condition;

public class ArrayProcessing {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6 };
		
//		Condition condition = new Condition() {
//			public boolean test(int a) {
//				return a % 2 != 0;
//			}
//		};
		
		int[] oddNumbers = findNumbers(numbers, a -> a % 2 != 0);
		int[] evenNumbers = findNumbers(numbers, a -> a % 2 == 0);
			
		forEach("Print odd numbers", oddNumbers);
		forEach("\nPrint even numbers", evenNumbers);
	}

	private static void forEach(String title, int[] numbers) {
		System.out.println(title);
		for (int number : numbers) {
			System.out.print(number + " ");
		}
	}
	
	
	private static int[] findNumbers(int[] numbers, Condition condition) {
		int[] result = new int[numbers.length];
		int length = 0;
		for(int number:numbers) {
			if(condition.test(number)) {
				result[length++] = number;
			}
		}
		return Arrays.copyOfRange(result, 0, length);
	}

	private static int[] findOddNumbers(int[] numbers) {
		int[] result = new int[numbers.length];
		int k = 0;
		for (int number : numbers) {
			if (number % 2 != 0) {
				result[k++] = number;
			}
		}
		return Arrays.copyOfRange(result, 0, k);// vi du k = 3 thi lay tu 0 den 2
	}

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
	
	private static int[] findPowerOf5(int[] numbers) {
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
