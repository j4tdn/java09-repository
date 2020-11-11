package bai2;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập n = ");
		int n = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[n];
		for (int i=0; i<n; i++) {
			System.out.println("Nhập xâu thứ " + (i+1) + ": ");
			arr[i] = sc.nextLine();
		}
		
		System.out.println(String.join(", ", getLargestNumber(arr)));
	}
	
	private static String[] getLargestNumber(String[] arr) {
		String[] result = new String[arr.length];
		
		for (int i=0; i<arr.length; i++) {
			String[] numbers = arr[i].split("[a-z]++");
			for (int j=0; j<numbers.length; j++) {
				while(numbers[j].startsWith("0")) {
					numbers[j] = numbers[j].substring(1);
				}
			}
			
			if (numbers.length == 0) {
				result[i] = "0";
				continue;
			} else {
				String max = numbers[0];
				for (int j = 1; j < numbers.length; j++) {
					if (max.compareTo(numbers[j]) < 0) {
						max = numbers[j];
					}
				}
				
				result[i] = max;
			}
		}
		
		return result;
	}
	
		
		
}
