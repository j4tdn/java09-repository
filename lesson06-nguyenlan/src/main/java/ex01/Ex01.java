package ex01;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int a, b = 0;
		float result;
		System.out.println("GIẢI PHƯƠNG TRÌNH BẬC 1 ax + b = 0");
		while(true) {
			try {
				System.out.print("Nhập a: ");
				a = Integer.parseInt(ip.nextLine());
				System.out.print("Nhập b: ");
				b = Integer.parseInt(ip.nextLine());
				result = -b/a;
				result = (float) -b/a;
				break;
			} catch (NumberFormatException e) {
				System.out.println("Không đúng kiểu dữ liệu, xin nhập lại!!!!!!");
			} catch (ArithmeticException e1) {
				if(b == 0) {
					System.out.println("Phương trình có vô số nghiệm!!!");					
				} else {
					System.out.println("Phương trình vô nghiệm!!!");
				}
				return;
			}
		}

		System.out.println("Nghiệm phương trình: " + result);
	}
}
