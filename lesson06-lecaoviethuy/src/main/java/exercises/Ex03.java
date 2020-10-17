package exercises;

import java.util.Scanner;

import exception.EmailException;

public class Ex03 {
	public static void main(String[] args) {
		String email = null;
		while(true) {
			try {
				email = inputEmail();
				break;
			} catch (EmailException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Nhap thanh cong email!");
	}
	
	private static String inputEmail() throws EmailException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap email: ");
		String email = sc.nextLine();
		if(!email.matches("^[A-Za-z0-9.-]+@[A-Za-z0-9.-]+$")) {
			throw new EmailException();
		}
		return email;
	}
}
