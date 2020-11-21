package declaration;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int[] digits=new int[10];
		Arrays.fill(digits, 99);
		
		
		int[] digitInit= {1,2,3};
		String[] sequences= {"A","C","B"};
		System.out.println(digits.getClass());
		System.out.println(digitInit);
		System.out.println(sequences.getClass());
		
		int[][] matrix= new int[2][2];
		int [][] matrixInit= {{1,2},{3,4}};
	}
}
