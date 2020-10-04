package exception;

import java.util.Scanner;

public class Ex01 {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter number: ");
		String s = scanner.nextLine();
		if (s.matches("\\d+")) {
			int number = Integer.parseInt(s);
			System.out.println("Value: " + number);
		} else {
			System.out.println("Invalid number");
		}
	}
}
