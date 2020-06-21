package controller;

import java.util.Random;

public class Ex02Operator {
	public static void main(String[] args) {
		int number = new Random().nextInt(10);
		System.out.println(number % 2 == 0 ? "Even" : "Odd");

		int a = 7, b = 5, c = 10;
		System.out.println("max: " + max(a, b, c));
	}

	private static int max(int a, int b, int c) {
		return ((a > b) ? a : b) > c ? ((a > b) ? a : b) : c;
	}
}