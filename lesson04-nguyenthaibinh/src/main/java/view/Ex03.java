package view;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		int number;
		System.out.println("Nhap n:");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		printTrianglePascal(number + 1);
	}
	public static int C(int k, int n) {
		if(k == 0 || k == n) {
			return 1;
		}
		if(k == 1) {
			return n;
		}
		return C(k - 1, n - 1) + C(k, n - 1);
	}
	public static void printTrianglePascal(int number) {
		for(int i = 1; i <= number; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(C(j, i) + " ");
			}
			System.out.println();
		}
	}
}
