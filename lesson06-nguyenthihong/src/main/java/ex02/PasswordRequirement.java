package ex02;

import java.util.Scanner;

public class PasswordRequirement {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		inputString();
	}

	public static String inputString() {
		String string = " ";
		char[] characters = { '[', '!', '@', '#', '$', '%', '^', '&', '*' };
		do {
			System.out.println("Nhập chuỗi: ");
			string = input.nextLine();
			boolean isExistNumberCharacter = checkPass(string, c -> Character.isDigit(c));
			boolean isExistUpperCharacter = checkPass(string, c -> Character.isUpperCase(c));
			boolean isExistSpecialCharacter = checkPass(string, c -> isExistInSpecialCharacters(characters, c));
			boolean isExistLowerCharacter = checkPass(string, c -> Character.isLowerCase(c));
			boolean isValidLength = string.length() >= 8 && string.length() <= 256;

			if (!isValidLength) {
				System.out.println("Mật khẩu có độ dài không hợp lệ");
				continue;
			} else {
				if (!isExistNumberCharacter || !isExistUpperCharacter || !isExistLowerCharacter
						|| !isExistSpecialCharacter) {
					System.out.println("Không hợp lệ");
					continue;
				} else {
					System.out.println("Mật khẩu hợp lệ");
					break;
				}
			}

		} while (true);
		return string;
	}

	public static boolean checkPass(String pass, Condition condition) {
		int count = 0;
		int lenght = pass.length();
		for (int i = 0; i < lenght; i++) {
			char character = pass.charAt(i);
			if (condition.checkPass(character)) {
				count++;
			}
		}
		return count > 0;
	}

	public static boolean isExistInSpecialCharacters(char[] characters, char character) {
		for (int i = 0; i < characters.length; i++) {
			if (characters[i] == character) {
				return true;
			}
		}
		return false;
	}
}
