package declaration;

import java.util.Arrays;

public class Ex01 {
public static void main(String[] args) {
	
	//int, String, Item
	int[] digits = new int[10];
	//default elements int digits
	Arrays.fill(digits, 99);
	
	int[] digitsInit = { 5, 6, 7};
	String[] sequenses = { "A", "B", "C"};
	
	//array is an object type
	System.out.println(digits.getClass());
	System.out.println(digitsInit);
	System.out.println(sequenses.getClass());
	
	//multiple dimensiom
	//dimension: 2
	int [][] matrix = new int [2][2];
	int [][] matrixInit = { { 1,2 }, { 3,4 }};
	//3*3*3
	//dimension: 3: x,y,z
	//T:x,y,z
	int[][][] values = {{{1,2}, {1,2}}, {{3,4}, {3,4}}};
	
}
}
