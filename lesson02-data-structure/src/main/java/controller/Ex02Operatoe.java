package controller;

import java.util.Random;

public class Ex02Operatoe {
	public static void main(String[] args) {
		int number = new Random().nextInt(10);
		System.out.println(number % 2 == 0 ? "even" : "Odd");
		System.out.println(max(1,4,3));
	}

	private static int max(int a, int b, int c) {
		int max = a > b ? a : b;
		max = max > c ? max : c;
		return max; 
	}
}
