package exception;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		do {
			try {
				int a = inputnumber();
				System.out.println("a: "+ a);
				break;
			} catch (Exception e) {
			}
		} while (true);
		
		int b = inputnumber();
		int c = inputnumber();
	}

	private static int inputnumber() throws NumberFormatException {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter number: ");
		return Integer.parseInt(ip.nextLine());
	}

	private static int devide(int a, int b) throws ArithmeticException {
		return a / b;
	}
}
