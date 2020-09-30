package exercise;

import java.util.Arrays;

public class Ex2 {
	public static void main(String[] args) {
		int [] arr = {3, 8, 9, 2, 1, 6, 7, 4, 5};
		System.out.println(getMissingNumber(arr));
	}
	
	public static int getMissingNumber(int arr[]) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length;i++) {
			if (arr[i] != i +1) {
				return i + 1;
			}
		}
		return arr.length;
	}
}
