package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Ex1 {
	public static void main(String[] args) {
		int n = 10;
		int arr[] = new int[n];
		Random rand = new Random();
		for (int i = 0; i < n; i++) {
			arr[i] = rand.nextInt(10);
		}
		

		System.out.println("====");
		Arrays.sort(arr);
		
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("====");
		int result[] = getUniqueNumbers(arr);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
	}

	private static int[] getUniqueNumbers(int[] arr) {
		int result[] = new int[arr.length];
		int index = 0;
		if(arr[0] != arr[1]) {
			result[index] = arr[0];
			index++;
		}
		for(int i = 1;i<arr.length-1;i++) {
			if(arr[i] != arr[i-1] && arr[i] != arr[i+1]) {
				result[index] = arr[i];
				index++;
			}
		}
		if(arr[arr.length-2] != arr[arr.length-1]) {
			result[index] = arr[arr.length-1];
		}
		int []r1 = new int[index];
		for (int i = 0; i < r1.length; i++) {
			r1[i] = result[i];
		}
		return r1;
	}
}
