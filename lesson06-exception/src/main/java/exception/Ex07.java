package exception;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		// write ONE method
		// viết2số,tínha/b.
		try {
			int result = doCalculation();
			System.out.println("result :" + result);
		} catch (NumberFormatException e1) {
			System.out.println("E1" + e1.getMessage());
		} catch (Exception e2) {
			System.out.println("E2" + e2.getMessage());
		}
	}

	private static int doCalculation() throws NumberFormatException, ArithmeticException {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a : ");
		int a = Integer.parseInt(ip.nextLine());
		System.out.println("Enter b : ");
		int b = Integer.parseInt(ip.nextLine());
		return a / b;
	}
}
