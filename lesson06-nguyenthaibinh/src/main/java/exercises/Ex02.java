package exercises;

import java.util.Scanner;

public class Ex02 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String pw = "";

		while (true) {
			System.out.print("Nhap Mat Khau: ");
			try {
				pw = password();
				System.out.println("Mat khau la: " + pw);
				break;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private static String password() throws Exception {
		String result = sc.nextLine();

		if (result.length() < 8 || result.length() > 256) {
			throw new Exception("Mat Khau phai > 8 va < 256 ky tu!");
		}
		if (!isLowercase(result)) {
			throw new Exception("Mat khau phai co it nhat 1 chu thuong!");
		}
		if (!isUppercase(result)) {
			throw new Exception("Mat khau phai co it nhat 1 chu HOA!");
		}
		if (!isNumber(result)) {
			throw new Exception("Mat khau phai co it nhat 1 chu so!");
		}
		if (!isSpecialCharacter(result)) {
			throw new Exception("Mat khau phai co it nhat 1 ky tu dac biet!");
		}
		return result;
	}

	private static boolean isLowercase(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				return true;
			}
		}
		return false;
	}

	private static boolean isUppercase(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				return true;
			}
		}
		return false;
	}

	private static boolean isNumber(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				return true;
			}
		}
		return false;
	}

	private static boolean isSpecialCharacter(String s) {
		String specialChar = "~!@#$%^&*()_+=-{}.,<>?/`";
		for (int i = 0; i < s.length(); i++) {
			if (specialChar.contains(String.valueOf(s.charAt(i)))) {
				return true;
			}
		}
		return false;
	}
}