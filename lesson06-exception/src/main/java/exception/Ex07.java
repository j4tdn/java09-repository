package exception;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		//write One method
		//1. Enter 2 digits a,b
		//1. Calculate a/b
		try {
			int result= doCaclculation();
			System.out.println("result: "+ result);
		} catch (NumberFormatException e1) {
			System.out.println("E1: "+ e1.getMessage());
		} catch (ArithmeticException e2) {
			System.out.println("E2: "+ e2.getMessage());
		}
}
	
	private static int doCaclculation() throws NumberFormatException, ArithmeticException {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a: ");
		int a = Integer.parseInt(ip.nextLine());
		
		System.out.println("Enter b:");
		int b = Integer.parseInt(ip.nextLine());
		
		return a/b;
	}
	
}
