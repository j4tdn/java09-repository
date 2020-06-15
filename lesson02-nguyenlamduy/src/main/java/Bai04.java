import java.util.Scanner;

public class Bai04 {

	public static void main(String[] args) {

		int[] n = { 2, 3, 6, 8, 9, 11, 12, 3, 19, 5, 21, 5 };
		int max = 0, second = 0;

		for (int i = 0; i <= n.length; i++) {

			for (int j = i + 1; j < n.length; j++) {
				if (n[i] % 2 != 0 && n[j] % 2 != 0) {

					if (n[i] < n[j] && n[j] > max && n[i] > second) {

						max = n[j];
						second = n[i];
					}

				}

			}

		}
		System.out.println(second);

	}

}
