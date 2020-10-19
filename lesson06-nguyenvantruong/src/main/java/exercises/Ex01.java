package exercises;

import java.util.Scanner;

public class Ex01 {

	 
	static Scanner ip= new Scanner(System.in);
	public static void main(String[] args) {
		int a;
		int b;
		int result=0;
		do {
			try {
			System.out.println("nhap a: ");
			a= Integer.parseInt(ip.nextLine());
			System.out.println("nhap b ");
			b = Integer.parseInt(ip.nextLine());
			result=-b/a;
			break;
			} catch (NumberFormatException e) {
				System.out.println("nhap sai kieu vui long nhap lai ");
			}
			catch (ArithmeticException e2) {
				
				System.out.println("ko nhap so 0 vui long nhap lai so a");
			}
			
		
	} while (true);
		System.out.println("result: "+result);
	}
}
