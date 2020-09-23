package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		int[] result = uniqueNumbersText(arr);
		for (int i : result) {
			System.out.println(i);
		}
	}

	private static int[] uniqueNumbers(int[] arr) {
		int[] result = new int[arr.length];
		int index = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == arr[i] && i != j) {
					count++;
				}
			}
			if (count == 0) {
				result[index] = arr[i];
				index++;
			}
		}

		return Arrays.copyOfRange(result, 0, index);
	}
	
	private static int[] uniqueNumbersText(int[] arr) {
		int[] result = new int[arr.length];
		int index = 0;
		Arrays.sort(arr);
		if(arr[0] != arr[1]) {
			result[index] = arr[0];
			index++;
		}
		
		for(int i = 1;i<arr.length-1;i++) {
			if(arr[i]!=arr[i-1] && arr[i]!=arr[i+1]) {
				result[index] = arr[i];
				index++;
			}
		}
		
		if(arr[arr.length-2] != arr[arr.length-1]) {
			result[index] = arr[arr.length-1];
			index++;
		}
		
		
		return Arrays.copyOfRange(result, 0, index);
	}
}
