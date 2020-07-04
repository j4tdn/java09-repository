package beans;

import java.util.Random;
import java.util.Scanner;

public class Exercise03 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int row;
		int column;
		int kt = 0;

		System.out.println("Enter number of row: ");
		row = scanner.nextInt();
		System.out.println("Enter number of column: ");
		column = scanner.nextInt();
		int A[][] = random(row, column);
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.printf("%d  ", A[i][j]);
			}
			System.out.printf("\n");

		}
		System.out.println("SaddleElement is: ");
		ktSaddleElement(A, row, column);
		

	}

	public static int ktSaddleElement (int A[][],int row, int column) {
		int k;
		int cnt=0;
		
		for (k = 1; k < row; k++) {
			//timmin
		
			int min = A[row][0];
			for(k=1;k<column;k++) {
				if (A[row][k] < min) {
					min = A[row][k];
				}
				
			}
			
		//timmax
		int max = A[0][column];
		for (k = 1; k < column; k++) {
			if (A[k][column] > max) {
				max = A[k][column];
			}
		}
		if(max==min) {
			cnt++;
		}
		}
		return cnt;
		

			}
	

	public static int[][] random(int row, int column) {
		Random rand = new Random();
		int[][] randomA = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				randomA[i][j] = 1 + rand.nextInt(99);
			}

		}
		return randomA;

	}

}
