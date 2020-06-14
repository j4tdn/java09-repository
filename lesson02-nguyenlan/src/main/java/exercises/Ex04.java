package exercises;

import java.util.Scanner;

public class Ex04 {
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] arr = {5, 1, 9, 11, 10, 19, 17, 21, 30};
		int max = 0;
		int max2 = 0;
		for (int i = 0; i < arr.length ; i++ ) {
			if (isOdd(arr[i]) == true) {
				if (arr[i] > max) {
					max2 = max;
					max = arr[i];
				}
			}
		}
		if (max2 == 0) {
			System.out.println("không có số lẽ lớn thứ 2 trong dãy số.");
		} else {
			System.out.println("số lẽ lớn thứ 2 là: " + max2);
		}		
	}
	
	public static boolean isOdd(int n) {
		return (n % 2 != 0);
	}
}
