package ex03;

import java.util.Scanner;

public class Pascal {
	public static int Draw(int k,int n) {
		if (k == 0 || k == n) return 1;
	    if (k == 1) return n;
	    return Draw(k - 1, n - 1) + Draw(k, n - 1);
	}
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.print("Nhập số hàng: ");
		n=sc.nextInt();
		for (int i = 0; i < n; i++) {        
	        for (int j = 0; j <= i; j++) {
	            System.out.print(Draw(j,i)+" ");
	        }
	        System.out.println();
	    }}
		
	}
}
