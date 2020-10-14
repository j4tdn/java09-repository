package exception;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		try {
			int result = doCalculation();
			System.out.println("result: "+ result);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
	}
	
	private static int doCalculation() throws NumberFormatException, ArithmeticException{
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a: ");
		int a = Integer.parseInt(ip.nextLine());
		int b = Integer.parseInt(ip.nextLine());
		return a/b;
	}
}
