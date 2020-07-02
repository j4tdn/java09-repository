package viewExercises;

import java.util.Scanner;

public class Ex03 {
	private static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		int M, N;
		System.out.println("=====Nhập kích thước của bảng M x N====");
		System.out.println("Nhập M: ");
		M = ip.nextInt();
		System.out.println("Nhập N");
		N = ip.nextInt();
		int[][] arr = new int[M][N];
		//nhập bảng
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				System.out.println("arr[" + i + "][" + j + "] = ");
				arr[i][j] = ip.nextInt();
			}
		}
		// 1. duyệt tìm phần tử nhỏ nhất trong hàng		
		// 2. xem phần tử đó có lớn nhất trong cột không? nếu có thì in ra kết quả, kết thúc! không thì duyệt tìm phần tử nhỏ nhất hàng tiếp theo.
		int minInLine, maxInColumn; 
		int column;
		for(int i = 0; i < M; i++) {
			minInLine = arr[i][0];
			column = 0;
			for(int j = 0; j < N; j++) {
				if(minInLine > arr[i][j]) {
					minInLine = arr[i][j];
					column = j;
				}
			}
			maxInColumn = minInLine;
			if (isMaxInColumn(arr,M,N,maxInColumn,column) == true) {
				System.out.println(maxInColumn + " là phần tử yên ngựa của bảng!!!");
				return;
			}
		}
		System.out.println("Không có phần tử yên ngựa trong bảng!!!");		
	}
	
	
	private static boolean isMaxInColumn(int[][] arr, int M, int N, int maxInColumn,int column) {
		int tmp = 0;
		for(int i = 0; i < N; i++) {
			if(maxInColumn >= arr[i][column]) {
				tmp++;
			}
		}
		if(tmp == N) {
			return true;
		}
		return false;
	}
}
