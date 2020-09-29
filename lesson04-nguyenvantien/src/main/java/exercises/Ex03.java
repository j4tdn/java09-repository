package exercises;

public class Ex03 {
	public static void main(String[] args) {
		int n = 4;
		int arr[][] = new int[n + 2][n + 2];
		for (int i = 0; i < n + 2; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0 || i == j) {
					arr[i][j] = 1;
				} else {
					arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
				}
			}
		}
		for (int i = 1; i < n + 2; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.printf("%-5d", arr[i][j]);
			}
			System.out.println();
		}
	}
}
