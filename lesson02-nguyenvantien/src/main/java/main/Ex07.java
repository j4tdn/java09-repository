package main;

import java.util.Random;

public class Ex07 {

	public static void main(String[] args) {
		Random ra = new Random();
		int []arr = {20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
		int i, con = 0;

		while(con < 5) {
			i = ra.nextInt(11);
			if(arr[i] >= 20 && arr[i] <= 30) {
				System.out.println(arr[i]);
				arr[i] = 0;
				con++;
			}
		}
	}
}
