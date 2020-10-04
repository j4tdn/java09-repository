package exception;

import java.util.Scanner;

public class Ex01 {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("enter number: " );
		String s="";
		do{
			 s=ip.nextLine();
			if(s.matches("\\d+")) {
				int number=Integer.parseInt(s);
				System.out.println("value"+number);
				break;
		}
			System.out.print("enter number: " );
		}while(true);
		
		
			
	}
}
