package io;

import java.time.Year;
import java.util.Scanner;

public class Ex01 {
	private static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {

		System.out.print("Fullname: ");
		String Fullname = ip.nextLine();

		
		int year = abc ("year: ");

		System.out.println("hobbies: ");
		String hobbies = ip.nextLine();

		System.out.println("==========");
		System.out.println("Fullname: " + Fullname 
				+ "\nnamsinh: " + year
				+ "\nhobbies: " + hobbies);
	}
	private static int abc(String func) {
		System.out.println(func);
		int number = 0;
		while(true) {
			String text = ip.nextLine();
			if(isNumber(text)) {
				number = Integer.parseInt(text);
				break;
			}
		}
		return number;
		
	}
	private static boolean isNumber(String text) {
		for (int i=0; i< text.length(); i++) {
			if(!Character.isDigit(text.charAt(i))) {
				return false;
			}
		}
		return true;
	}

}
