package exception;

import java.util.Scanner;

public class Ex02 {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		int number;
		do {
			try {
				System.out.print("Nhap 1 so :");
				number = Integer.parseInt(ip.nextLine());
				System.out.println("Value: " + number);
				break;
			} catch (Exception e) {
				System.out.println("Invalid number");
			}
		} while (true);
		
		
//		try {
//			System.out.print("Nhap 1 so :");
//			number = Integer.parseInt(ip.nextLine());
//			System.out.println("Value: " + number);
//			
//		} catch (Exception e) {
//			System.out.println("Invalid number");
//		}
//		System.out.println("adsasas");
		
	}
}
