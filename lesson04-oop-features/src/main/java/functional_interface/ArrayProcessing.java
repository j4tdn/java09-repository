package functional_interface;

import java.util.Arrays;

public class ArrayProcessing {
	public static void main(String[] args) {
		int[] num = {1,2,3,4,5,6};
		int[] oddNumbers = findOddNumber(num);
		forEach("So le la: ", oddNumbers);
		
		int[] evenNumbers = findEvenNumber(num);
		forEach("\nSo chan la", evenNumbers);
		
		int[] powerNumber = findNumbers(num, number -> number % 5 ==0 );
		forEach("\nSo chia het cho 5", powerNumber);
	}
	
	private static void forEach(String title, int[] numbers) {
		System.out.println(title);
		for(int number:numbers) {
			System.out.printf(number+" ");
		}
	}
	
	private static int[] findNumbers(int[] numbers, Condition condition) {
		int[] results = new int[numbers.length];
		int k = 0;
		for (int i=0; i<numbers.length; i++) {
			if (condition.test(numbers[i])) {
				results[k] = numbers[i];
				k++;
			}
		}
		return Arrays.copyOfRange(results, 0, k);
	}
	
	private static int[] findOddNumber(int[] numbers) {
		int[] results = new int[numbers.length];
		int k = 0;
		for (int i=0; i<numbers.length; i++) {
			if (numbers[i] % 2 == 1) {
				results[k] = numbers[i];
				k++;
			}
		}
		return Arrays.copyOfRange(results, 0, k);
	}
	
	private static int[] findEvenNumber(int[] numbers) {
		int[] results = new int[numbers.length];
		int k = 0;
		for (int i=0; i<numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				results[k] = numbers[i];
				k++;
			}
		}
		return Arrays.copyOfRange(results, 0, k);
	}
	
	private static int[] findPowerOf(int[] numbers) {
		int[] results = new int[numbers.length];
		int k = 0;
		for (int i=0; i<numbers.length; i++) {
			if (numbers[i] % 5 == 0) {
				results[k] = numbers[i];
				k++;
			}
		}
		return Arrays.copyOfRange(results, 0, k);
	}
}
