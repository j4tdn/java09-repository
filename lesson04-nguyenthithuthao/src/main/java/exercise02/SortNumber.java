package exercise02;

import java.util.Scanner;

public class SortNumber {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Nhap mang
		int i,j;
		System.out.print("Enter element number of array: ");
		int n = scanner.nextInt();
		int[] a = new int[n];
		System.out.print("Enter number of array: ");
		for ( i = 0; i < n; i++) {
			System.out.printf("a[%d] = ", i);
			a[i] = scanner.nextInt();

		}
		//xuat 
		System.out.println("dãy số là: ");
		for(i=0;i<n;i++) {
			System.out.printf("%3d" , a[i]);
		}
		for(i=0;i<n;i++) {
			if( a[i]%7 == 0) {
				
			}
			
				
				
			
		}
		
		

	}

}
