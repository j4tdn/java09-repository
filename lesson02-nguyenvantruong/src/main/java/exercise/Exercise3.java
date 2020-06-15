package exercise;

import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("nhap so: ");
		int a = scanner.nextInt();
		int b=0,c,d=0;
			for (b=a; b!=0; b=b/10) {
				c=b%10;
				d=d*10 +c;
			}
			if (a==d) {
				System.out.println("là số đôi xứng ");
				
			}else {
			System.out.println("không la số đối xứng  ");
			
	}
}
}
