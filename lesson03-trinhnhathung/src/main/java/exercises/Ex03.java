package exercises;

import java.util.Random;
import java.util.Scanner;

public class Ex03 {
	private static Scanner sc = new Scanner(System.in);
	private static Random rd = new Random();

	public static void main(String[] args) {
		int row, col;
		System.out.print("Nhap so hang:");
		row = sc.nextInt();
		System.out.print("Nhap so cot:");
		col = sc.nextInt();

		int[][] A = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				A[i][j] = rd.nextInt(99) + 1;
			}
		}

		if (hasHorseSaddleElement(A, row, col)) {
			System.out.println("Co phan tu yen ngua");
		} else {
			System.out.println("Khong co phan tu yen ngua");
		}
	}

	private static boolean hasHorseSaddleElement(int[][] a, int row, int col) {
		for (int i = 0; i < row; i++) {
			int min = a[i][0];
			for (int j = 0; j < col; j++) {
				if (a[i][j] < min) {
					min = a[i][j];
				}
			}
			for (int j = 0; j < col; j++) {
				int count = 0;
				if (min == a[i][j]) {
					for (int k = 0; k < row; k++) {
						if (min >= a[k][j]) {
							count++;
						}
					}
					if (count == row) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
