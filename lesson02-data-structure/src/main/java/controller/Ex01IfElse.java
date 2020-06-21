package controller;

import java.util.Scanner;

public class Ex01IfElse {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Enter point:");
		float x = sc.nextFloat();

		if (x < 5) {
			System.out.println("Yếu");
		} else if (x <= 6.5) {
			System.out.println("Trung bình");
		} else if (x <= 8) {
			System.out.println("Khá");
		} else if (x <= 10) {
			System.out.println("Giỏi");
		}
	}
}
