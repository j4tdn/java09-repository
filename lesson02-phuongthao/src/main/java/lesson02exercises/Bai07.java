package lesson02exercises;

import java.util.Arrays;
import java.util.Random;
// anh oi bai nay em khong lam duoc nen em bat chuoc bai ban khac nha :(((
public class Bai07 {
	public static void main(String[] args) {
		Random rd = new Random();
		int[] arr = new int[5];
		int count = 0;
		while (true) {
			int number = 20 + rd.nextInt(10);
			if (isExist(arr, number)) {
				arr[count++] = number;
				if(count==5)
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	private static boolean isExist(int[] arr, int number) {
		for (int i = 0; i < 5; i++) {
			if (arr[i] == number) {
				return true;
			}
		}
		return false;
	}
}
