package io;

import java.time.Year;
import java.util.Scanner;

public class Ex01 {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int year = inputNumber("Year Of Birth: ");
		int age = Year.now().getValue() - year;
		System.out.println("age: " + age);
	}
	
	private static int inputNumber(String func) {
		int number = 0;
		while(true) {
			System.out.print(func);
			String text = sc.nextLine();
			if(isNumber(text)) {
				number = Integer.parseInt(text);
				break;
			}
		}
		
		return number;
	}

	private static boolean isNumber(String text) {
		for(int i = 0; i < text.length(); i++) {
			if(!Character.isDigit(text.charAt(i))) {
				return false;
			}
		}
		return true;
	}
}