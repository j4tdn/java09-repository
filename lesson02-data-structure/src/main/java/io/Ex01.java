package io;

import java.time.Year;
import java.util.Scanner;

public class Ex01 {
	private static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Fullname:");
		String fullName = ip.nextLine();
		System.out.print("year of birth:");
		int year = inputNumber(ip.nextLine());

		System.out.print("Hobbies:");
		String hobbies = ip.nextLine();

		System.out.println("fullname: " + fullName + "\nage:" + (Year.now().getValue() - year) + "\nyear:" + year
				+ "\nhobbies:" + hobbies);
	}

	private static int inputNumber(String text) {
		int number = 0;
		while (true) {
		 text   = ip.nextLine();
			if (isNumber (text)) {
				number = Integer.parseInt(text);
				break;
			}
			System.out.println("Enter the valid number:");
		}
		return number;
	}

	private static boolean isNumber(String text) {
		for (int i=0;i<text.length();i++) {
		    if ( !Character.isDigit(text.charAt(i))) {
		    	return false;
		    }
		}
		return true;
	}
}
