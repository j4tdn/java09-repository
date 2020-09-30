package bai1;

public class Bai1 {
	static int n = 0;

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 6, 2, 8, 7 };
		int arr1[] = getUniqueNumbers(arr);
		for (int i = 0; i < n; i++) {
			System.out.print(arr1[i] + " ");
		}
	}

	public static int[] getUniqueNumbers(int arr[]) {
		int arrTemp[] = new int[20];

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 1) {
				arrTemp[n] = arr[i];
				n++;
			}
		}
		return arrTemp;
	}
}
