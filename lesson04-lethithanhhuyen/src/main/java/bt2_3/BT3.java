package bt2_3;

import java.util.Scanner;

public class BT3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[100];
		a[0] = 1;
		a[1] = 1;
		int num = 2;
		
		System.out.println("n = ");
		int n = sc.nextInt();
		
		System.out.println("11");
		int temp2 = 0;
		for (int i = 0; i<n; i++) {
			for(int j =1; j<num; j++) {
				if (j==1) {
					temp2 = 1;
				}
				int temp = a[j];
				a[j] = a[j] +temp2;
			    temp2 = temp;
			}
			++num;
			a[num-1] = 1;
			for (int k=0;k<num;k++) {
				System.out.printf(a[k]+"\t");
			}
			System.out.println();
		}
	}
}
