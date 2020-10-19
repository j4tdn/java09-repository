package ex01;

import java.util.Scanner;

public class PhuongTrinhBac1 {
	private static Scanner ip = new Scanner(System.in);

	static int input() {
		int n = 0;
		do {
			try {
				n = ip.nextInt();
				break;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Hãy nhập số nguyên !!!");
				break;
			}
		} while (true);
		return n;
	}

	public static void main(String[] args) throws Exception{
		int a, b;
		double h;
		System.out.println("Enter a: ");
		a = input();
		System.out.println("Enter b: ");
		b = input();

		System.out.println("Phương trình bậc nhất là: " + a + "x + " + b + " = 0");
		if (a == 0) {
			if (b == 0) {
				System.out.println("Phương trình có vô số nghiệm!!");
			} else {
				System.out.println("Phương trình vô nghiệm!!!");
			}
		} else {
			h = (double) -b / a;
			System.out.println("Phương trình có 1 nghiệm: " + h);
		}

	}

}
