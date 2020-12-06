package controller;

import java.util.Scanner;

public class Ex01IfElse {

	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		/**
		 * Nhập vào điểm của thí sinh bất kì. Kiểm tra < 5 : Yếu 5 – 6.5 : Trung Bình
		 * 6.6 – 8 : Khá > 8 : Giỏi
		 */
		System.out.print("Enter point: ");
		float point = ip.nextFloat(); // 0-10 - Tu lam

		if (point < 5) {
			System.out.println("Yếu");
		} else if (point <= 6.5) {
			System.out.println("Trung Bình");
		} else if (point <= 8) {
			System.out.println("Khá");
		} else if (point <= 10) {
			System.out.println("Giỏi");
		}
	}
}
