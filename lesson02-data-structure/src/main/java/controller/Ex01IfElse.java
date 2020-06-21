package controller;

import java.util.Scanner;

public class Ex01IfElse {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter point ");// 0-10
		float point = ip.nextFloat();
		if (point >= 0) {
			System.out.println("Yếu");
		} else if (point <= 6.5) {
			System.out.println("Trung bình");
		} else if (point < 8) {
			System.out.println("Kha");
		} else if (point <= 10) {
			System.out.println("Giỏi");
		}

	}
}
