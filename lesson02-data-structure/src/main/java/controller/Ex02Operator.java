package controller;

import java.util.Random;

public class Ex02Operator {
	public static void main(String[] args) {
		int number = new Random().nextInt(10);
		System.out.println(number % 2 == 0 ? "Even" : "Odd");

		// a,b,c. Tìm max
		int max = max(20, 9, 25);
		System.out.println("max " + max);
		
		// float point
		float point = 2.2f;
		String result = point < 5 ? "Yếu" 
				: point <= 6.5 ? "Trung bình" 
				: point <= 8 ? "Khá"
				: "Giỏi";
		System.out.println("Result: " + result);
	}

	private static int max(int a, int b, int c) {
		return (a > b ? a : b) > c ? (a > b ? a : b) : c;
	}
}
