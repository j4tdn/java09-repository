package exception;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		// Write ONE method
		// 1. Enter 2 digits a, b
		// 2. Calculate a / b
		try {
			int result = doCalculation();
			System.out.println("result: " + result);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static int doCalculation() throws Exception {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a = Integer.parseInt(ip.nextLine());

		System.out.print("Enter b: ");
		int b = Integer.parseInt(ip.nextLine());

		return a / b;
	}
}
