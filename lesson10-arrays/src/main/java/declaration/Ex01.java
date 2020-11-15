package declaration;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		//int, String, item
		int[] digits = new int[10];
		Arrays.fill(digits, 99);
		
		int[] digitsInit = {5, 3, 8};
		String[] sequences = {"A", "B", "C"};
		
		//array is an object type
		System.out.println(digits.getClass());
		System.out.println(digitsInit);
		System.out.println(sequences.getClass());
		
		//multiple dimension
		//dimension: 2
		int[][] matrix = new int [2][2];
		int[][] matrixInit = {{1,2}, {3,4}};
		
		//dimension: 3
		//T: x,y,z
		int[][][] values = {{{1,2}, {1,2}}, {{3,4},{3,4}}};
		
 	}
}
