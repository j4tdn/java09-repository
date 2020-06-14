package exercises;

import java.util.Random;

public class Ex07 {
	public static void main(String[] args) {
		int[] a = new int[5];
		Random rd = new Random();
		for (int i = 0; i < 5; i++) {			
			a[i] = newRandom(a);
			System.out.print(a[i] + " ");
		}		
	}	
	public static boolean check(int[] arr, int randomNumber) {
		for (int i = 0; i < arr.length ; i++) {
			if (randomNumber == arr[i]) {
				return false;
			}
		}
		return true;
	}
	public static int newRandom(int[] arr) {
		int number;
		do {
			Random rd = new Random();
			number = 20 + rd.nextInt(11);
		} while(check(arr, number) == false); 
		return number;
	}
}
