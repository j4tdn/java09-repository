package controller;

import java.util.Scanner;

public class Ex01IfElse {
	private static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		float diem = 0;
		do {
			System.out.print("Nhap diem: ");
			diem = ip.nextFloat();
		} while (diem < 0 || diem >10);
		if (diem < 5) {
			System.out.println("Yeu");
		} else if (diem <=6.5) {
			System.out.println("Trung binh");
		} else if (diem <=8) {
			System.out.println("Kha");
		} else {
			System.out.println("Gioi");
		}
	}
}
