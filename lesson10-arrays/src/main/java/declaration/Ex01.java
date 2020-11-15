package declaration;

import java.util.Arrays;

public final class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] digits = new int[10];
		 Arrays.fill(digits, 99);
		 
		 int[] digitsInt = {5,3,8};
		 String[] sequences = {"a","b","c"};
		 
		 System.out.println(digits.getClass());
		 System.out.println(digitsInt);
		 System.out.println(sequences.getClass());
		 
		 int[][] matrix = new int [2][2];
		 int[][] matrixInt = {{1,2},{3,4}};
		 
		 System.out.println(matrixInt);
		 
		 int[][][] values = {{{1,2},{1,2}},{{3,4},{3,4}}};
		 

	}

}
