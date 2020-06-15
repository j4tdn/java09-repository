package lesson02;

import java.util.Scanner;

public class CoSo10_CoSo2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] a = new int[100];

		int n;
		do {
			System.out.println("input :");
			n = scan.nextInt();
			bigoddnum(a, n);

		} while (n > 0);
	}

	public static void bigoddnum(int[] a, int n) {
		int count = 0;
		do {
			a[count] = n % 2;
			count++;
			n /= 2;
		} while (n > 0);

		for (int j = count - 1; j >= 0; j--) {
			System.out.println(a[j] + "\t");
		}
	}

}