package exception;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		
		try {
			int result = doCalculation();
			System.out.println("Result: "+result);
		} catch (NumberFormatException e1) {
			System.out.println("E1: "+e1.getMessage());
		} catch (ArithmeticException e2) {
			System.out.println("E2: "+e2.getMessage());
		}
	}

	public static int doCalculation() throws NumberFormatException, ArithmeticException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a: ");
		int a = Integer.parseInt(scanner.nextLine());

		System.out.println("Enter b: ");
		int b = Integer.parseInt(scanner.nextLine());

		return a / b;
	}
}
