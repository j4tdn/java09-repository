package functionalinterface;

import java.util.Arrays;
import java.util.function.Predicate;

public class ArrayProcessing {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6 };
		int[] oddNumbers  = findNumber(numbers,(a)->a%2 == 1);
		forEach("Print of odd numbers:",oddNumbers);
	}
	
	private static void forEach (String title,int[] numbers) {
		System.out.println(title);
		for (int number : numbers) {
			System.out.println(number + " ");
		}
	}
	
	private static int[] findNumber (int[] numbers , Predicate<Integer> predicate) {
		int[] result = new int[numbers.length];
		int k = 0;
		for (int number : numbers) {
			if (predicate.test(number)) {
				result[k++] = number;
			}
		}
		return Arrays.copyOfRange(result, 0, k);
	}
}
