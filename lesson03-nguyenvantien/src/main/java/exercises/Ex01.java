package exercises;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int xA, yA, xO, yO, r;
		System.out.println("Nhập tâm và bán kính đường tròn.");
		System.out.print("xO = ");
		xO = scanner.nextInt();
		System.out.print("yO = ");
		yO = scanner.nextInt();
		System.out.print("R = ");
		r = scanner.nextInt();
		System.out.print("xA = ");
		xA = scanner.nextInt();
		System.out.print("yA = ");
		yA = scanner.nextInt();

		double distance = Math.sqrt(Math.pow(xA - xO, 2) + Math.pow(yA - yO, 2));
		if (distance == r) {
			System.out.println("Điểm A thuộc đường tròn O");
		} else {
			System.out.println("Điểm A không thuộc đường tròn O");
		}
	}
}
