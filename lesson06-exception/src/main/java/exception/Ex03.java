package exception;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {

		do {
			try {
				int a = inputNumber();
				System.out.println(a);
				break;
			} catch (NumberFormatException e) {
				// TODO: handle exception
			}
		} while (true);
		
		int b = inputNumber();
		int c = inputNumber();
	}

	private static int inputNumber() throws NumberFormatException {
		Scanner scanner = new Scanner(System.in);
		return Integer.parseInt(scanner.nextLine());
	}

}
