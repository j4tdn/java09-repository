package ex03;

import java.util.Scanner;
import java.util.regex.Pattern;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Email {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		do {
			try {

				String email = checkEmail();
				break;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
		} while (true);

	}

	private static String checkEmail() throws Exception {
		System.out.println("Nhap email: ");
		String email = " ";
		email = sc.nextLine();

		// char a=(char) email.indexOf('@');
		String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
				+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

		if (!email.matches(EMAIL_PATTERN)) {
			throw new Exception();
		}

		return email;

	}

}
