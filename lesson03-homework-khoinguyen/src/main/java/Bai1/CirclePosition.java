package Bai1;

import java.util.Scanner;

public class CirclePosition {
	static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("nhap hoang do tam O :");
		int xO = ip.nextInt();
		System.out.println("nhap tung do tam O :");
		int yO = ip.nextInt();
		System.out.println("nhap ban kinh r :");
		int r = ip.nextInt();
		System.out.println("nhap hoang do diem A :");
		int xA = ip.nextInt();
		System.out.println("nhap tung do diem A:");
		int yA = ip.nextInt();

		CirclePos Pos = getPos(xO, yO, r, xA, yA);
		System.out.println("Pos : " + Pos.value);
	}

	private static CirclePos getPos(int xA, int yA, int r,int xO, int yO) {
		double distance = Math.sqrt((xA - xO ) * (xA - xO) + (yA - yO ) * (yA - yO));
		if (distance > r) {
			return CirclePos.OUTSIDE;
		}
		if (distance > r) {
			return CirclePos.ONSIDE;
		}
		return CirclePos.INSIDE;
	}
}