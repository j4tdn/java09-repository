package lesson02exercises;

import java.util.Scanner;

public class Bai03 {
	public static void main(String[] args) {

		int sum = 0;
		int temp;

		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = ip.nextInt();
		for (temp = number; number != 0; number = number / 10) {
			int r = number % 10;
			sum = sum * 10 + r;
		}
		if (temp == sum)
			System.out.println("symmetrical numbers");
		else
			System.out.println("number is not symmetrical");
	}
}
