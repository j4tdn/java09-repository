package main;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
    	Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=0;
        int count=0;
        while (a!=0) {
        	b=b*10 +a%2;
        	a=a/2;
        	count++;
        }
        while (b!=0) {
			  a =a* 10 + b%10;
			  b=b/10;
			  count--;
		  }
          a=(int) (a* Math.pow(10, count));
        System.out.println(a);
	}
}
