package lesson02exercises;

import java.util.Scanner;

public class Bai04 {

	public static void main(String[] args) {
		int n;
		int a = 0;
		System.out.println("Input n ");
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		int A[] = new int[n];
		int Odd[] = new int[n];
		System.out.println("input  elements for array");
		for (int i = 0; i < n; i++) {
			System.out.println("A" + i + "=");
			A[i] = scanner.nextInt();
		}
		for (int i = 0; i < n; i++) {
			if (A[i] % 2 != 0) {
				Odd[a] = A[i];
				a++;
			}
		}
		System.out.println("array odd elements");
		for (int j = 0; j < a; j++) {
			System.out.println(Odd[j]);
		}
		int temp = 0;
		for (int i = 0; i < a; i++) {
			for (int j = i + 1; j < a; j++) {
				if (Odd[i] < Odd[j]) {
					temp = Odd[i];
					Odd[i] = Odd[j];
					Odd[j] = temp;
				}
			}
		}
		System.out.println("odd elements large second: " + Odd[1]);

		}
	}

