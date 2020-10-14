package exception;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		do {
			try {
				int a = inputNumber();
				System.out.println("a:" + a);
				break;
			} catch (Exception e) {
				System.out.println("Sai roi!!!!!!!!!!!!!!");
			}
		} while (true);
	}
	private static int devide(int a,int b) throws ArithmeticException{
		return a/b;
	}
	private static int inputNumber() {
		Scanner ip = new Scanner(System.in);
		int number;
		System.out.print("Enter number :");
		return Integer.parseInt(ip.nextLine());
	}
}
