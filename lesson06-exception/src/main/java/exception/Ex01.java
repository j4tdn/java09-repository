package exception;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Ex01 {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		// \\d: số nguyên [0-9]
		// +: 1 hoặc nhiều kí tự
		System.out.print("Enter number: ");
		do {
			String s = ip.nextLine();
			if (s.matches("\\d+")) {
				int number = Integer.parseInt(s);
				System.out.println("Value: " + number);
				break;
			}
			System.out.print("Enter number (\\d+): ");
		} while(true);

	}
}
