package declaration;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		//int  string item
		
		int[] digits = new int[10];
		//default element int digits
		Arrays.fill(digits, 99);
		//array is an object type
		String[] sequences = {"a", "b", "c"};
		int[]digitInit= {5, 3, 5, 6, 7};
		System.out.println(digits.getClass());
		System.out.println(digitInit);
		System.out.println(sequences.getClass());
	//multiple dimension
		//demension 1
		int[][] matrix = new int[2][2];
		int[][] maxtrixInit= {{1,2},{2,4}};
		//dimension: 3 
		int[][][] value = {{{1,2},{1,2},{1,2}},{{1,2},{1,2},{1,2}}};
		
	}
}
