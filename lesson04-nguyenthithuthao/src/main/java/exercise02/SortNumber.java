package exercise02;

import java.awt.print.Printable;
import java.util.Scanner;

public class SortNumber {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[100];
		// Nhap mang
		int i, j = 0, k = 0, n;
		System.out.print("Enter element number of array: ");
		n = scanner.nextInt();
		System.out.print("Enter number of array: ");
		for (i = 0; i < n; i++) {
			System.out.printf("a[%d] = ", i);
			a[i] = scanner.nextInt();

		}
		// xuat
		System.out.print("dãy số là: ");
		for (i = 0; i < n; i++) {
			System.out.printf("%3d", a[i]);
		}
		// sap xep
		for (i = 0; i < n; i++) {

			if (a[i] % 7 == 0) {
				b[j] = a[i];
				j++;
				

			}
			else if (a[i] % 5 == 0) {
					c[k] = a[i];
					k++;
				
		}

			}
		//ghep
		
		

		}

	}


