package exercises;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("===GIAI PHUONG TRINH BAC NHAT===");
		Scanner sc = new Scanner(System.in);
		int a = -1, b = -1;
		float result = 0;
		while(true) {
			try {
				System.out.print("Nhap a: ");
				a = Integer.parseInt(sc.nextLine());
				System.out.print("Nhap b: ");
				b = Integer.parseInt(sc.nextLine());
				if(a == 0) {
					throw new ArithmeticException();
				}
				
				result = (float) -b/a;
				break;
			} catch (NumberFormatException e) {
				System.out.println("Nhap khong dung dinh dang so! Vui long nhap lai");
			} catch (ArithmeticException e1) {
				if(b == 0) {
					System.out.println("Phuong trinh vo so nghiem");
					return;
				} else {
					System.out.println("Loi chia 0");
				}
			}
		}
		
		System.out.println("Ket qua: " + result);
	}
}
