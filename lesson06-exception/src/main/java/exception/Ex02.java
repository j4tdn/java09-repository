package exception;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Ex02 {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		// \\d: số nguyên [0-9]
		// +: 1 hoặc nhiều kí tự
		System.out.print("Enter number: ");
		int number = 0;
		do {
			try {
				number = Integer.parseInt(ip.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Invalid number !!!");
			}
		} while(true);
		System.out.println("Value: " + number);
	}
}
