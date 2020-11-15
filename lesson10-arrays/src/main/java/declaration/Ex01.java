package declaration;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int[] digits = new int[10];
		int[] digitsInit = {1, 4, 8, 2, -9};
		
		Arrays.fill(digits, 99);
		String[] sequences = {"A", "B", "C"};
		
		System.out.println(digits.getClass());
		System.out.println(digitsInit);
		System.out.println(sequences.getClass());
		
		// multiple dimension
		int [][] matrix = new int[2][];
		int[][] matrixInit = {{1, 6, 8}, 
							{9, -5, 4}, 
							{3, 66, 3}};
		
		// dimension: 3
		int[][][] values = {{{1, 2}, {7, 4}}, 
				{{6, -9}, {7, 10}}, 
				{{-9, 4}, {5, 99}}};
	}
}
