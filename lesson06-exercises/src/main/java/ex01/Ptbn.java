package ex01;

import java.util.Scanner;

public class Ptbn {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int a, b;
		float result = 0;
		while (true) {
			try {
				System.out.print("Nhap a ");
				a = Integer.parseInt(ip.nextLine()); 
				System.out.print("Nhap b ");
				b = Integer.parseInt(ip.nextLine());
				result = (float) -b / a;
				break;
			} catch (NumberFormatException| ArithmeticException e) {
				System.out.println("vui long nhap lai");
			} 
		}

		System.out.println("Ket qua: " + result);

	}
}
