package bai2;

public class Bai2 {
	int n = 10;

	public static void main(String[] args) {
		System.out.println("n bang 10");
		int arr[] = { 1, 2, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("So nguyen con lai la :" + getMissingNumber(arr));

	}

	public static int getMissingNumber(int arr[]) {
		int result = 0;
		for (int i = 1; i <= 10; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (i == arr[j]) {
					count++;
				}
			}
			if (count == 0) {
				return i;
			}
		}
		return result;
	}
}
