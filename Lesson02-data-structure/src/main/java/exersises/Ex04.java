package lesson02;

import java.util.Scanner;

public class BigOddNum {

	public static void main(String[] args) {
		int n = 5;
		int a[] = new int[10];
		input(a, n);
		output(a, n);
		System.out.println("max le thu 2 :  " + maxle2(a, n));

	}

	public static void input(int a[], int n) {
		Scanner scan = new Scanner(System.in);
		System.out.println(" nhap vao chuoi so :");
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
	}

	public static void output(int a[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(a[i] + "\t");
		}
	}

	public static int maxle2(int a[], int n) {
		int max = a[0];
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 == 0)
				continue;
			else {
				if (a[i] > max)
					max = a[i];
			}
		}
		int max2 = a[0];
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 == 0)
				continue;
			else {
				if (a[i] < max && a[i] > max2)
					max2 = a[i];
			}
		}
		return max2;
	}
}
