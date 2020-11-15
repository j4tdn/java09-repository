package declaration;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		// int string item
		int[] digits = new int[10];
		// default element int digits
		Arrays.fill(digits, 99);
		int[] digitsInit = { 1, 3, 45, 6 };
		String[] sequences = { "a", "b", "c" };
		// array is an object type
		System.out.println(digits.getClass());
		System.out.println(digitsInit);
		System.out.println(sequences.getClass());

		// multiple dimension
		//dimension :2
		int[][] matrix = new int[2][2];
		int[][] matrixiInit = { { 1, 2 }, { 3, 4 } };
		//dimension:3
		int [][][] values = {{{1,2},{2,3}},{{3,2},{5,3}}};

	}

}
