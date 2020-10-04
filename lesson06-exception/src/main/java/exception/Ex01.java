package exception;

import java.util.Scanner;

public class Ex01 {
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		String s = "";
		while (true) {
			System.out.printf("Enter number:");
			s = ip.nextLine();
			if (s.matches("[0-9]{1,}")) { //("\\d+")
				int number = Integer.parseInt(ip.nextLine());
				System.out.println("Value: " + number);
				break;
			} 
		} 
	}
}
