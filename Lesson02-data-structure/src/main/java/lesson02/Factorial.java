package lesson02;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		System.out.println("factorial sum:" + sum());

	}

	public static int sum() {
		int n, S = 0;
		do {
			Scanner num = new Scanner(System.in);
			System.out.println("input n:");
			n = num.nextInt();
			S += fatorial(n);

		} while (n >= 0);
		return S;
	}

	public static int fatorial(int n) {
		int m = 1;
		if (n < 0)
			return 0;
		else {
			for (int i = 1; i <= n; i++) {
				m *= i;
			}

			return m;
		}
	}

}
