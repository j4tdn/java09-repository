package Ex04;

import java.util.Random;

public class Ex04 {
	static Random rand = new Random();

	public static void main(String[] args) {
		int[] randNumbers = new int[5];
		for (int i = 0; i < randNumbers.length; i++) {
			randNumbers[i] = 1 + rand.nextInt(10);
		}
		for (int num : randNumbers) {
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println(getLeastCommonMultiple(randNumbers));
	}

	public static int getLeastCommonMultiple(int[] numbers) {
		int temp = (numbers[0] * numbers[1]) / getGreatestCommonDivisor(numbers[0], numbers[1]);
		for (int i = 0; i < numbers.length; i++) {
			temp = (temp * numbers[i]) / getGreatestCommonDivisor(temp, numbers[i]);
		}
		return temp;
	}

	public static int getGreatestCommonDivisor(int a, int b) {
		if (a == b) {
			return a;
		}
		if (a > b) {
			return getGreatestCommonDivisor(a - b, b);
		} else {
			return getGreatestCommonDivisor(a, b - a);
		}
	}
}
