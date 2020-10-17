package excercises;

import java.util.Scanner;

import exception.EmailException;

public class Ex03 {
	 public static void main(String[] args) {
		while (true) {
			try {
				System.out.print("Enter email:");
				String email = enterEmail();
				System.out.println("Enter email succeed");
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	 
	 private static String enterEmail () throws EmailException {
		 Scanner ip = new Scanner(System.in);
		 String email = ip.nextLine();
		 if (!email.matches("^.+@.+\\..+$")) {
			 throw new EmailException("Invalid email");
		 }
		 return email;
	 }
}
