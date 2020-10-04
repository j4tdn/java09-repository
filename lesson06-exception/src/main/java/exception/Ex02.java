package exception;

import java.util.Scanner;

public class Ex02 {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		do {
			try {
				System.out.print("Nhap 1 so :");
				int number = Integer.parseInt(ip.nextLine());
				System.out.println("Value: " + number);
				break;
			} catch (Exception e) {
				System.out.println("Invalid number");
			}
		} while (true);
		System.out.println("Haha");
	}
}
