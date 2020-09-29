package lesson04_exercises;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("Nhập vào số phần tử của mảng: ");
			n = scanner.nextInt();
		} while (n <= 0);

		int A[] = new int[n];

		System.out.println("Nhập các phần tử cho mảng: ");
		for (int i = 0; i < n; i++) {
			System.out.print("Nhập phần tử thứ " + i + ": ");
			A[i] = scanner.nextInt();
		}
		System.out.println("dãy số sau khi được sắp xếp:  ");
		Sort(A, n);
		for (int i = 0; i < n; i++)
			for (int j = i + 1; j < n; j++) {
				if (A[i] % 5 == 0 && A[i] % 7 != 0) {
					int tmp = A[i];
					A[i] = A[j];
					A[j] = tmp;
				}
			}
		for (int i = 0; i < n; i++) {
			System.out.print(A[i] + " ");
		}
	}

	public static void Sort(int A[], int n) {
		for (int i = 0; i < n; i++)
			for (int j = i + 1; j < n; j++) {
				if ((A[i] % 5 == 0 && A[i] % 7 == 0) || (A[i] % 5 != 0 && A[i] % 7 != 0))

				{
					int temp = A[i];
					A[i] = A[j];
					A[j] = temp;
				}

			}

	}

}
