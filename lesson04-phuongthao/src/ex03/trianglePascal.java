package ex03;

import java.util.Scanner;

public class trianglePascal {
	public static void main(String[] args) {
		int h;
		System.out.println("h = ");
		Scanner ip = new Scanner(System.in);
		h = ip.nextInt();

		int x;
		int output;
		for (int i = 1; i <= h; i++) {
			for (int j = 0; j <= 2 * h; j++) {
				x = j - h;
				if (x < 0) {
					x *= -1;
				}
				output = i - x;

				if (output > 0) {
					System.out.print("	" + output);
				} else {

					System.out.print("	");
				}
			}
			System.out.println();
		}
	}
}