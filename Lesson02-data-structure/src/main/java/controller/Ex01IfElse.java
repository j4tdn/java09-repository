package controller;

import java.util.Scanner;

public class Ex01IfElse {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("nhap vao diem:");
		
		Float point = ip.nextFloat();
		if (point > 8) {
			System.out.println("gioi");
		} else if (point > 6.5) {
			System.out.println("kha");
		} else if (5 <= point) {
			System.out.println("trung binh");
		} else  {
			System.out.println("yeu");
		}

	}

}
