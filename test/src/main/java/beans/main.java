package beans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int[] a = new int [3];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			a[i] = scanner.nextInt();
		}
		Arrays.sort(a);
		int max;
		max = (a[0] / 6) * 2 + (a[1] / 6) * 2 + (a[2] / 6) * 2;
		a[0] = a[0] % 6;
		a[1] = a[1] % 6;
		a[2] = a[2] % 6;
		if (a[2] >= 3) {
			max = max + a[2] / 3;
			a[2] = a[2] % 3;
		}
		if (a[1] >= 3) {
			max = max + a[1] / 3;
			a[1] = a[1] % 3;
		}
		if (a[0] >= 3) {
			max = max + a[0] / 3;
			a[0] = a[0] % 3;
		}
		Arrays.sort(a);
		max = max + a[0];
		System.out.println(max);

	}

}
