package exercises;

import java.util.Scanner;

public class Ex01 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int a = 0, b = 0;

		while (true) {
			try {
				System.out.print("Nhap a: ");
				a = checkA();
				;
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("===============");
		while (true) {
			try {
				System.out.print("Nhap b: ");
				b = checkB();
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Nhap thanh cong a = " + a + " va b = " + b + " !");
	}

	private static int checkA() throws Exception {
		int a = Integer.parseInt(sc.nextLine());
		if (a == 0) {
			throw new Exception("Loi chia 0!");
		}
		if (!isNumber(String.valueOf(a))) {
			throw new Exception("Nhap ky tu so!");
		}
		return a;
	}

	private static int checkB() throws Exception {
		int b = Integer.parseInt(sc.nextLine());
		if (!isNumber(String.valueOf(b))) {
			throw new Exception("Nhap ky tu so!");
		}
		return b;
	}

	private static boolean isNumber(String a) {
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) < '0' || a.charAt(i) > '9') {
				return false;
			}
		}
		return true;
	}
}