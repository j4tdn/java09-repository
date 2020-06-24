package controller;

import java.util.Random;

public class Ex02Operator {
	public static void main(String[] args) {
		int number = new Random().nextInt(10);
		System.out.println(number + " " + (number % 2 == 0 ? "Even" : "Odd"));
		System.out.println("max: " + max(5, 20, 9));
	}

	private static int max(int a, int b, int c) {
		return ((a > b ? a : b) > c ? (a > b ? a : b) : c);
	}
}
