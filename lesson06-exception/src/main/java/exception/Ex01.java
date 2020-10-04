package exception;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Ex01 {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter number: ");
		do {
			String s = ip.nextLine();
			if (s.matches("\\d+")) {
				// "\\d " là interger, + là 1 hoặc nhiều kí tự
				int number = Integer.parseInt(s);
				System.out.println("Value: " + number);
				break;
			}
			System.out.println("Enter number (\\d+)");

		}while (true); 

	}
}
