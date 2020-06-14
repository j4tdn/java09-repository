package main;

import java.util.Scanner;

public class Ex03 {
      public static void main(String[] args) {
		  Scanner sc =new Scanner(System.in);
		  int a = sc.nextInt();
		  int b=0;
		  int c=a;
		  while (a!=0) {
			  b =b* 10 + a%10;
			  a=a/10;
		  }
		  if ( c== b) {
			  System.out.println("La so doi xung");
		  }else {
			  System.out.println("Khong phai la so doi xung");
		  }
	}
}
