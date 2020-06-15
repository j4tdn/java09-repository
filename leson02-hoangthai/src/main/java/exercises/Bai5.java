package exercises;

import java.util.Scanner;

public class Bai5 {
	public static void main(String[] args) {
		System.out.println("Nhập số cần chuyển đổi: ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b;
		int sum = 0;
		int i = 1;
		do {
			b = a % 2;
			sum = sum + (i * b);
			a = a / 2;
			i = i * 10;
		} while (a > 0);
		System.out.println(+sum);
	}
}
