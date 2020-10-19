package exercises;

import java.util.Scanner;

public class Ex03 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String email = "";
		while (true) {
			try {
				email = createEmail();
				System.out.println("Email : " + email);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	private static String createEmail() throws Exception {
		System.out.print("Nhap email: ");
		String email = sc.nextLine();
		if (email.length() <= 10 || email.length() >= 50) {
			throw new Exception("Email phai >= 10 va <= 50 ky tu!");
		}
		if (!contain(email)) {
			throw new Exception("Email phai ket thuc bang \"@gmail.com\"!");
		}
		if (!checkSpecialChar(email)) {
			throw new Exception("Email khong duoc chua ky tu dac biet!");
		}
		return email;
	}

	private static boolean contain(String s) {
		String finalEmail = "@gmail.com";
		int length = s.length() - finalEmail.length();
		if (!s.substring(length).contains(finalEmail)) {
			return false;
		}
		return true;
	}

	private static boolean checkSpecialChar(String s) {
		String finalEmail = "@gmail.com";
		String specialChar = "~!@#$%^&*()_+=-{}.,<>?/`";
		int length = s.length() - finalEmail.length();
		for (int i = 0; i < length; i++) {
			if (specialChar.contains(String.valueOf(s.charAt(i)))) {
				return false;
			}
		}
		return true;
	}
}