package main;

public class Ex01 {

	public static void main(String[] args) {
		int a = 10;
		int b = 11;
		int c = 8;
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

	}

}
