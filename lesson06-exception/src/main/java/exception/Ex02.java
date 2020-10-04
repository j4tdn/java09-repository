package exception;

import java.util.Scanner;

public class Ex02 {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("enter number: ");
		int number = 0;
		do {
			
			try {
				number = Integer.parseInt(ip.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println(e.getMessage());
			}
		} while (true);
		System.out.println("value=   " + number);
	}
}
