package exception;

import java.util.Scanner;

public class Ex02 {
	private static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		int number = 0;
		System.out.println("Enter number: ");
			String s = ip.nextLine();
			// \\d: số nguyên 0 -> 9
			// +: 1 hoặc nhiều kí tự
			do {
				try {
					 number = Integer.parseInt(ip.nextLine());
					 break;
				} catch (NumberFormatException e) {
					// TODO: handle exception
					System.out.println("Invalid number !!!");
				}
			} while(true);
			
			System.out.println("Value: " + number);
		}
		
}
