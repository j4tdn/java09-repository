package exception;

import java.util.Scanner;

public class Ex03 {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		do {
			try {
				int a = inputNumber();
				break;
			} catch (Exception e) {
			}
		} while (true);
		
		int b = inputNumber();
		int c = inputNumber();
	}
	
	private static int inputNumber() throws NumberFormatException {
		System.out.print("Enter number: ");
		return Integer.parseInt(sc.nextLine());
	}
	
	private static int devide(int a, int b) throws ArithmeticException{
		return a / b;
	}
}
