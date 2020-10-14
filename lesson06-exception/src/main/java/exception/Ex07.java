package exception;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		//Write one method
		//1. Enter 2 digits a,b
		//2. Calculatate a/b
		try {
			int result1=doCalculation();
			System.out.println("result:"+result1);
		} catch (NumberFormatException e) {
			System.out.println("E1:"+e.getMessage());
			// TODO: handle exception
		}catch (ArithmeticException e1) {
			System.out.println("E2:"+e1.getMessage());
		}
	}
	private static int doCalculation() throws NumberFormatException,ArithmeticException {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a: ");
		int a=Integer.parseInt(sc.nextLine());
		System.out.print("Enter b: ");
		int b=Integer.parseInt(sc.nextLine());
		return a/b;
	}
}
