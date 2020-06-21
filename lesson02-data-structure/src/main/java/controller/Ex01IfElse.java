package controller;

import java.util.Scanner;

public class Ex01IfElse {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		float grade = sc.nextFloat();
		
		if(grade < 5) {
			System.out.println("Yếu");
		} else {
			if(grade <= 6.5) {
				System.out.println("Trung bình");
			} else {
				if(grade <= 8) {
					System.out.println("Khá");
				} else {
					System.out.println("Giỏi");
				}
			}
		}
	}
}
