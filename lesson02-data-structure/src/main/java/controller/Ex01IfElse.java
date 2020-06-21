package controller;

import java.util.Scanner;

public class Ex01IfElse {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter point: ");
		float point = scanner.nextFloat();
		if (point < 5) {
			System.out.println("yeu");

		} else if (point < 6.5) {
			System.out.println("trung binh");
		} else if (point < 8) {
			System.out.println("kha");
		} else if(point <= 10) {
			System.out.println("gioi");
		}
			

	}
}
