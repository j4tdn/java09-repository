package testExercises;

public class Ex03 {
	public static void main(String[] args) {
		int array[][] = new int[][] { { 47, 47, 36 }, { 23, 43, 31 }, { 46, 7, 29 } };
		saddleElement(array);
	}

	private static void saddleElement(int[][] arr) {
		// nhỏ nhất trong hàng (minRow)
		int minRow = arr[0][0];
		int column = 0, dem = 0;
		for (int i = 0; i < 3; i++) {
			minRow = arr[i][0];

			for (int j = 0; j < 3; j++) {
				if (arr[i][j] <= minRow) {
					minRow = arr[i][j];
					column = j;
				}
			}
			// lớn nhất trong cột(maxColumn)
			int maxColumn = minRow;
			int count = 0;

			for (int t = 0; t < 3; t++) {
				if (maxColumn >= arr[t][column]) {
					count++;
				}
			}
			if (count == 3) {
				System.out.println(maxColumn + " là phần tử yên ngựa");
			} else {
				dem++;
			}

		}
		if (dem == 3)
			System.out.println("không có phần tử yên ngựa");
	}
}
