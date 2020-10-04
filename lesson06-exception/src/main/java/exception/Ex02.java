package exception;

import java.util.Scanner;

public class Ex02 {

	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter Number: ");

		int number = 0;
		do {
			try {
				number = Integer.parseInt(ip.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Invalid number: ");
			}
		} while (true);
		System.out.println("Value: " + number);
	}
}