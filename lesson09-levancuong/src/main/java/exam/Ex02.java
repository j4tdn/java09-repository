package exam;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhap so chuoi:");
		int n = Integer.parseInt(sc.nextLine());
		String[] inputs = new String[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap chuoi thu " + (i + 1) + ":");
			inputs[i] = sc.nextLine();
		}

		int[] result = getLargestNumbers(inputs);
		System.out.println("result:");
		for (int i : result) {
			System.out.println(i + "   ");
		}

	}

	private static int[] getLargestNumbers(String[] inputs) {
		int[] result = new int[inputs.length];
		int index = 0;
		for (int i = 0; i < inputs.length; i++) {
			result[index++] = getLargestNumber(inputs[i]);
		}

		return result;
	}

	private static int getLargestNumber(String input) {
		int max = 0;
		if (input.length() != 0) {
			String[] sNumbers = input.split("[a-z]+");
			int[] numbers = new int[sNumbers.length - 1];
			for (int i = 0; i < numbers.length; i++) {
				numbers[i] = Integer.parseInt(sNumbers[i + 1]);
			}
			max = findMax(numbers);
		}

		return max;
	}

	private static int findMax(int[] numbers) {
		int max = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (max < numbers[i]) {
				max = numbers[i];
			}
		}
		return max;
	}

}
