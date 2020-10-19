package exercises;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		System.out.print("nhập số a:");
		float a = input();
		System.out.print("nhap số b:");
		float b = input();
		phuongTrinhBacNhat(a, b);
	}

	private static void phuongTrinhBacNhat(float a, float b) {

		try {
			if (a == 0) {
				throw new ArithmeticException("lỗi chia không");
			} else
				System.out.println("phương trình có nghiệm:" + -b / a);

		} catch (ArithmeticException e) {

			if (b != 0) {
				System.out.println("error :" + e.getMessage());
			} else
				System.out.println("phương trình vô số nghiệm");
		}

	}

	private static float input() {
		String s = "";
		int n = 0;
		while (true) {
			try {
				Scanner sc = new Scanner(System.in);
				s = sc.nextLine();
				n = Integer.parseInt(s);
				break;
			} catch (NumberFormatException e) {
				System.out.print("error: nhap vao mot so nguyen ");
			}

		}
		return n;
	}
}
