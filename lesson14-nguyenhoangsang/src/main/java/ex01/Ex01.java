package ex01;

import java.util.Arrays;
import java.util.Random;

public class Ex01 {
	public static void main(String[] args) {
		Random rd = new Random();
		int n = 5;
		
		int[] arr = new int[n];
		for (int i = 0 ; i < n ; i ++) {
			arr[i] = rd.nextInt(20) + 1;
		}
		
		for (int j = 0 ; j < n ; j ++) {
			System.out.print(arr[j] + " ");
		}
		
		//cau A
		System.out.println();
		int[] resultA = getUniqueNumbers(arr);
		for (int i = 0 ; i < resultA.length ; i ++) {
			System.out.print(resultA[i] + " ");
		}
		
		//cau B
		int[] resultB = new int[n];
		int k = 0;
		boolean check;
		for (int i = 0 ; i < arr.length ; i ++) {
			check = false;
			for ( int j =  0; j < resultA.length ; j ++) {
				if (arr[i] == resultA[j]) {
					check = true;
				}
			}
			if (check == false) {
				resultB[k++] = arr[i];
			}
		}
		System.out.println();
		int[] finalresultB = Arrays.copyOfRange(resultB, 0, k);
		for ( int i : finalresultB) {
			System.out.print(i + " ");
		}
	}
	
	private static int[] getUniqueNumbers(int[] arr) {
		int n = arr.length;
		boolean[] testArr = new boolean[n];
		for (int i = 0 ; i < n ; i ++) {
			testArr[i] = true;
		}
		for ( int i = 0 ; i < n - 1 ; i ++) {
			for (int j = i + 1 ; j < n ; j ++) {
				if (arr[i] == arr[j]) {
					testArr[i] = false;
					testArr[j] = false;
				}
			}
		}
		int[] result = new int[n];
		int k = 0;
		for (int i = 0 ; i < n ; i ++) {
			if (testArr[i] == true) {
				result[k++] = arr[i];
			}
		}
		
		return Arrays.copyOfRange(result, 0, k);
	}
}
