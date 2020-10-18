package ex02;

import java.util.Scanner;

public class Password {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		String password = null;
		while (true) {
			try {
				password = inputPassword();
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		System.out.println(" password: " + password);

	}

	private static String inputPassword() throws Exception {
		System.out.print("nhap password: ");
		String password = ip.nextLine();
		if (password.length() < 8 || password.length() > 256) {
			throw new Exception("Password 8->256");
		}
		if (!password.matches(".*[a-z]+.*")) {
			throw new Exception("at least one lowercase alphabetic character");
		}
		if (!password.matches(".*[A-Z]+.*")) {
			throw new Exception("at least one uppercase alphabetic character");
		}
		if (!password.matches(".*\\d.*")) {
			throw new Exception(" at least one number");
		}
		if (!password.matches(".*[~!@#$%^&*()_+-=[]\\{}|;':\",.//<>?]]+.*")) {
			throw new Exception(" at least one special character");
		}
		

		return password;
	}
}
