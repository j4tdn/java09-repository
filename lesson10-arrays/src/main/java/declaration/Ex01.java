package declaration;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class Ex01 {
	public static void main(String[] args) {
		int[] digits = new int[10];
		Arrays.fill(digits, 99);
		
		int[] degitsInit= {5,3,8};
		String[] sequences= {"A","B","C"};
		
		System.out.println(digits.getClass());
		System.out.println(degitsInit);
		System.out.println(sequences.getClass());
		
		// dimension :2
		int [][] matrix =new int[2][2]; 
		int[][] matrixInit= {{1,2},{3,4}};
		
		//dimension :3 : x,y,z
		int[][][] values= {{{1,2},{1,2}},{{3,4},{3,4}}};
		}
}
