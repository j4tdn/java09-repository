package io;

import java.time.Year;
import java.util.Scanner;

public class Ex01 {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Fullname: ");
		String fullname = scanner.nextLine();

		int year = inputNumber("yearofbirth: ");
 
		System.out.print("hobbies: ");
		String hobbies = scanner.nextLine();

		System.out.println("fullname : " + fullname + "\nage: " + (Year.now().getValue() - year) + "\nyearofbirth: "
				+ year + "\nhobbies: " + hobbies);
	}

	private static int inputNumber(String func) {
		System.out.println(func);
		int number = 0;
		while (true) {
			String text = scanner.nextLine();
			if (isNumber(text)) {
				number = Integer.parseInt(text);
				break;
			}
			System.out.println("Enter a valid number: ");
		}
		return number;
	}

	private static boolean isNumber(String text) {
		for (int i = 0; i < text.length(); i++) {
			if (!Character.isDigit(text.charAt(i))) {
				return false;
			}
		}
		return true;
	}

}
