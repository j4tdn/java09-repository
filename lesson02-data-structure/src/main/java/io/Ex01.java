package io;

import java.time.Year;
import java.util.Scanner;

public class Ex01 {
    public static Scanner ip=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Full name: ");
         String fullname=ip.nextLine();
 
        int year=inputNumber("year: ");
        System.out.print("hobbies:");
        String hb=ip.nextLine();
        System.out.println("==============");
        System.out.println("Full name:"+fullname
        		+"\nage:"+ (Year.now().getValue()-year)
        		+"\nyear:"+year
        		+"\nHobbies:"+hb);
	}
    public static int inputNumber(String func) {
    	System.out.println(func);
    	int number=0;
    	while(true) {
    		String text=ip.nextLine();
    		if(isNumber(text)) {
    			number=Integer.parseInt(text);
    			break;
    		}
    		System.out.print("Enter a valid number: ");
    	}
    	return number;
    }
	private static boolean isNumber(String text) {
		for(int i=0;i<text.length();i++) {
			if(!Character.isDigit(text.charAt(i)))
				{
				return false;
			}
		}
		return true;
	}
}
