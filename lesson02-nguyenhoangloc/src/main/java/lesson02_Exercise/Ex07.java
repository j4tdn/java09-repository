package lesson02_Exercise;

import java.util.Random;

public class Ex07 {
	public static void main(String[] args) {
		Random rd = new Random();
		int[] a = new int[5];
		for (int i = 0; i < 5; i++) {

			int number = 20+rd.nextInt(11);
			a[i] = number;
			System.out.println(a[i]);
		}
	}

}
