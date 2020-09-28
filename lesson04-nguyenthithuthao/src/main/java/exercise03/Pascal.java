package exercise03;

import java.util.Scanner;

public class Pascal {
	public static void main(String[] args) {
		int n, i, j;
		int A[][] = new int[10][10];
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter n: ");
			n = scanner.nextInt();
		} while (n > 10);
		System.out.println("==========================");

		for (i = 0; i < n; i++) {
			for (j = 0; j <= i; j++) {
				if (i == j || j == 0) {
					A[i][j] = 1;
					System.out.printf("%d\t" , A[i][j]);
				} else {
					A[i][j] = A[i - 1][j - 1] + A[i - 1][j];
					System.out.printf("%d\t" , A[i][j]);

				}

			}
			System.out.printf("\n");
		}
		

	}

}
