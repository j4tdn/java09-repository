package exception;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		do {
			try {
				int a = inputNumber();
				System.out.println("a:" + a);
				break;
			} catch (NumberFormatException e) {
				// TODO: handle exception
			}
			
		} while (true);
		
		do {
			try {
				int b = inputNumber();
				System.out.println("b:" + b);
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		} while (true);
		
		int c = inputNumber();
	}

	private static int devide(int a, int b) throws ArithmeticException {
		return a / b;
	}

	private static int inputNumber() throws NumberFormatException {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter number:");
		return Integer.parseInt(ip.nextLine());
	}

}
