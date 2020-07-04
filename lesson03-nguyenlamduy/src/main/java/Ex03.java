import java.util.Scanner;

public class Ex03 {
	static Scanner sc = new Scanner(System.in);
	static int m, n;

	public static void main(String[] args) {

		System.out.print("Nhập số dòng(n): ");
		n = sc.nextInt();
		System.out.print("Nhập số cột(m): ");
		m = sc.nextInt();
		int[][] a = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
				a[i][j] = sc.nextInt();
			}
		}

		System.out.println("Mảng vừa nhập: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {

				System.out.print(a[i][j] + "\t");

			}
			System.out.println();

		}

		YenNgua(a);

	}

	public static void YenNgua(int arr[][]) {
		int y =0;
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i][j] == maxCot(arr, j) && arr[i][j] == minHang(arr, i)) {
					y=arr[i][j];
				} 

			}
		}
		System.out.println("điểm yên ngựa là :"+y);
	}

	public static int maxCot(int[][] arr, int cot) {
		int max = arr[0][cot];
		for (int i = 1; i < n; i++) {
			if (max < arr[i][cot]) {
				max = arr[i][cot];
			}

		}
		return max;
	}

	public static int minHang(int[][] arr, int hang) {
		int min = arr[hang][0];
		for (int i = 1; i < m; i++) {
			if (min > arr[hang][i]) {
				min = arr[hang][i];
			}

		}
		return min;
	}

}
