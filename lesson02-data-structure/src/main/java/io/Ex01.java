package io;

import java.time.Year;
import java.time.YearMonth;
import java.util.Scanner;

public class Ex01 {
	private static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		System.out.print("full name: ");
		String fullName = ip.nextLine();
		
		
		System.out.print("age: ");
		int age = ip.nextInt();
		
		System.out.print("yearofbirth: ");
		int year = Integer.parseInt(ip.nextLine());
		
		System.out.println("hobbies: ");
		String hobbies = ip.nextLine();
		
		System.out.println("====================");
		System.out.println("fullname: "+ fullName
				+"\nage: " + (Year.now().getValue() - year)
				+"\nyear: " + year
				+ "\nhobbies: " + hobbies);
	}
	private static int inputNumber(String func) {
		System.out.println(func);
		int number = 0;
		
		while(true) {
			String text = ip.nextLine();
			if(isNumber(text)) {
				number = Integer.parseInt(text);
				break;
			}
			System.out.println("Enter a valid number");
		}
		return number;
		
	}
	private static boolean isNumber(String text) {
		for(int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			if(!Character.isDigit(c)) {
				return false;
			}
			return true;
		}
		return false;
	}
}
