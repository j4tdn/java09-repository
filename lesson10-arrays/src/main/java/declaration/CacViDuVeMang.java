package declaration;

import java.util.Arrays;

public class CacViDuVeMang {
	public static void main(String[] args) {
		int[] digits = new int[10];
		Arrays.fill(digits, 99);//tat ca cac phan tu trong digits deu bang 99
		
		int[] digitsInit = {2,5,7};
		String[] sequences = {"A","B","C"};
		
		//array thuoc kieu doi tuong
		System.out.println(digits.getClass());
		System.out.println(digitsInit.getClass());
		System.out.println(sequences.getClass());
		
		//mang 2 chieu
		int[][] marix = new int[2][2];//2 dong va 2 cot
		int[][] matrixInit = {{1,2},{3,4}};
		
		//mang 3 chieu
		int[][][] values = { { { 1 , 2 } , { 1 , 2 } } , { { 3 , 4 } , { 3 , 4 } } } ;
	}
}
