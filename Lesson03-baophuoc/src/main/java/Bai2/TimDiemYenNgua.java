package Bai2;

import java.util.Scanner;

public class TimDiemYenNgua {
	static int sh, sc;

	public static void main(String[] args) {
		int arr[][] = new int[10][10];
		Input(arr);
		System.out.println();
		Show(arr);
		System.out.println();
		YenNgua(arr);
	}

	public static void Input(int arr[][]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap so hang: ");
		sh = input.nextInt();
		System.out.print("Nhap so cot: ");
		sc = input.nextInt();
		for (int i = 0; i < sh; i++) {
			for (int j = 0; j < sc; j++) {
				System.out.print("Nhap phan tu [" + i + " ; " + j + "] = ");
				arr[i][j] = input.nextInt();
			}
		}
	}

	public static void Show(int arr[][]) {
		System.out.println("Hien thi ma tran");
		for (int i = 0; i < sh; i++) {
			for (int j = 0; j < sc; j++) {
				System.out.printf("%5d", arr[i][j]);
			}
			System.out.println();
		}
	}

	public static void YenNgua(int arr[][]) {
		int y = 0;
		for (int i = 0; i < sc; i++) {
			for (int j = 0; j < sh; j++) {
				if (arr[i][j] == maxCot(arr, j) && arr[i][j] == minHang(arr, i)) {
					y = arr[i][j];
				}
			}
		}
		System.out.println("Diem Yen Ngua La : " + y);
	}

	public static int maxCot(int[][] arr, int cot) {
		int max = arr[0][cot];
		for (int i = 1; i < sh; i++) {
			if (max < arr[i][cot]) {
				max = arr[i][cot];
			}
		}
		return max;
	}

	public static int minHang(int[][] arr, int hang) {
		int min = arr[hang][0];
		for (int i = 1; i < sc; i++) {
			if (min > arr[hang][i]) {
				min = arr[hang][i];
			}
		}
		return min;
	}
}
