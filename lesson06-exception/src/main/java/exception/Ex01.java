package exception;

import java.util.Scanner;

public class Ex01 {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		do {
			try {
				System.out.print("Enter number: ");
				int number = Integer.parseInt(sc.nextLine());
				System.out.println("value: " + number);
				break;
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} 
		} while (true);
	}
}
