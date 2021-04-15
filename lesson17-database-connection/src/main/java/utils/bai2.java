package utils;

import java.util.Scanner;

public class bai2 {

	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter matrix level: ");
		n = scanner.nextInt();
		int A[][] = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("Enter Elements: A[" + i + "][" + j + "] = ");
				A[i][j] = scanner.nextInt();
			}
		}
	
		int minhang[] = new int[n];
		int maxcot[] = new int[n];
		for (int i = 0; i < n; i++) {
			minhang[i] = A[i][0];
			for (int j = 0; j < n; j++) {
				if (minhang[i] > A[i][j]) {
					minhang[i] = A[i][j];
				}
			}
		}

		for (int j = 0; j < n; j++) {
			maxcot[j] = A[0][j];
			for (int i = 0; i < n; i++) {
				if (maxcot[j] < A[i][j]) {
					maxcot[j] = A[i][j];
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((A[i][j] == minhang[i]) && (A[i][j] == maxcot[j])) {
					System.out.println("Number of saddle points is: " + A[i][j]);
				}
			}
		}
	}
}
