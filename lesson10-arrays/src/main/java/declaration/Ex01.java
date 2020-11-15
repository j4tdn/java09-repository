package declaration;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		// int , String, Item
		int[] digits = new int[10];
		int[] digitsInit = { 5, 3, 8 };
		// default element int digit
		Arrays.fill(digits, 99);
		String[] sequences = { "A", "B", "C" };
		System.out.println(digits.getClass());
		System.out.println(digitsInit.getClass());
		System.out.println(sequences.getClass());

		int[][] matrix = new int[2][2];
		int[][] matrixInt = { { 1, 2 }, { 3, 2 } };
		
		int [][][]  values = {{{1,2},{3,4}}};
		
	}
}
