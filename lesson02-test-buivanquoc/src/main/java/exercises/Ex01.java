package exercises;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int a[] = { 1, 1, 2, 3, 4, 5, 3, 2, 4, 6 };
		int [] result = uniqueNumbers(a);
		for ( int i=0;i<result.length;i++)
		{
		System.out.print(result[i]);
		}
	}

	private static int[] uniqueNumbers(int[] a) {
		int[] result = new int[a.length];
		int index = 0;
		for (int i = 0; i <= a.length - 1; i++) {
			int current = a[i];
			if (isUnique(current, a, i)) {
				result[index++] = current;
			}

		}

		return Arrays.copyOfRange(result, 0,index);
	}

	private static boolean isUnique(int current, int[] a, int currentIndex) {
		for (int i = 0; i < a.length; i++) {
			if (i != currentIndex && a[i] == current) {
				return false;
			}
		}
		return true;
	}
}
