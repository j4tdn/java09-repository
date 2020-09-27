package maindemo;

import java.util.Scanner;

public class Ex02 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n;
		System.out.println("Enter n:");
		n = Integer.parseInt(sc.nextLine());
		int[] arr = new int[n];

		// nhap
		for (int i = 0; i < arr.length; i++) {
			System.out.print("a[" + i + "]=");
			arr[i] = Integer.parseInt(sc.nextLine());
		}

		int[] result = new int[n];
		int left = 0, right = arr.length - 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 7 == 0 && arr[i] % 5 != 0) {
				result[left++] = arr[i];
			}
			if (arr[i] % 5 == 0 && arr[i] % 7 != 0) {
				result[right--] = arr[i];
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (!(arr[i] % 7 == 0 && arr[i] % 5 != 0) && !(arr[i] % 5 == 0 && arr[i] % 7 != 0)) {
				result[left++] = arr[i];
			}
		}

		// xuat

		for (int i : result) {
			System.out.print(i + "     ");
		}
	}
}
