package io;

import java.time.Year;
import java.util.Scanner;

public class Ex01 {
	
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.print("fullname : ");
		String fullname = ip.nextLine();
		
		int year = input("year : ");
		
		
		System.out.print("hobbies : ");
		String hobbies = ip.nextLine();
		
		System.out.print("fullname : "+ fullname + 
				"\ntuoi : "+ (Year.now().getValue() -year) + 
				"\nyearofbirth : " + year +
				"\nhobbies : " + hobbies);
	}
	
	private static boolean kiemtra (String a) {
		for (int i =0; i< a.length() ; i++) {
			if (!Character.isDigit(a.charAt(i))) {
				return false;
			}
		}return true;
	}
	
	private static int input(String s) {
		System.out.print(s);
		int num =0;
		while (true) {
			String text = ip.nextLine();
			if (kiemtra(text)) {
				num =Integer.parseInt(text);
				break;
			}
			System.out.print(s);
		}
		return num;
	}

}
