package exception;

import java.util.Scanner;

public class Ex01 {
	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter number: ");
		String s="";
		while(true) {
			s=sc.nextLine();
			if(s.matches("\\d+")){
				int number=Integer.parseInt(s);
				System.out.println("Number:"+number);
				break;
			}
			System.out.println("Enter number:");
		}
	}
}
