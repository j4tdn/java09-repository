package declaration;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int[] digits = new int[10];
		// default elements int digits.
		Arrays.fill(digits, 99);
		int[] digitsInit = { 5, 4, 3, 1, 123, 2, 3 };
		String[] sequences = { "a", "b", "c", "d" };
		System.out.println(digits.getClass());
		System.out.println(digitsInit.getClass());
		System.out.println(sequences.getClass());
		// multiple dimension
		int[][] matrix = new int[2][2];
		int[][] matrixInit = { { 1, 2 }, { 3, 4 } };
		// dimension: 3
		int[][][] values = { { { 1, 2 }, { 1, 2 } }, { { 3, 4 }, { 1, 2 } } };

	}
}
