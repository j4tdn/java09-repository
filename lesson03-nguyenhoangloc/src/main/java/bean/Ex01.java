package bean;

import java.util.Scanner;


public class Ex01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap tam va ban kinh");
		System.out.println("nhap xO");
		int x=sc.nextInt();
		System.out.println("nhap yO");
		int y=sc.nextInt();
		System.out.println("nhap r");
		int r=sc.nextInt();
		System.out.println("nhap diem A");
		System.out.println("nhap diem xA");
		int xA=sc.nextInt();
		System.out.println("nhap diem yA");
		int yA=sc.nextInt();
		System.out.println(getPos(x, y, xA, yA, r));
		
		
	}
	private static String getPos(int x, int y, int xA, int yA, int R) {
		int distance = (int) Math.sqrt((xA - x) * (xA - x) + (yA - y) * (yA - y));
		if(distance >R) {
			return "khong thuoc duong tron";
			}else
		return "thuoc duong tron";
	}
}



