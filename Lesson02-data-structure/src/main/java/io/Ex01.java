package io;
import java.time.Year;
import java.util.Scanner;

public class Ex01 {
	private static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Fullname : ");
		String fullname = ip.nextLine();
		
		

//		System.out.print("Year of birth : ");
//		int year = ip.nextInt();
//		ip.nextLine();//nhan ki tu enter
		
//		System.out.print("Year of birth : ");
		//int year = Integer.parseInt(ip.nextLine());//vi khi dung nextline thi se nhan luon gtri enter nen ko bi thua
		int year = inputNumber("year");
		System.out.println("");

		System.out.print("Hobbies : ");
		String hobbies = ip.nextLine();// cai hobbies se ko nhap dc vi han nhan gia tri enter khi minh nhap truoc do roi
		
		
		System.out.println("=============================");
		
		System.out.println("Fullname : " + fullname + 
							"\nAge : " + (Year.now().getValue() - year) +
							"\nYear of birth : " + year +
							"\nHobbie : " + hobbies);
		
		
	}
	private static int inputNumber (String func)
	{
		System.out.println(func);
		int number =0;
		while (true )
		{
			String text =ip.nextLine ();
			if (isNumber(text))
			{
				number =Integer.parseInt(text);
				break;
			}
			System.out.println("Emter a valid number!");
		}
			return number;
		}
	
	private static boolean isNumber(String text) {
		for ( int i=0;i<text.length();i++)
		{
			if (!Character.isDigit(text.charAt(i))) {
				return false;
			}
		}
		return true;
	}
}