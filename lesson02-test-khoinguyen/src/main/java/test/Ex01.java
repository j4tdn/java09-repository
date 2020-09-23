package test;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int []a = { 1, 1, 7, 4, 5, 2 };
		int[] result = uniqueNumbers(a);
		
		for (int i = 0; i < result.length ; i++) {
			System.out.print( result[i] + " ");
		}
	}

	public static int[] uniqueNumbers(int a[]) {
		int[] result = new int[a.length];
		int index = 0;
		//processing
		for (int i = 0; i < a.length ; i++) {
			int current = a[i];
			if (isUnique(current, a, i)) {
				result[index++] = current;
			}
		}
		//copy
		
		return Arrays.copyOfRange(result, 0, index);
	}

	private static boolean isUnique(int current, int[] a, int currentIndex) {
		for (int i = 0; i < a.length; i++) {
			if (i != currentIndex && a[i] == current) {
				return false;
			}
		}
		// TODO Auto-generated method stub
		return true;
	}

}
