package exception;

import java.util.Scanner;

public class Ex02 {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter number:");
		
		int number = 0;
		do {
			try {
				String s = ip.nextLine();
				number = Integer.parseInt(s);
				break;
			} catch (NumberFormatException e) {
				 System.out.print(e.getMessage());;
			}
		} while (true);
		System.out.println("Value:" + number);
	}
}
