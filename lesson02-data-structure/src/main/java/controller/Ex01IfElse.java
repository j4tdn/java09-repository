package controller;

import java.util.Scanner;

public class Ex01IfElse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhap diem sinh vien: " );
		float diem = scan.nextFloat();
		
		if(diem>=0&&diem < 5) {
			System.out.println("hs yeu");
		}else
		if( diem<=6.5) {
			System.out.println("hs trung binh");
			
		} 
		else
		if(diem<8) {
			System.out.println("hs kha");
		}
		else
			if(diem<=10) {
				System.out.println("hs Gioi");
			}
			
		

	}
}

