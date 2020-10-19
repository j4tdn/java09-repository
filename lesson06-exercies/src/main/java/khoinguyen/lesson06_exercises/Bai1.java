package khoinguyen.lesson06_exercises;

import java.util.Scanner;


public class Bai1 {
	public static void main(String[] args) {
		int a, b;
		float result = 0;
		Scanner ip = new Scanner(System.in);
		System.out.println("GIẢI CHƯƠNG TRÌNH BẬC NHẤT");
		while (true) {
			try {
				System.out.print("Nhập a: ");
				a = Integer.parseInt(ip.nextLine());
				System.out.print("Nhập b: ");
				b = Integer.parseInt(ip.nextLine());
				result = (float) -b / a;
				break;
			} catch (NumberFormatException | ArithmeticException e) {
				System.out.println("vui long nhap lai");
			}
		}
		System.out.println("Kết quả là :" + result);	
	}
}