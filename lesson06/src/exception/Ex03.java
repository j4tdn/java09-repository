package exception;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		do {
			try {

				int a = inputNumber();
				System.out.println("a: " + a);
				break;
			} catch (Exception e) {
			}
		} while (true);
		int b = inputNumber();
		int c = inputNumber();

	}
	private static int inputNumber()  {
		Scanner ip = new Scanner(System.in);

		return Integer.parseInt(ip.nextLine());
	}
}
