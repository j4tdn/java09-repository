package declaration;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int[] digits = new int[10];
		// default elements in digits
		Arrays.fill(digits, 99);

		int[] digitsInit = { 5, 4, 8 };

		String[] sequences = { "a", "b", "c" };
		System.out.println(digits.getClass());
		System.out.println(digitsInit);
		System.out.println(sequences.getClass());

		// multiple dimension
		int[][] matrix = new int[2][2];
		int[][] matrixInit = { { 1, 2 }, { 3, 4 } };

		// 3
		int[][][] values = { { { 1, 2 }, { 3, 4 } }, { { 1, 2 }, { 3, 4 } }, { { 1, 2 }, { 3, 4 } } };

	}
}
