package controller;

import java.util.Scanner;

public class Ex01IfElse {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("nhap vao diem thi sinh");
		float diem = sc.nextFloat();
//do while
		if (diem< 5) {
			System.out.println("la hoc sinh yeu");
		} else if (diem <= 6.5) {
			System.out.println("hoc sinh turng binh");
		} else if (diem <= 8) {
			System.out.println("la hoc sinh kha");
		} else if (diem < 10) {
			System.out.println("hoc sinh gioi");
		}
	}
}
