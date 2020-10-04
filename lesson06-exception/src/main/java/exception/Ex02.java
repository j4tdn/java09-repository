package exception;

import java.util.Scanner;

public class Ex02 {
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		
		int number = 0;
		
		while (true) {
			try {
				System.out.printf("Enter number:");
				number = Integer.parseInt(ip.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Value: " +number);
	}
}
