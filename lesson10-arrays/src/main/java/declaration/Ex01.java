package declaration;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int[] digits = new int[10];
		Arrays.fill(digits, 9);
		int[] digitsInit = { 1, 2, 3 };
		String[] sequences = { "a", "b", "c" };

		System.out.println(digits.getClass());
		System.out.println(digitsInit);
		System.out.println(sequences);

		// multiple dimension
		// dimension: 2
		int[][] matrix = new int[2][2];
		int[][] matrixInit = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		// dimension: 3
		int[][][] values = { { { 1, 2 }, { 1, 2 } }, { { 1, 2 }, { 1, 2 } } };
	}
}
