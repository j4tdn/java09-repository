package main;

public class Ex02 {
	public static void main(String[] args) {
		 long s=0,t=1;
		 for (int i=2;i<=18;i++) {
			  t *=i;
			  if (i==4 || i==7 ||i==12 || i==18) {
				  s +=t;
			  }
		 }
		 System.out.println(s);
	}
}
