package controller;

import java.util.Random;
import java.util.Scanner;

public class Ex02Operator {

	public static void main(String[] args) {
		int number = new Random().nextInt(10);
		System.out.println(number % 2 == 0 ? "Even" : "Odd");
		// a,b,c tim max
		int max =max(5, 8, 7);
		System.out.println("max" + max);

	}

	private static int max(int a, int b, int c) {
		int max = a > b ? a : b;
		return max > c ? max : c;

	}

}
