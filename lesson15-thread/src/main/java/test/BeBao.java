package test;

import java.util.Scanner;

public class BeBao {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int n;
		System.out.print("Nhap n:");
		n=sc.nextInt();
		double s=1d;
		for(int i=1;i<=n;i++)
		{
			s+=1.0/i;
			
		}
		System.out.println("Tong S= "+s);
	}
}
