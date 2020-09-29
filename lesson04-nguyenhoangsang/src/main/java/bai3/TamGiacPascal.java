package bai3;

import java.util.Scanner;

public class TamGiacPascal {
	public static void main(String[] args) {
		System.out.print("nhap n:");
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		for(int i = 1 ; i <= n+1 ; i ++) {
			for(int j = 0; j <= i ; j ++) {
				System.out.print(Pascal(j,i) + " ");
			}
			System.out.println();
		}
	}

	private static int Pascal(int j, int i) {
	    if (j == 0 || j == i) return 1;
	    if (j == 1) return i;
	    return Pascal(j - 1, i - 1) + Pascal(j, i - 1);
	}
}
