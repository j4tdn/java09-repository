package exception;

import java.util.Scanner;

public class Ex02 {
	private static Scanner ip = new Scanner(System.in);
	// \\d: so nguyen [0-9]
	// +: 1 hoac nhieu ki tu
	public static void main(String[] args) {
		System.out.print("Enter Number : ");
		int number = 0;
		do {
			try {
				number = Integer.parseInt(ip.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Invalid number !!!" );
			}
		} while (true);
		
		System.out.print("value :" + number);
	}

}
