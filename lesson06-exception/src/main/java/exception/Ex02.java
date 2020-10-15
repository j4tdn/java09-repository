 package exception;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Ex02 {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter number: ");
		int number = 0; 
do {
		try {
			number = Integer.parseInt(ip.nextLine());
			break;

		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("Invalid number!! ");
			System.out.println(e.getMessage());
		}
} while (true);
		System.err.println("Value: " + number);

	}
	} 


