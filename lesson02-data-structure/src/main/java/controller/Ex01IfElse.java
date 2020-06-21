package controller;

import java.util.Scanner;

public class Ex01IfElse {
	public static void main(String[] args) {
		System.out.println("Enter point: ");
		
		Scanner ip = new Scanner(System.in);
		float point = ip.nextFloat(); //0-10;
	//	do {
	//} while (point < 0 || point > 10 );
		if ( point < 5) {
			System.out.println("yeu");
		} else if (point <= 6.5) {
			System.out.println("trung binh");
		} else if (point <= 8) {
			System.out.println("kha");
		} else if (point <= 10) {
			System.out.println("gioi");
		}
	}
}
