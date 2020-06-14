package exercise;

import java.util.Random;

public class Ex07 {
	public static void main(String[] args) {
		int[] randomNumbers = new int[5];

		for (int i = 0; i < randomNumbers.length; i++) {
			randomNumbers[i] = getNewRandomNumber(randomNumbers);
		}

		System.out.print("Các số random: ");
		for (int randomNumber : randomNumbers) {
			System.out.printf("%5d", randomNumber);
		}
	}

	private static int getNewRandomNumber(int[] randomNumbers) {
		int number;
		do {
			Random rd = new Random();
			number = 20 + rd.nextInt(11);
		} while (isContain(number, randomNumbers));
		return number;
	}

	private static boolean isContain(int number, int[] randomNumbers) {
		for (int randomNumber : randomNumbers) {
			if (randomNumber == number) {
				return true;
			}
		}
		return false;
	}
}
