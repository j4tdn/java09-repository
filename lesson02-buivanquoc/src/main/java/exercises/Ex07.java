package exercises;

import java.util.Random;

public class Ex07 {
	public static void main(String[] args) {
		int []a = new int[5];
		int t;
		int count = 0;
		Random r = new Random();
		while (count < a.length) {
			t = 20 + r.nextInt(11);
			boolean lap = false;
			do {
				for (int i = 0; i < a.length; i++) {
					if (t == a[i]) {
						lap = true;
						break;
					} else if (i == count) {
						a[count] = t;
						count++;
						lap = true;
						break;
					}
				}
			} while (!lap);
		}
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j] + " ");
		}
	}
}
