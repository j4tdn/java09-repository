package exception;

import java.util.Scanner;

public class Ex01 {
	private static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter number: ");
		while (true) {
			String s = ip.nextLine();
			// \\d: số nguyên 0 -> 9
			// +: 1 hoặc nhiều kí tự
			if (s.matches("\\d+")) {
				int number = Integer.parseInt(ip.nextLine());
				System.out.println("Value: " + number);
				break;
			} else {
				System.out.println("Invalid number");
			}
		}
		
	}
}
