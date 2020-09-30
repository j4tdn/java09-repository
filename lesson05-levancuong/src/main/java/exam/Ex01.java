package exam;

import java.util.ArrayList;
import java.util.Random;

public class Ex01 {
	public static void main(String[] args) {
		int n = 10;
		Random rd = new Random();
		int[] in = new int[n];
		for (int i = 0; i < n; i++) {
			in[i] = rd.nextInt(101);
		}

		boolean[] check = new boolean[n];
		int result[] = getUniqueNumber(in, check);
		for (int i : result) {
			System.out.print(i + "----");
		}

	}

	private static int[] getUniqueNumber(int[] in, boolean[] check) {
		int count = 0;
		for (int i = 0; i < in.length - 1; i++) {
			for (int j = i + 1; j < in.length; j++) {
				if (check[i] == false) {
					if (in[i] == in[j]) {
						check[j] = true;
						count = 1;

					}
				}

			}
			if (count == 1) {
				check[i] = true;
			}
			count = 0;
		}

		ArrayList<Integer> arrExist = new ArrayList<Integer>();
		for (int i = 0; i < check.length; i++) {
			if (check[i] == false) {
				arrExist.add(in[i]);
			}
		}
		arrExist.sort((o1, o2) -> o1 - o2);

		int[] result = new int[arrExist.size()];
		for (int i = 0; i < arrExist.size(); i++) {
			result[i] = arrExist.get(i);
		}

		return result;

	}
}
