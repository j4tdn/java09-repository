package ex01;

import java.util.Arrays;
import java.util.Random;

public class Ex01 {
	static Random rand = new Random();

	public static void main(String[] args) {
		int[] randNumbers = new int[10];
		for (int i = 0; i < 10; i++) {
			randNumbers[i] = rand.nextInt(15);
		}
		for (int num : randNumbers) {
			System.out.print(num + " ");
		}
		int[] result = getUniqueNumbers(randNumbers);
		System.out.println();
		for (int num : result) {
			System.out.print(num + " ");
		}
	}

	private static int[] getUniqueNumbers(int[] numbers) {
		int[] result = new int[numbers.length];
		int length = 0;
		int[] check = new int[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			int count = 0;
			if (check[i] == 1) {
				continue;
			}
			for (int j = i + 1; j < numbers.length; j++) {

				if (numbers[i] == numbers[j]) {
					check[j] = 1;
					count++;
				}

			}
			if (count == 0) {
				result[length++] = numbers[i];
			}
		}
		Arrays.sort(result, 0, length);
		return Arrays.copyOfRange(result, 0, length);

	}
}
