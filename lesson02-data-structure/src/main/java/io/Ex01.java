package io;

import java.security.DrbgParameters.NextBytes;
import java.time.Year;
import java.util.Scanner;

public class Ex01 {
	private static Scanner ip=new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("nhap ho va ten:");
		String fullname=ip.nextLine();
		
		System.out.print("year birth:");
		inputNumber();
		int year=Integer.parseInt(ip.nextLine());
		
		
		
		System.out.println("hobbies:");
		String hobbies=ip.nextLine();
		
		System.out.println("fullname:"+fullname+
				"\n"+"age:"+(Year.now().getValue()-year)
				+"\n"+"yearbirth:"+year
				+"\n"+"hobbies:"+hobbies);
		
		
	}
	private static int inputNumber(){

		int number=0;
		while(true) {
			String text=ip.nextLine();
			if(isNumber(text)) {
			
				number = Integer.parseInt(text);
				break;
			}
			System.out.println("moi nhap lai:");
		}
		return number;
	}
	private static boolean isNumber(String text) {
		for(int i=0;i<text.length();i++) {
			if(!Character.isDigit(text.charAt(i)))
				return false;
		
		}
		return true;
	}
}
