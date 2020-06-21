package controller;

import java.util.Scanner;

public class Ex01IfElse {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("nhap point: ");
		float point =ip.nextFloat();
		if ( point < 5 ) {
			System.out.println("yeu");
		}   else if (point <= 6.5 ) {
			System.out.println("trung binh");
		} 
		else if(point<=8) {
			System.out.println("kha");
			
		} else if(point <=10) {
			System.out.println("gioi");
			
		}
		}
		
	
}
