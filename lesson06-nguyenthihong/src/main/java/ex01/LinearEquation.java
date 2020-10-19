package ex01;

import java.util.Scanner;

public class LinearEquation {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Nhập hệ số a: ");
		int a = coefficientOfLinearEquation();
		System.out.println("Nhập hệ số b: ");
		int b = coefficientOfLinearEquation();
		float result = resultOfLinearEquation(a, b);
		System.out.printf("Nghiệm là: %.2f", result);
	}

	private static int coefficientOfLinearEquation() {
		int number = 0;
		do {
			System.out.println("Enter the number: ");
			try {
				number = Integer.parseInt(input.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Number Format Exception. Enter the number again");
			}
		} while (true);
		return number;
	}

	private static float resultOfLinearEquation(int a, int b) {
		do {
			try {
				return (float) -b / a;
			} catch (ArithmeticException e) {
				System.out.println("Arithmetic Exception. Enter numbers again");
				a = coefficientOfLinearEquation();
				b = coefficientOfLinearEquation();
			}
		} while (true);
	}
}
