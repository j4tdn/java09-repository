package exercises;

import java.io.IOException;
import java.util.Scanner;

public class Ex01 {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		do {
			try {
				String result = doCalculation();
				System.out.println(result);
				break;
			} catch (NumberFormatException e1) {
				System.out.println(e1.getMessage());
			} catch (ArithmeticException e2) {
				// b!=0 a == 0 pt vô nghiệm
				System.out.println("Phương trình vô nghiệm");
				break;
			}
		} while (true);

	}

	private static String doCalculation() {
		int a = 0, b = 0;
		System.out.println("Enter a: ");
		a = Integer.parseInt(scanner.nextLine());

		System.out.println("Enter b: ");
		b = Integer.parseInt(scanner.nextLine());

		if (a == 0 && b == 0) {
			return "Vô số nghiệm";
		}
		float result = -b / a; // bẫy /by zero để có exception theo đề bài của anh :))
		result = (float) -b / a;
		return "Phương trình có nghiệm: " + String.valueOf(result);
	}
}
