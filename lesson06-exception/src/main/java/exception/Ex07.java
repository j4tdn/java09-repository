package exception;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		
		try {
			int result = doCaculate();
			System.out.println("result : " + result);
			
		} catch (NumberFormatException e1) {
			System.out.println(e1.getMessage());
		} catch (Exception e2) {
			System.out.println(e2.getMessage());
		}
		
	}
	public static int doCaculate() throws NumberFormatException, ArithmeticException {
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Enter a:  ");
		int a = ip.nextInt();
		
		System.out.print("Enter b:  ");
		int b = ip.nextInt();
		
		return a/b;
	}
}
