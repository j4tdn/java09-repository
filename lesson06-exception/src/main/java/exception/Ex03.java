package exception;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		do {
			try {
				int a=inputNumber();
				System.out.println("a:"+a);
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}while(true);
		int b=inputNumber();
		int c=inputNumber();
	}
	private static int inputNumber() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		return Integer.parseInt(sc.nextLine());
	}
	private static int devide(int a,int b) throws ArithmeticException {
		return a/b;
	}
}
