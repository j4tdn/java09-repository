package exercises;

import java.util.Scanner;

public class Ex04 {
	static int[] arr = new int[20];

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Nhap so phan tu : ");
		int length = sc.nextInt();

		for (int i = 0; i < length; i++) {
			System.out.print("Nhap phan tu thu " + (i + 1) + " : ");
			arr[i] = sc.nextInt();
		}
		soLeLonThuHai(length);

	}

	public static void soLeLonThuHai(int length) {
		int temp = arr[0];
		int[] arrOdd = new int[10];
		int lengthOdd = 0;
		for (int i = 0; i < length; i++) {
			if (arr[i] % 2 == 1) {
				arrOdd[lengthOdd] = arr[i];
				lengthOdd++;
			}
		}

		for (int i = 0; i < lengthOdd - 1; i++) {
			for (int j = i + 1; j < lengthOdd; j++) {
				if (arrOdd[i] < arrOdd[j]) {
					temp = arrOdd[j];
					arrOdd[j] = arrOdd[i];
					arrOdd[i] = temp;
				}
			}
		}

		System.out.println("So le lon thu 2 la : " + arrOdd[1]);
	}
}