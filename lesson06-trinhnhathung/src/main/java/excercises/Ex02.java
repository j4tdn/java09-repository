package excercises;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex02 {
	public static void main(String[] args) {
		while (true) {
			try {
				System.out.print("Enter password:");
				String password = signUp();
				System.out.println("Sign up succeed");
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	private static String signUp () throws Exception {
		Scanner ip = new Scanner(System.in);
		String password = ip.nextLine();
		if (!password.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[1-9])(?=.*\\W).{8,256}$")) {
			throw new  Exception("Invalid password");
		}
		return password;
	}
}
