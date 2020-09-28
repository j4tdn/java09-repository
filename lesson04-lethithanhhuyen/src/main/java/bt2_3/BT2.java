package bt2_3;

import java.util.Scanner;

public class BT2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int[] a = new int[100];
		int n;
		System.out.println("Nhập số phần tử: ");
		n = sc.nextInt();
		for (int i=0; i<n; i++) {
			System.out.println("A["+i+"] = ");
			a[i] = sc.nextInt();
		}
		
		int i=0;
		int vt=0;
		do {
			if (a[i] % 7 == 0) {
				int temp = a[vt];
				a[vt] = a[i];
				a[i] = temp;
				vt++;
				i++;
			}else {
				i++;
			}
		}while(i<n);
		
		System.out.println(vt);
		i = vt;
		int vtEnd = n - 1;
		while(i<vtEnd) {
			while (a[i] % 5 == 0 ) {
				int temp = a[vtEnd];
				a[vtEnd] = a[i]; 
				a[i] = temp;
				vtEnd--;
			}
			i++;
		}
		
		for (i=0; i<n; i++) {
			System.out.printf(""+a[i]+"  ");
		}
	}

}
