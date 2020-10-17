package exercises;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("===GIAI PHUONG TRINH BAC NHAT===");
		Scanner sc = new Scanner(System.in);
		int a, b;
		float result = 0;
		while(true) {
			try {
				System.out.print("Nhap a: ");
				a = Integer.parseInt(sc.nextLine());
				System.out.print("Nhap b: ");
				b = Integer.parseInt(sc.nextLine());
				result = (float)-b/a;
				break;
			} catch (NumberFormatException e) {
				System.out.println("Nhap khong dung dinh dang so! Vui long nhap lai");
			} catch (ArithmeticException e1) {
				System.out.println("Loi chia voi 0. Vui long nhap lai!");
			}
		}
		
		System.out.println("Ket qua: " + result);
	}
}
