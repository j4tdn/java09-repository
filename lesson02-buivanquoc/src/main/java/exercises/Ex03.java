package exercises;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 123321, num2 = 12345;

		if (test(num)) {
			System.out.println(num + " is a palindrome");
		} else {
			System.out.println(num + " not is a palindrome");
		};
		if (test(num2)) {
			System.out.println(num2 + " is a palindrome");
		} else {
			System.out.println(num2 + " not is a palindrome");
		}

	}

	public static int isPalindrome(int num) {
		int r, result = 0;
		while (num != 0) {
			r = num % 10;
			result = result * 10 + r;
			num = num / 10;
		}
		return result;
	}

	public static boolean test(int num) {
		if (num == isPalindrome(num))
			return true;

		return false;
	}
}
