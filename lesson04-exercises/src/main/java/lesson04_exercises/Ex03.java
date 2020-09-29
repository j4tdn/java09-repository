package lesson04_exercises;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập số lượng phần tử:");
		int n = sc.nextInt();
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(Pascal(j, i) +" ");
				if (j==i)System.out.println();
			}
		}
	}

	public static int Pascal(int k, int n) {
		if (k == 0 || k == n)
			return 1;
		if (k == 1)
			return n;
		return Pascal(k - 1, n - 1) + Pascal(k, n - 1);
	}
}
