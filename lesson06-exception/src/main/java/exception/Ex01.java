package exception;

import java.util.Scanner;

public class Ex01 {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter number:");
		int number = 0;

		do {
			try {
				number = Integer.parseInt(ip.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println(e.getMessage());
			}
			System.out.print("Enter number:");
		} while (true);

		System.out.println("Value:" + number);

	}
}
