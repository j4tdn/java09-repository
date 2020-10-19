package ex02;

import java.util.Scanner;

public class Ex02 {
	static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Input your Email: ");
		String email = ip.nextLine();
		System.out.println("Input your name: ");
		String name = ip.nextLine();
		System.out.println("Create a password!");
		String password = null;
		while (true) {
			try {
				password = inputPassword(name, email);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Your password: " + password);
	}

	private static String inputPassword(String name, String email) throws Exception {

		System.out.print("Input your password: ");
		String password = ip.nextLine();
		if (password.length() < 8 || password.length() > 256) {
			throw new Exception("Contain password's length has to be between 8 and 256");
		}
		if (!password.matches(".*[a-z]+.*")) {
			throw new Exception("Contain at least one lowercase alphabetic character");
		}
		if (!password.matches(".*[A-Z]+.*")) {
			throw new Exception("Contain at least one uppercase alphabetic character");
		}
		if (!password.matches(".*\\d.*")) {
			throw new Exception("Contain at least one number");
		}
		if (!password.matches(".*[^\\w]+.*")) {
			throw new Exception("Contains at least one special character");
		}
		if (password.matches(".*" + name + ".*")) {
			throw new Exception("Must not contain name");
		}
		if (password.matches(".*" + email + ".*")) {
			throw new Exception("Must not contain email address");
		}
		return password;
	}
}
