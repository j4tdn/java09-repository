package exception;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		int a, b, c;
		do {
			try {
				a = inputNumber();
				System.out.println("a: " + a);
				break;
			} catch (Exception e) {
			}
		} while (true);
		b = inputNumber();
		c = inputNumber();
		int result = devide(a, b);
		System.out.println("result: " + result);
	}

	private static int inputNumber() throws NumberFormatException {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter Number: ");
		return Integer.parseInt(ip.nextLine());

	}

	public static int devide(int a, int b) throws ArithmeticException {
		return a / b;
	}
}
