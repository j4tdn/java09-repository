package controller;

import java.util.Random;

public class Ex02Operator {
	public static void main(String[] args) {
		int number = new Random().nextInt(10);
		System.out.println( number + " " + (number % 2 == 0 ? "Even" : "Odd"));
		System.out.println("So lon nhat la :" + max(5,4,7));
	}
	private static int max(int a,int b,int c) {
		int max = (a >b && a > c) ? a : (b > c ) ? b :c ;
		return max;
	}
}
