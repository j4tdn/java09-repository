package exception;

import java.util.Scanner;

public class Ex01 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter number: ");

		do {
			String s = sc.nextLine();
			if (s.matches("\\d+")) {
				int number = Integer.parseInt(s);
				System.out.println("Value: " + number);
				break;
			} else {
				System.out.print("Enter number \\d+: ");
			}
		} while (true);
	}
}
