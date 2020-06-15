package exercises;

import java.util.Random;

public class Ex07 {
	public static void main(String[] args) {
		Random rd = new Random();

		int[] arr = new int[5];
		int i = 0;
		while (i < 5) {
			int check = 1;
			int number = rd.nextInt(10) + 20;
			for (int j = 0; j <= i; j++) {
				if (arr[j] == number) {
					check = 0;
				}
			}
			if (check == 1) {
				arr[i] = number;
				i++;
			}
		}
		System.out.print("Ket qua random 5 so ngau nhien khong trung nhau la : ");
		for (int n = 0; n < 5; n++) {
			System.out.print(arr[n] + " ");
		}
	}
}