package controller;

import java.util.Scanner;

public class Ex01IfElse {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhap diem cua thi sinh (tu 0-10) : ");
		float diem = ip.nextFloat();
		
		if(diem < 5) {
			System.out.println("Yeu !");
		}
		else if(diem <=6.5) {
			System.out.println("Trung binh !");
		}
		else if (diem <=8) {
			System.out.println("Kha !");
		}
		else if (diem <=10) {
			System.out.println("Gioi !");
		}
		else System.out.println("ban nhap sai cmnr !");
	}
}
