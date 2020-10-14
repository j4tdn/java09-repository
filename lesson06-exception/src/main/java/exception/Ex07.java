package exception;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ex07 {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		try {
			int result = calculate();
			System.out.println("result: " + result);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
	
	private static int calculate() throws NumberFormatException, ArithmeticException{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a = Integer.parseInt(sc.nextLine());
		System.out.print("Enter b: ");
		int b = Integer.parseInt(sc.nextLine());
		
		return a / b;
	}
}
