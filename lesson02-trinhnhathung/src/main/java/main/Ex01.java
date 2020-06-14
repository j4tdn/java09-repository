package main;

public class Ex01 {
	public static void main(String[] args) {
		 int a=8;
		 int b=9;
		 int c=5;
		 int t=0;
		 if (a>b) {
			 t=a;
			 a=b;
			 b=t;
		 }
		 if (a>c) {
			 t=a;
			 a=c;
			 c=t;
		 }
		 if (b>c) {
			 t=b;
			 b=c;
			 c=t;
		 }
		 
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println(c);
	}
}
