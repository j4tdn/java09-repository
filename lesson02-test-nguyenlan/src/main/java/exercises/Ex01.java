package exercises;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int[] a = {10, 1, 1, 3, 5, 7, 4};
		int[] result = uniqueNumber(a);
		for(int i = 0; i < result.length ; i++) {
			System.out.print(result[i] + " ");
		}
	}
	
	private static int[] uniqueNumber(int[] a) {
		int[] result = new int[a.length];
		int tmp, length = 0;
		boolean check = false;
		for (int i = 0; i < a.length; i++) {
			tmp = a[i];
			check = true;
			for (int j = 0; j < a.length; j++) {
				if (tmp == a[j] && j != i) {
					check = false;
				}
			}
			if (check == true) {
				result[length++] = tmp;
			}
		}
		
		return Arrays.copyOfRange(result, 0, length);
	}
}
