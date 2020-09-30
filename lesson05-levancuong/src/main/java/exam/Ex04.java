package exam;

import java.util.Random;

public class Ex04 {
	public static void main(String[] args) {
		int n = 10;
		Random rd = new Random();
		int[] in = new int[n];
		for (int i = 0; i < n; i++) {
			in[i] = 1 + rd.nextInt(11);
		}
		int max = 0;
		for (int i = 0; i < in.length; i++) {
			if (max > in[i]) {
				max = in[i];
			}
		}
		System.out.println(getLeastCommonMultiple(in, max));

	}

	private static int getLeastCommonMultiple(int[] in, int max) {
		int result = max;
		for (int i = 0; i < in.length; i++) {
			if (result % in[i] != 0) {
				i = 0;
				result++;
				continue;
			}
		}
		return result;
	}

}
