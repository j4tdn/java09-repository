package bai2;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số phần tử của mảng:");
		int n = Integer.parseInt(sc.nextLine());
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Nhap phan tu thu " + i + ":");
			arr[i] = Integer.parseInt(sc.nextLine());
		}

		int count = 0, count5 = 0, count7 = 0, count57 = 0;

		for (int j = 0; j < n; j++) {
			if (chiaHetCho5(arr[j]) && chiaHetCho7(arr[j])) {
				count57++;
			} else if (chiaHetCho5(arr[j])) {
				count5++;
			} else if (chiaHetCho7(arr[j])) {
				count7++;
			} else {
				count++;
			}
		}

		int arr5[] = new int[count5];
		int arr7[] = new int[count7];
		int arr57[] = new int[count57];
		int arrNone[] = new int[count];

		int countTemp5 = 0, countTemp7 = 0, countTemp57 = 0, countTemp = 0;

		for (int k = 0; k < n; k++) {
			if (chiaHetCho5(arr[k]) && chiaHetCho7(arr[k])) {
				arr57[countTemp57] = arr[k];
				countTemp57++;
			} else if (chiaHetCho5(arr[k])) {
				arr5[countTemp5] = arr[k];
				countTemp5++;
			} else if (chiaHetCho7(arr[k])) {
				arr7[countTemp7] = arr[k];
				countTemp7++;
			} else {
				arrNone[countTemp] = arr[k];
				countTemp++;
			}
		}
		int x = count / 2;
		int y = x + count57;
		int arrMiddle[] = new int[count + count57];
		for (int t = 0; t < arrMiddle.length; t++) {
			if (t < x) {
				arrMiddle[t] = arrNone[t];
			} else if (t < y) {
				arrMiddle[t] = arr57[t - x];
			} else {
				if (t - x - 1 == 0) {
					if (arrNone[t - x - 1] == arrNone[count - 1]) {
						arrMiddle[t] = arrNone[t - x - 1];
					}
				} else {
					arrMiddle[t] = arrNone[t - x];
				}
			}
		}
		int result[] = new int[n];
		for (int a = 0; a < n; a++) {
			if (a < count7) {
				result[a] = arr7[a];
			} else if (a < count7 + count + count57) {
				result[a] = arrMiddle[a - count7];
			} else {
				// System.out.println(a - count7 - count57 - count);
				result[a] = arr5[a - count7 - count57 - count];
			}
		}
		for (int b = 0; b < count + count57; b++) {
			System.out.print(arrMiddle[b] + " ");

		}
		System.out.print("Mang ket qua la :");
		for (int b = 0; b < n; b++) {

			System.out.print(result[b] + " ");

		}

	}

	public static boolean chiaHetCho5(int number) {
		if (number % 5 == 0)
			return true;
		else
			return false;
	}

	public static boolean chiaHetCho7(int number) {
		if (number % 7 == 0)
			return true;
		else
			return false;
	}
}
