package lesson02_Exercise;

public class Ex03 {
	public static void main(String[] args) {
		int a=26462;
		int b,c,d=0;
		for(b=a;b!=0;b=b/10) {
			c=b%10;
			d=d*10+c;	
		}
		if(a==d)
			System.out.println("La so doi xung");
		else
			System.out.println("Khong phai la so doi xung");

	}
}
