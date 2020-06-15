package exercise;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Exercise5 {
	public static void main(String[] args) {
		System.out.println("nhap a: ");
		Scanner scanner =new Scanner(System.in);
		int a =scanner.nextInt();
		int b;
		int sum=0;
		int i=1;
		do { 
			b = a % 2;
			sum=sum+(i*b);
			a=a/2;
			i=i*10;
			}while (a > 0);
		System.out.println(+sum);
}
}
