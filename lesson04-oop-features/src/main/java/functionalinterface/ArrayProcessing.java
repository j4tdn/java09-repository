package functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ArrayProcessing {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6};
		int[] oddNumbers = findNumbers(numbers, number -> number % 2 == 1);
		show(oddNumbers);
		int[] evenNumbers = findNumbers(numbers, number -> number % 2 == 0);
		show(evenNumbers);
	}
	
	public static int[] findNumbers(int[] numbers, Predicate<Integer> pre) {
		List<Integer> result = new ArrayList<Integer>();
		for(int number : numbers) {
			if(pre.test(number)) {
				result.add(number);
			}
		}
		
		return result.stream().mapToInt(Integer::intValue).toArray();
	}
	
	private static void show(int[] numbers) {
		for(int number : numbers) {
			System.out.printf("%-5d", number);
		}
		System.out.println();
	}
}
