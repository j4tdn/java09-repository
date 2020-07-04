import java.util.Scanner;

public class Exercise03 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("m = ");
		int m = ip.nextInt();
		System.out.print("n = ");
		int n = ip.nextInt();
		int a[][] = new int[100][100];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("A[" + i + ", " + j + "] = ");
				a[i][j] = ip.nextInt();
			}
		}
		int row[] = new int[100]; //lưu phần tử nhỏ nhất của hàng i
		int col[] = new int[100]; //lưu phần tử lớn nhất của cột j
		for (int i = 0; i < m; i++) {
			int min = 0;
			for (int j = 0; j < n; j++) {
				if (a[i][min] > a[i][j]) {
					min = j;
				}
				row[i] = min;
			}
		}

		for (int j = 0; j < n; j++) {
			int max = 0;
			for (int i = 0; i < m; i++) {
				if (a[max][j] < a[i][j]) {
					max = i;
				}
				col[i] = max;
			}
		}
		int kt = 0;
		for (int i = 0; i < m; i++) {
			if (col[row[i]] == i) {
				System.out.println("Có phần tử yên ngựa A[" + i + ", " + row[i] + "]");
				kt = 1;
				break;
			}
		}
		if (kt == 0)
			System.out.println("Không có phần tử yên ngựa");

	}

}
