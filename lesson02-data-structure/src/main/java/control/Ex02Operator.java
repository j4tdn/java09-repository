package control;

import java.util.Random;
import java.util.Scanner;

public class Ex02Operator {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		//int number = new Random().nextInt(10);
		//System.out.println(number %2 ==0? "even" : "odd");
		
		System.out.println(max(7, 8, 9));
		
		

	}
	
	private static int max (int a, int b, int c) {
		int max =0;
		max = a > b ? a : b;
		return max > c? max : c;
	}

}
