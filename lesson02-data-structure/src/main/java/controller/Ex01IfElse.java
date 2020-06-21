package controller;

import java.util.Scanner;

public class Ex01IfElse {
	
	private static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter point: ");
		float point = ip.nextFloat();
		
		if(point < 5 ) {
			System.out.println("Yếu");
		} else if(point <= 6.5) {
			System.out.println("Trung Binh");
		} else if(point <= 8) {
			System.out.println("Kha");
		} else if(point <= 10) {
			System.out.println("Gioi");
		}
	}
}
