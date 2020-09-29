
// bai ni em thu so nho no dung ma so lon no sai, em khong biet sai cho nao nua

package ex02;

import java.util.Random;
import java.util.Scanner;

public class Sort {
	public static void main(String[] args) {

		int n;
		Scanner ip = new Scanner(System.in);
		System.out.println("n = ");
		n = ip.nextInt();

		Random rd = new Random();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = rd.nextInt(50);
		}
		int count7 = 0;
		for (int i = 0; i < n; i++) {
			if ((arr[i] % 7) == 0) {
				int tmp = arr[i];
				arr[i] = arr[count7];
				arr[count7] = tmp;
				count7++;
			}
		}
		int count5 = n - 1;
		for (int i = 0; i < count5; i++) {
			if ((arr[i] % 5) == 0) {
				int tmp = arr[i];
				arr[i] = arr[count5];
				arr[count5] = tmp;
				count5--;
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}