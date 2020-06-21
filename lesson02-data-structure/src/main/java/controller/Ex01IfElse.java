package controller;

import java.util.Scanner;

public class Ex01IfElse {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter diem : "); //0-10
		float point = ip.nextFloat();

		if (point < 5) {
			System.out.print("yeu");
		} else if ( point >= 6.5) {
			System.out.print("trung binh");
		} else if ( point <= 8) {
			System.out.print("kha");
		} else if (point <= 10) {
			System.out.print("Gioi");
		}
	}
}
