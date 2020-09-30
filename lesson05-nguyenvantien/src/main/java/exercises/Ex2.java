package exercises;

import java.util.Arrays;

public class Ex2 {
	public static void main(String[] args) {
		int n = 6;
		int []arr = {5,4,3,2,6,1};
		Arrays.sort(arr);
		int result = getMissingNumber(arr);
		System.out.println(result);
	}

	private static int getMissingNumber(int[] arr) {
		if(arr[0] == 2) {
			return 1;
		}
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] -arr[i-1] >1) {
				return arr[i]-1;
			}
		}
		return arr.length + 1;
	}
}
