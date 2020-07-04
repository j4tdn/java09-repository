package Bai1;

import java.util.Scanner;

public class CirclePos {
	static Scanner ip= new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("Nhap hoanh do tam : ");
		int x0= ip.nextInt();
		System.out.print("Nhap tung do tam : ");
		int y0= ip.nextInt();
		System.out.print("Nhap ban kinh : ");
		int R= ip.nextInt();
		System.out.print("Nhap hoanh do: ");
		int xA= ip.nextInt();
		System.out.print("Nhap hoanh do: ");
		int yA= ip.nextInt();
		
	CirclePosition pos = getPos(xA,yA,R,x0,y0);
	System.out.println("Vị trí của điểm là : " + pos.value);
}
	private static CirclePosition getPos(int xA, int yA, int R, int x0, int y0) {
		double distance = Math.sqrt(Math.pow((xA-x0),2) + Math.pow((yA-y0),2));
		if( distance > R) {
			System.out.println("Khoảng cách của 2 điểm la :" +distance);
			return CirclePosition.OUTSIDE;
		}
		if( distance == R) {
			System.out.println(distance);
			return CirclePosition.ONSIDE;
	}
		System.out.println(distance);
		return CirclePosition.INSIDE;
}
}
