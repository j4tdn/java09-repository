package exercises;

import java.util.Scanner;

public class Ex01 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Nhap hoanh do tam duong tron:");
		float xO = sc.nextFloat();
		System.out.print("Nhap tung do tam duong tron:");
		float yO = sc.nextFloat();
		System.out.print("Nhap ban kinh duong tron:");
		float radius = sc.nextFloat();
		System.out.print("Nhap xA:");
		float xA = sc.nextFloat();
		System.out.print("Nhap yA:");
		float yA = sc.nextFloat();
		
		if (isOnCircle(xO, yO, radius, xA, yA)) {
			System.out.println("Diem A co thuoc duong tron");
		} else {
			System.out.println("Diem A khong thuoc duong tron");
		}

	}

	private static boolean isOnCircle(float xO, float yO, float radius, float xA, float yA) {
		float x = (xA - xO) * (xA - xO) + (yA - yO) * (yA - yO);
		if (x == radius * radius) {
			return true;
		}

		return false;
	}
}
