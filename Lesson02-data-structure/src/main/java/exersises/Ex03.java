package lesson02;

import java.util.Scanner;

public class PaLindRome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		do {
			System.out.println("input num:");
			num = scan.nextInt();
			if (isPaLindRome(num)) {
				System.out.println(num + " is a palindrome");
			} else {
				System.out.println(num + " not is a palindrome");
			}
		} while (num > 0);

	}

	public static int test(int n) {
		int r, s = 0;
		while (n > 0) {
			r = n % 10;
			s = s * 10 + r;
			n = n / 10;
		}
		return s;
	}

	public static boolean isPaLindRome(int n) {
		if (n == test(n))
			return true;
		else
			return false;
	}
}
