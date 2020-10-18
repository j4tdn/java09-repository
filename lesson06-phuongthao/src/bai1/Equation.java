package bai1;

import java.util.Scanner;

public class Equation {
	public static void main(String[] args) {

		try {
			float result = doCalculate();
			System.out.println("return: " + result);
		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static float doCalculate() throws Exception {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a");
		int a = Integer.parseInt(ip.nextLine());

		System.out.println("Enter b");
		int b = Integer.parseInt(ip.nextLine());

		return ((float) -b) / a;
	}

}
