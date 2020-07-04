package exercises;

import java.util.Random;
import java.util.Scanner;


public class Ex03HorseShaddle {
	private static Scanner sc = new Scanner(System.in);
	private static Random rd = new Random();
	public static void main(String[] args) {
		System.out.print("Nhập số hàng của ma trận : ");
		int rows = sc.nextInt();
		System.out.print("Nhập số cột của ma trận : ");
		int cols = sc.nextInt();
		
		int arr[][] = new int[rows][cols];
		
		for(int i = 0 ; i < rows ; i ++) {
			for(int j = 0 ; j < cols ; j ++) {
				arr[i][j] = rd.nextInt(99) + 1;
			}
		}
		printMatrix(rows, cols, arr);
		horseShaddleNumber(rows, cols, arr);
		
	}
	
	private static void printMatrix(int rows,int cols, int arr[][]) {
		for(int i = 0 ; i < rows ; i ++) {
			for(int j = 0 ; j < cols ; j ++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	private static void horseShaddleNumber(int rows,int cols,int arr[][]) { 
		int check = 0;
		for(int i = 0 ; i < rows ; i ++) {//find the minimum value of each row
			int min = 99;
			int j1=0; // save index cols of min
			for(int j = 0 ; j < cols ; j ++) {
				if (arr[i][j] < min) {
					min = arr[i][j];
					j1 = j;
				}
			}
			//System.out.println(min);
			if(checkShaddleNumber(min,j1,rows,arr) == true) { 
				check = 1;
				System.out.println("Phần tử yên ngựa là : " + min + " ở hàng " + (i +1) + " và cột " + (j1 + 1));
			};
			
		}
		if (check ==0) System.out.println("Mảng không có phần tử yên ngựa");
	}

	private static boolean checkShaddleNumber(int max, int j1,int rows,int arr[][]) {
		for(int i = 0 ; i < rows; i ++ ) {
			if(arr[i][j1]> max) {
				return false;
			}
		}
		return true;
	}
	
	
}
