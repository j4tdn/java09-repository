package exercises;

import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		int[] a = { 5, 1, 9, 11, 20, 19, 17, 21, 30 };
		int n = 8;
		Sx(a, n);
		int dem = 0;
		int i = 0;
		while (dem < 2) {
			if (a[i] % 2 != 0) {
				dem++;
				i++;
			} else {
				i++;
			}
		}
		System.out.println(a[i - 1]);
	}

	public static void Sx(int[] a, int n) {
		int temp;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j <= n - i - 1; j++) {
				if (a[j] < a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}
}
