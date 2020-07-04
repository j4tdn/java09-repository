

import java.util.Scanner;

public class Exercise01 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Tam duong tron O: ");
		System.out.print("  xO = ");
		float xO = ip.nextFloat();
		System.out.print("  yO = ");
		float yO = ip.nextFloat();
		System.out.print("Ban kinh duong tron: R = ");
		float R = ip.nextFloat();
		System.out.println("Diem A: ");
		System.out.print("  xA = ");
		float xA = ip.nextFloat();
		System.out.print("  yA = ");
		float yA = ip.nextFloat();
		double distance = Math.sqrt((xA - xO) * (xA - xO) + (yA - yO) * (yA - yO));
		if (distance == R) {
			System.out.println("A thuộc đường tròn");
		} else {
			System.out.println("A không thuộc đường tròn");
		}
	}

}
