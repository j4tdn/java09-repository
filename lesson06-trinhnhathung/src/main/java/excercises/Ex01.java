package excercises;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		float a, b;
		while (true) {
			try {
				System.out.print("Enter a:");
				a = inputNumber();
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

		while (true) {
			try {
				System.out.print("Enter b:");
				b = inputNumber();
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

		if (a == 0) {
			if (b == 0) {
				System.out.println("Phuong trinh vo so nghiem");
			} else {
				System.out.println("Phuonng trinh vo nghiem");
			}
		} else {
			System.out.println("Phuong trinh co nghiem:" + (-b/a));
		}
	}

	private static float inputNumber() throws NumberFormatException {
		Scanner ip = new Scanner(System.in);
		return Float.parseFloat(ip.nextLine());
	}
}
