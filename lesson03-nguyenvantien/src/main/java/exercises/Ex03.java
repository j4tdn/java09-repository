package exercises;

import java.util.Random;

public class Ex03 {
	public static void main(String[] args) {
		Random rd = new Random();
		int[][] arr = new int[3][4];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = rd.nextInt(99) + 1;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}

		System.out.println(isHorseSaddle(arr));
	}

	private static boolean isHorseSaddle(int[][] arr) {
		int minRow = 0, maxCol = 100;
		int index = 0, count;
		for (int i = 0; i < arr.length; i++) {
			minRow = arr[i][0];
			for (int j = 1; j < arr[i].length; j++) {
				if (arr[i][j] <= minRow) {
					minRow = arr[i][j];
					index = j;
				}
			}
			if (minRow == arr[i][0]) {
				continue;
			}
			maxCol = arr[i][index];
			count = 0;
			for (int k = 0; k < arr.length; k++) {
				if (arr[k][index] > maxCol) {
					maxCol = arr[k][index];
					break;
				}
				if (arr[k][index] == maxCol) {
					count++;
				}
			}
			if (minRow == maxCol && count != arr.length) {
				System.out.println(maxCol);
				return true;
			}
		}
		return false;
	}
}
