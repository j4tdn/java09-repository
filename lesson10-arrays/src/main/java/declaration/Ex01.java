package declaration;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		//int, String, Item
		int[] digits = new int[10];
		int[] digitsInit = {5, 7, 3, 8, 9};
		//default elements in digits 
		Arrays.fill(digits, 99);
		String[] sequences = {"A", "B", "C"};
		System.out.println(digits.getClass());
		System.out.println(digitsInit);
		System.out.println(sequences.getClass());
		
		//multiple dimention
		//dimention: 2
		int[][] matrix = new int[2][2];
		int[][] matrixInit = {{1, 2}, {3, 4}};
		
		
		//dimention: 3
		int[][][] values = {{{1, 2},{1, 2}}, {{3, 4},{3, 4}}};
		
	}
}
