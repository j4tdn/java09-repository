package declaration;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int[] digits = new int[10];
		// default elements int digits
		Arrays.fill(digits, 99);

		int[] digitsinit = { 5, 3, 8 };
		String[] sequences = { "A", "b", "C" };

		// array is an object type
		System.out.println(digits.getClass());
		System.out.println(digits.getClass());
		System.out.println(sequences.getClass());

		// multiple dimension
		int[][] matrix = new int[2][2];
		int[][] matrixInit = { { 1, 2 }, { 3, 4 } };
		
		//matrix 3*3
		int[][][] values = {{{1,2}, {1,2}},{{3,4}, {3,4}}};

	}

}
