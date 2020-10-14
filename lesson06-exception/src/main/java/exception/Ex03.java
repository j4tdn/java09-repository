package exception;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		do {
			try {
				int a = inputNumber();
				System.out.println(a);
				break;
			} catch (Exception e) {
			}
		} while (true);

		int b = inputNumber();
		int c = inputNumber();
	}

	private static int inputNumber() throws NumberFormatException {
		Scanner ip = new Scanner(System.in);
		System.out.println("enter number");
		return Integer.parseInt(ip.nextLine());

	}

	private static int devide(int a, int b) throws ArithmeticException {

		return a / b;
	}
}
