package exception;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		int result = 0;
		try {
			result = doCalculation();
		} catch (ArithmeticException e) {
			System.out.println("Error 1 :" + e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("Error 2 :" + e.getMessage());
		}
		
		System.out.println("Result : " + result);
	}
	
	private static int doCalculation() throws NumberFormatException, ArithmeticException {
		Scanner ip = new Scanner(System.in);

		System.out.print("Enter a :");
		int a = Integer.parseInt(ip.nextLine());

		System.out.print("Enter b :");
		int b = Integer.parseInt(ip.nextLine());

		return a / b;
	}
}
