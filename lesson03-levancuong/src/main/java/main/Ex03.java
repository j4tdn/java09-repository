package main;

import java.util.Random;
import java.util.Scanner;

public class Ex03 {
	static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		int row, col;
		System.out.print("Enter a number of row:");
		row = Integer.parseInt(ip.nextLine());
		System.out.print("Enter a number of col:");
		col = Integer.parseInt(ip.nextLine());

		int[][] a = createArray(row, col);

		//output array
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.printf("%-3d",a[i][j]);
			}
			System.out.println();
		}
		
		
		int count = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (a[i][j] == minRow(a, i, col) && a[i][j] == maxCol(a, j, row)) {
					System.out.println("Horse saddle is:" + a[i][j]);
					count++;
				}
			}
		}
		if (count == 0) {
			System.out.println("No exist element horse saddle in array!");
		}

	}

	private static int minRow(int[][] a, int i, int col) {
		int min = a[i][0];
		for (int j = 1; j < col; j++) {
			if (a[i][j] < min) {
				min = a[i][j];
			}
		}
		return min;
	}

	private static int maxCol(int[][] a, int j, int row) {
		int max = a[0][j];
		for (int i = 1; i < row; i++) {
			if (a[i][j] > max) {
				max = a[i][j];
			}

		}
		return max;
	}

	private static int[][] createArray(int row, int col) {
		int[][] result = new int[row][col];
		Random rd = new Random();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				result[i][j] = 1 + rd.nextInt(99);
			}
		}
		return result;
	}

}
