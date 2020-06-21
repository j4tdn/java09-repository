package io;

import java.time.Year;
import java.util.Scanner;

public class Ex01 {
	
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Full name: ");
		String fullname = ip.nextLine();

		
	//	System.out.print("yearofbirth: "); 
		
		
		String yearText = 
		int year = Integer.parseInt(ip.nextLine());
	//	ip.nextLine();
		
		System.out.print("hobbies: ");
		String hobbies = ip.nextLine();
		
		 	
		
		System.out.println("\nFull name :" + fullname
				+"\nage " +(Year.now().getValue() - year)
				+"\nyear "+ year 
				+"\nhoppies" + hobbies);
// 
	}		
	private static int inputNumber(String func) {
		System.out.print(func);
		int number =0;
		while (true) {
			String text = ip.nextLine();
			if (isNumber(text)) {
				number = Integer.parseInt(ip.nextLine());
				break;
			}
		}
	}
	private static boolean isNumber(String text) {
		for (int i = 0; i<text.length(); i++) {
			if(ch)
		}
	}
}
	