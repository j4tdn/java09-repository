package exception;

import java.util.Scanner;

public class Ex02 {

	private static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
			System.out.println("enter number: ");
			
		int numbers =0;
		do {
			try {
				 numbers = Integer.parseInt(ip.nextLine());
				 break;
			} catch (Exception e) {
				System.out.println("invali number");
			}
		}while (true);
			System.out.println("value "+numbers);
			
}
}

