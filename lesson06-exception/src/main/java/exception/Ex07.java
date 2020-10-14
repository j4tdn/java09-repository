package exception;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		try {
			int result = doCalculate();
			System.out.println("Result:" + result);
		} catch (Exception e) {
			System.out.println("E: " + e.getMessage());
		}
	}

	private static int doCalculate() throws ArithmeticException, NumberFormatException {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter a:");
		int a = Integer.parseInt(ip.nextLine());
		System.out.print("Enter b:");
		int b = Integer.parseInt(ip.nextLine());
		return a / b;
	}
}
