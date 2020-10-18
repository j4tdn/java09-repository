package bai3;

import java.util.Scanner;

import bai2.InvalidPassException;

public class CheckEmail {
	static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		String email = null;
		do {
			try {
				CheckEmail(email);
				System.out.println("Email is set successfully ! ");
				break;

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (true);
	}

	private static boolean CheckEmail(String email) throws EmailException {

		System.out.println("Enter email: ");
		email = ip.nextLine();
		if (!email.matches(".*[A-Za-z0-9.-]+@[A-Za-z0-9.-].*")) {
			throw new EmailException("valid email: a@gmail.com   abs@djk");
		}
		return false;

	}
}
