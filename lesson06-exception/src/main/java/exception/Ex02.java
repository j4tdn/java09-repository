package exception;

import java.util.Scanner;

public class Ex02 {
	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter number: ");
		int number=0;
		do {
		try {
			number=Integer.parseInt(sc.nextLine());
			break;
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		}while(true);
		System.out.println("Number:"+number);
	}
}
