package exercises;

import java.util.Random;
import java.util.Scanner;

public class Bai7 {
	public static void main(String[] args) {
		int[] A = tinh();
		for (int i = 0; i < A.length; i++) {
			System.out.println(A[i] + " ");
		}
	}

	public static int[] tinh() {
		int[] A = new int[5];
		for (int i = 0; i < 5; i++) {
			A[i] = (int) Math.round(Math.random() * 10 + 20);
			if (i != 0 && A[i] == A[i - 1]) {
				i--;
			}
		}
		return A;
	}

}
