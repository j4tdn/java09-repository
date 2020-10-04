package exception;

import java.util.Scanner;

public class Ex02 {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter number ");

		int number = 0;
		do {
			try {
				number = Integer.parseInt(ip.nextLine());
				break;

			} catch (NumberFormatException e) {
				System.out.println(e.getMessage());
				// System.out.println("Invalid number");
			}
		} while (true);
		System.err.println("value: " + number);

	}

}
