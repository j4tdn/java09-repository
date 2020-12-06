package exception;

import java.util.Scanner;
import java.util.function.IntPredicate;

public class Ex03 {
	public static void main(String[] args) throws ArithmeticException {
//		System.out.println(5/0);
//		do {
//			try {
//				int a = inputNumber();
//				System.out.println("a: " + a);
//				break;
//			} catch (NumberFormatException e) {
//			}
//		} while(true);
//		
//		int b = inputNumber();
//		int c = inputNumber();
		
		inputNumber();
	}

	private static int inputNumber() throws NumberFormatException{
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter number: ");
		return Integer.parseInt(ip.nextLine());
	}

	
}
