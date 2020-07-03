package main;

import java.util.Scanner;

public class Ex01 {
	static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		double centerX, centerY, xA, yA;
		double radius;
		// enter center O
		System.out.print("Enter value centerX of circle:");
		centerX = Double.parseDouble(ip.nextLine());
		System.out.print("Enter value centerY of circle:");
		centerY = Double.parseDouble(ip.nextLine());
		// enter radius
		System.out.print("Enter value radius of circle:");
		radius = Double.parseDouble(ip.nextLine());
		// enter point A
		System.out.print("Enter value xA:");
		xA = Double.parseDouble(ip.nextLine());
		System.out.print("Enter value yA:");
		yA = Double.parseDouble(ip.nextLine());

		int result = checkLocation(centerX, centerY, radius, xA, yA);
		if (result == 0) {
			System.out.println("Point A is in circle!");
		} else {
			if (result == 1) {
				System.out.println("Point A is outside circle!");
			} else {
				System.out.println("Point A is inside circle!");
			}
		}

	}

	private static int checkLocation(double centerX, double centerY, double radius, double xA, double yA) {
		double distance = Math.sqrt(Math.pow(xA - centerX, 2) + Math.pow(yA - centerY, 2));
		if (distance > radius) {
			return 1;
		}
		if (distance < radius) {
			return -1;
		}
		return 0;
	}
}
