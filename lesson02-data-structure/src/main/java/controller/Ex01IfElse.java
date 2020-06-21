package controller;

import java.util.Scanner;

public class Ex01IfElse {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Enter point:");
		String result = "";
		float mark = Float.parseFloat(ip.nextLine());//0-10
		if (mark < 5.0f) {
			result = "yeu";
		} else {
			if (mark <= 6.5f) {
				result = "trung binh";
			} else {
				if (mark <= 8) {
					result = "kha";
				} else {
					result = "gioi";
				}
			}
		}
		System.out.println("Rate:" + result);
	}
}
