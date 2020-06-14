package exercise;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = 7, b = 4, c = 10;

		int tmp;
		if (a > b) {
			tmp = a;
			a = b;
			b = tmp;
		}

		if (a > c) {
			tmp = a;
			a = c;
			c = tmp;
		}

		if (b > c) {
			tmp = b;
			b = c;
			c = tmp;
		}

		System.out.printf("a = %d, b = %d, c = %d", a, b, c);
	}
}
