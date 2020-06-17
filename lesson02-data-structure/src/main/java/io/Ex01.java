package io;

import java.time.Year;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("fullname: ");
		String fullname = ip.nextLine();
		// System.out.print("age: ");
		// int age = ip.nextInt();
		//System.out.print("yearofbirth: ");
		String yearText = ip.nextLine();
		int year = inputNumber("year: " );
		
		//int year =Integer.parseInt(ip.nextLine());
		ip.nextLine();
		System.out.print("hobbies: ");
		String hobbies = ip.nextLine();
		System.out.println("fullname: " + fullname 
				+ "\nage: " + (Year.now().getValue() - year) 
				+ "\nyear: " + year
				+ "\nhobbies: " + hobbies);

	}
	private static boolean isNumber(String text) {
		for(int i=0;i<text.length();i++) {
			if(!Character.isDigit(text.charAt(i))) {
				
			}
		}
		return false;
	}
	private static int inputNumber(String func) {
		Scanner ip = new Scanner(System.in);
		int number =0;
		while (true) {
			String text = ip.nextLine();
			if(isNumber(text)) {
				number =Integer.parseInt(text);
				break;
			}
			System.out.print("Enter a valid number");
		
			
			
		}
		return number;
	}

}

