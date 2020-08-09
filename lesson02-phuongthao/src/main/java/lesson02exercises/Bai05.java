package lesson02exercises;

import java.util.Scanner;

public class Bai05 {
	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = ip.nextInt();

		int[] a = new int[10];
		for (int i = 0; number > 0; i++) {
			a[i] = number % 2;
			number = number / 2;
			System.out.print(a[i]);
		}
		System.out.println("\n=========================");

		for (int i = 0; i < a.length ; i++) {				// anh ơi chỗ này em không biết làm sao cho in ra nó mất mấy số 0 đầu
			for (int j =0; j <a.length ; j++) {
			int tg = a[i];
				a[i] = a[j];
			a[j] = tg;
			}
			System.out.print(a[i]);
		}
	}
}