package baophuoc.lesson02_baophuoc;

import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {
		int n;

		System.out.print("Nhap so: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		DoiXung(n);

	}

	public static void DoiXung(int n) {
		int temp, sum = 0, r;

		for (temp = n; n != 0; n = n / 10) {
			r = n % 10;
			sum = sum * 10 + r;
		}
		if (temp == sum) {
			System.out.println("Số đối xứng");

		} else

			System.out.println("K phai số đối xứng");

	}

}
