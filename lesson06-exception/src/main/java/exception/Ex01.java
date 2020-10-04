package exception;

import java.util.Scanner;

public class Ex01 {
	private static Scanner ip = new Scanner(System.in);

	// \\d: so nguyen [0-9]
	// +: 1 hoac nhieu ki tu
	public static void main(String[] args) {
		System.out.print("Enter Number : ");
		do {
			String s = ip.nextLine();
			if (s.matches("\\d+")) {
				int number = Integer.parseInt(s);
				System.out.println("value :  " + number);
				break;
			}
			System.out.print("Enter number :");
		} while (true);
	}

}
