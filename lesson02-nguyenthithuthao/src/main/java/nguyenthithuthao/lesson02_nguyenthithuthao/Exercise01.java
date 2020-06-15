package nguyenthithuthao.lesson02_nguyenthithuthao;

import java.util.Scanner;

public class Exercise01 {
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int temp;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number: " );
		a = scan.nextInt();
		System.out.println("Enter the second number: ");
		b =scan.nextInt();
		System.out.println("Enter the third number: ");
		c= scan.nextInt();
		if(a>b) {
			temp=a;
			a=b;
			b=temp;
		}
		if(a>c) {
			temp=a;
			a=c;
			c=temp;
			
		}
		if(b>c) {
			temp=b;
			b=c;
			c=temp;
		}
		System.out.println("Ascending sequence: " + a +","  + b + "," + c);
		
		
		
		
	}

}


