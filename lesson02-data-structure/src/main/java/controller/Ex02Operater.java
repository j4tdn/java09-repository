package controller;

import java.util.Random;

public class Ex02Operater {
	public static void main(String[] args) {

		
		int max=max(2,3,4);
		System.out.println(max);
		int number = new Random().nextInt(10);
		System.out.println(number);
		System.out.println(number%2==0 ?"even" : "odd");
		
	}
	private static int max(int a, int b, int c) {
		int max= a > b ? a:b;
		
		return max > c ? max:c; 
		
	}
	
}
