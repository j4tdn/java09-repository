package exercises;

import java.util.Scanner;

public class Ex02 {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Create a password!");
		String password = null;
		while(true) {
			try {
				password = inputPassword();
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println("Your password: " + password);
		
	}
	
	private static String inputPassword() throws Exception {
		System.out.print("Input your password: ");
		String password = sc.nextLine();
		if(password.length() < 8 || password.length() > 256) {
			throw new Exception("Password length between 8 and 256");
		}
		if(!password.matches(".*[a-z]+.*")) {
			throw new Exception("Contains at least one lowercase alphabetic character");
		}
		if(!password.matches(".*[A-Z]+.*")) {
			throw new Exception("Contains at least one uppercase alphabetic character");
		}
		if(!password.matches(".*\\d.*")) {
			throw new Exception("Contains at least one number");
		}
		if(!password.matches(".*[~!@#$%^&*()_+-=[]\\{}|;':\",.//<>?]]+.*")) {
			throw new Exception("Contains at least one special character");
		}
		if(password.matches(".*\\s+.*")) {
			throw new Exception("Must not contain name");
		}
		if(password.matches(".*[@{1}.+..+].*")) {
			throw new Exception("Must not contain email address");
		}
		
		return password;
	}
}
