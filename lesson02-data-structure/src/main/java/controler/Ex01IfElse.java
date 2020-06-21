package controler;

import java.util.Scanner;

public class Ex01IfElse {
	private static Scanner ip= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Nhap diem: ");
		float point= ip.nextFloat();// 0-10 -tu lam
		if( point >=0 && point< 5) {
			System.out.println("Yeu");
		}
		else if( point < 6.5) {
			System.out.println("Trung binh");
		}
		else if( point <8) {
			System.out.println("Kha");
		}
		else if( point<=10) {
			System.out.println("Gioi");
		}
		
}
}
