package baitap;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		solveEquation();
	}
	
	public static void solveEquation() {
		Scanner ip = new Scanner(System.in);
		int a,b,result;
		
		do {
			try {
				do {
					try {
						System.out.print("Nhap a :");
						a = Integer.parseInt(ip.nextLine());
						break;
					} catch (NumberFormatException e) {
						System.out.println("Vui long nhap so !");
					}
				} while (true);
				
				do {
					try {
						System.out.print("Nhap b :");
						b = Integer.parseInt(ip.nextLine());
						break;
//						if(!(a == 0 && b == 0)) {
//							break;
//						}
					} catch (NumberFormatException e) {
						System.out.println("Vui long nhap so !");
					}
				} while (true);
				if (a == 0 && b==0) {
					System.out.println("Phuong trinh co vo so nghiem");
					return;
				} else {
					result = -b/a;
					System.out.println("Ket qua : " + result);
					break;
				}
			} catch (ArithmeticException e) {
				System.out.println("Phuong trinh vo nghiem !!");
				System.out.println("Vui long nhap lai 2 so !!");
			}
		} while (true);

	}
}
