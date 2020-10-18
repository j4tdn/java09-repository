package bai2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckPassword {
	public static void main(String[] args) {

		System.out.println("Enter password: ");
		Scanner ip = new Scanner(System.in);
		String pass = ip.nextLine();
		String username = "NguyenVanA123@gmail.com";

		try {
			CheckPass(pass, username);
			System.out.println(" password is set successfully ! ");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	private static boolean CheckPass(String pass, String username) throws InvalidPassException {
		if (pass.length() < 8) {
			throw new InvalidPassException("At least 8 characters !");
		}
		if (pass.length() > 256) {
			throw new InvalidPassException("At most 256 characters !");
		}

		if (!pass.matches(".*[0-9].*")) {
			throw new InvalidPassException("At least 1 number !");
		}
		if (!pass.matches(".*[A-Z].*")) {
			throw new InvalidPassException("At least 1 uppercase alphabetic character !");
		}
		if (!pass.matches(".*[a-z].*")) {
			throw new InvalidPassException("At least 1 lowercase alphabetic character !");
		}

		if (!pass.matches(".*[^A-Za-z0-9].*")) {
			throw new InvalidPassException("At least 1 special character !");
		}

		if (pass.contains(username)) {
			throw new InvalidPassException("Must not contain email !");

		}

		return true;

	}

}
