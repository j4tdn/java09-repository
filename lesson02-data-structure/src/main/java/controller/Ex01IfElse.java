package controller;

import java.util.Scanner;

public class Ex01IfElse {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("Nhap diem:");
			float n = sc.nextFloat();
			if (n > 8) {
				System.out.println("gioi");
			} else if (n >= 6.6) {
				System.out.println("kha");
			} else if (n > 5) {
				System.out.println("Trung binh");
			} else
				System.out.println("Yeu");
		}
	}
}
