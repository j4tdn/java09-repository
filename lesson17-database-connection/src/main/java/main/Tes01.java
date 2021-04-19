package main;

import java.util.Scanner;

public class Tes01 {

	static int n;
	static int[] inputs;
	static int total;
	static int[] combinations;

	static int k = 2;
	static int count = 0;
	static int distance;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt() - 1;
		total = 0;
		inputs = new int[n];
		combinations = new int[n + 1];

		for (int i = 0; i < n; i++) {
			inputs[i] = sc.nextInt();
			total += inputs[i];
		}
		for (int i = 0; i < n; i++) {
			combinations[i] = 0;
		}

		int sum = sc.nextInt();
		distance = total - sum;
		if (distance % 2 == 0) {
			distance /= 2;
		}

		for (int i = 1; i < n; i++) {
			k = i;
			getCombination(1);
		}
		System.out.println(count);
	}

	// Tính từ phần tử 1 đến hết
	private static int caculate() {
		int total = 0;
		for (int i = 1; i <= k; i++) {
			total += inputs[combinations[i]];
		}

		return total;
	}

	private static void getCombination(int i) {
		for (int j = (combinations[i - 1] + 1); j < (n - k + i); j++) {
			combinations[i] = j;
			if (i == k) {
				if (caculate() == distance) {
					count++;
				}
				;
			} else
				getCombination(i + 1);
		}
	}

	private static void printS() {
		for (int i = 1; i <= k; i++) {
			System.out.print(combinations[i]);
		}
		System.out.println();
	}
}
