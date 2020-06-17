package io;

import java.time.Year;
import java.util.Scanner;

public class Ex01 {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("fullname:");
		String fullname = ip.nextLine();

		System.out.print("yearofbirth:");
		int year = Integer.parseInt(ip.nextLine());
		System.out.println("hobbies:");
		String hobbies = ip.nextLine();

		int yearText = inputNumber("year:");

		System.out.println("fullname:" + fullname + "\n" + "age:" + (Year.now().getValue() - year) + "\n" + "year:"
				+ year + "\n" + "hobbies: " + hobbies + "\n" + "yeartext:" + yearText);

	}

	private static int inputNumber(String func) {
		System.out.print(func);
		int number = 0;
		while (true) {
			String text = ip.nextLine();
			if (isNumber(text)) {
				number = Integer.parseInt(text);
				break;
			}
			System.out.print("Enter a valid number:");

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
