package exercise01;

import java.util.Random;

public class Ex07 {
	public static void main(String[] args) {
		Random rd = new Random();
		int[] a = new int[5];
		
		for (int i=0; i <5; i++) {
			do {
				a[i] = 20 + rd.nextInt(11);
			} while (!kiemtra(a[i] , a));
			
			
		}
		
		for (int i=0; i <5; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	private static boolean kiemtra(int n,int[] a) {
		int d=0;
		for (int i=0; i <5; i++) {
			if (n == a[i]) {
				d++;
			}
		} if (d > 1) {
			return false;
		} else {
		return true;
		}
	}
}
