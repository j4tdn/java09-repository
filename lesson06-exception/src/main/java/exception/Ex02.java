package exception;

import java.util.Scanner;

public class Ex02 {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter number: ");
		int number = 0;

		do {
			try {
				number = Integer.parseInt(scanner.nextLine());
				break;
			} catch (NumberFormatException e) {
//				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		} while (true);
		System.out.println("Value: " + number);
	}
}
