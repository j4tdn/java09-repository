package baitap;

import java.util.Scanner;

public class Ex01 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int a, b;
		a = inputNumber("Enter a:");
		b = inputNumber("Enter b:");
		int result = caculate(a, b);
		System.out.println("result:" + result);
	}

	private static int inputNumber(String mes) {
		int num = 0;
		do {
			try {
				System.out.print(mes);
				num = Integer.parseInt(sc.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Invalid number,please enter again!");
			}

		} while (true);
		return num;
	}

	private static int caculate(int a, int b) {
		int result = 0;
		try {
			result = -b / a;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		return result;
	}
}
