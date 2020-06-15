package exercise01;

import java.util.Random;

public class Ex07 {
	public static void main(String[] args) {
		Random rd = new Random();
		int[] a = new int[5];
		int count = 0, n = 0;
		while (true) {
			n = 20 + rd.nextInt(11);
			if (!isExistArray(a, n)) {
				a[count] = n;
				count++;
				if (count == 5) {
					break;
				}
			}
		}
		outputArray(a);
	}

	private static boolean isExistArray(int[] a, int value) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == value) {
				return true;
			}
		}
		return false;
	}

	private static void outputArray(int[] a) {
		for (int i : a) {
			System.out.println(i);
		}
	}
}
