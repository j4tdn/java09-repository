package baitap;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String email = "";
		do {
			System.out.println("Enter email:");
			email = sc.nextLine();
			try {
				if (!isValidEmail(email)) {
					
				}
				System.out.println("Email correct:" + email);
				break;
			} catch (InvalidEmailException e) {
				System.err.println(e.getMessage());
				System.out.println("please enter email again!");
			}
		}

		while (true);

	}

	private static boolean isValidEmail(String email) throws InvalidEmailException {
		if (email.length() < 8) {
			throw new InvalidEmailException("At least 8 letters");
		}
		if (email.length() > 256) {
			throw new InvalidEmailException("At most 256 letters");
		}
		char[] c1 = email.toCharArray();
		int count = 0;
		for (char i : c1) {
			if (i >= 'a' && i <= 'z') {
				count = 1;
			}
		}
		if (count == 0) {
			throw new InvalidEmailException("At least 1 letter lowercase");
		}

		count = 0;

		for (char i : c1) {
			if (i >= 'A' && i <= 'Z') {
				count = 1;
			}
		}
		if (count == 0) {
			throw new InvalidEmailException("At least 1 letter uppercase");
		}

		count = 0;

		for (char i : c1) {
			if (i >= '0' && i <= '9') {
				count = 1;
			}
		}
		if (count == 0) {
			throw new InvalidEmailException("At least 1 letter is number");
		}

		count = 0;

		for (char i : c1) {
			if ((i >= '!' && i <= '/') || (i >= ':' && i <= '@') || (i >= '[' && i <= 96) || (i >= 123 && i <= 126)) {
				count = 1;
			}
		}
		if (count == 0) {
			throw new InvalidEmailException("At least 1 letter is special");
		}

		return true;
	}
}
