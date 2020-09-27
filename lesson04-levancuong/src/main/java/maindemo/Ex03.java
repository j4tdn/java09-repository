package maindemo;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter n:");
		n = Integer.parseInt(sc.nextLine());
		pascal(n);
	}

	private static long factorial(int n) {
		if (n == 0 || n == 1)
			return 1;
		return n * factorial(n - 1);
	}

	private static long c(int k, int n) {
		return (factorial(n) / (factorial(k) * factorial(n - k)));
	}

	private static void pascal(int n) {
		int temp = 0;
		int k = 0;
		for (int i = 1; i <= n; i++) {
			boolean check = true;
			if (i == 1) {
				System.out.printf("%-5d%-5d\n", 1, 1);
				continue;
			}
			temp = i / 2;
			for (int j = 0; j <= i; j++) {
				k = j;
				System.out.printf("%-5d", c(k, i));
				if (k == temp) {
					if (i % 2 == 0) {
						k--;
					} else {
						if (check == false) {
							k--;
						}
						check = false;
					}
				} else {
					k++;
				}
			}
			System.out.println();

		}
	}

}
