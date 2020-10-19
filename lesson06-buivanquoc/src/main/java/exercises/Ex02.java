package exercises;

import java.util.Scanner;

public class Ex02 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String password = "";
		do {
			try {
				password = checkPassword();
				break;

			} catch (Exception e) {
				System.out.println("error :" + e.getMessage());
			}
		} while (true);
		System.out.println("password :" + password);
	}

	private static String checkPassword() throws Exception {
		System.out.println("enter a password");
		String password = sc.nextLine();
		if (password.length() < 8 || password.length() > 256) {
			throw new Exception("password ít nhất 8 và nhiều nhất 256 kí tự ");
		} else if (!password.matches(".*[a-z]+.*")) {
			throw new Exception("password ít nhất một kí tự thường ");
		}
		else if (!password.matches(".*[A-Z]+.*")) {
			throw new Exception("password ít nhất một kí tự hoa ");
		}
		else if (!password.matches(".*[0-9].*")) {
			throw new Exception("password ít nhất một chữ số");
		}
		else if (!password.matches(".*[~!@#$%^&*()_+-=[]\\{}|;':\",.//<>?]]+.*")) {
			throw new Exception("password ít nhất một kí tự đặc biệt");
		}
		return password;
	}
}
