package exercises;

import java.util.Scanner;
public class Ex05 {
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int number = 10;
		long result = 0; 
		int[] arr = new int[50];
		int n = 0;
		while (number > 0) {
			arr[n] = number % 2;
			number /= 2;
			n++;
		}
		for(int i = n - 1 ; i >= 0; i--) {
			result = result * 10 + arr[i];
		}
		System.out.println("đổi sang dạng nhị phân là: " + result);
	}
}
