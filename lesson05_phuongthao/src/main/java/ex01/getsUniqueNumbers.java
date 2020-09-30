package ex01;

public class getsUniqueNumbers {

	static void getsUniqueNumbers(int[] arr, int n) {
		int i;
		int count = 1;
		for (i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i] == arr[j] && i == j) {
					count++;
				}
			}

			if (count == 2) {
				System.out.println(arr[i]);
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 4, 6, 7, 10, 10 };
		int n = arr.length;
		getsUniqueNumbers(arr, n);

	}
}
