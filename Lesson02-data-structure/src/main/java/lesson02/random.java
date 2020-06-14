package lesson02;

import java.util.Scanner;
public class random {
	public static void main(String[] args) {
		int []a =new int[20];
		int n=10;
		input (a,n);
		output (a,n);
	}
	public static void input (int a[],int n)
	{
		Scanner scan =new Scanner (System.in);
		System.out.println(" nhap vao chuoi so :");
		for (int i=0;i<n;i++)
		{
			 a[i]=scan.nextInt();
		}
	}

	public static void output (int a[], int n)
	{ int dem=0;
		for (int i=0;i<n;i++) {
			if (a[i]==a[i+1]) continue;
			else
			{
				   
			dem++;
			}
			if (dem==5) break;
		}
	}
}
