package controller;

import java.util.Random;

public class Ex02Operator {
	public static void main(String[] args) {
		int number = new Random().nextInt(10);
		System.out.println(number % 2 == 0 ? "Even" : "Odd");
		// a,b,c tim Max

	}

	private static int max(int a, int b, int c) {
		int max;
		max = a > b ? a : b;
		return max > c ? max : c;
	}
}
