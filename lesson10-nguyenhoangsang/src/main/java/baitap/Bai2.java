package baitap;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		do {
			try {
				inputPassword();
				break;
			} catch (InvalidNumberOfCharactersException e) {
				System.out.println(e.getMessage());
			} catch (MissingNumberCharException e) {
				System.out.println(e.getMessage());
			} catch (MissingUpperOrLowerCaseCharException e) {
				System.out.println(e.getMessage());
			}catch (MissingSymbolCharException e) {
				System.out.println(e.getMessage());
			}
		} while (true);
		System.out.println("Bạn đã nhập mật khẩu thành công !!");
	}

	public static void inputPassword() throws InvalidNumberOfCharactersException, MissingUpperOrLowerCaseCharException,
			MissingNumberCharException, MissingSymbolCharException {
		Scanner ip = new Scanner(System.in);
		int checkLowerCaseChar = 0;
		int checkUpperCaseChar = 0;
		int checkNumber = 0;
		int checkSymbol = 0;
		System.out.print("Moi nhap mat khau: ");
		String password = ip.nextLine();
		if (password.length() < 8 || password.length() > 256) {
			throw new InvalidNumberOfCharactersException(
					"Mật khẩu phải có" + "ít nhất 8 kí tự và nhiều nhất là 256 kí tự !! ");
		}
		for (int i = 0; i < password.length(); i++) {
			if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') {
				checkUpperCaseChar = 1;
			}
			if (password.charAt(i) >= 'a' && password.charAt(i) <= 'a') {
				checkLowerCaseChar = 1;
			}

			if (password.charAt(i) >= '0' && password.charAt(i) <= '9') {
				checkNumber = 1;
			}

			if ((password.charAt(i) >= '!' && password.charAt(i) <= '/')  || ( password.charAt(i) >= ':'
					&& password.charAt(i) <= '@')) {
				checkSymbol = 1;
			}
		}

		if (checkLowerCaseChar == 0 && checkUpperCaseChar == 0) {
			throw new MissingUpperOrLowerCaseCharException(
					"Mật khẩu phải " + "có ít nhất 1 kí tự hoa và 1 kí tự thường !!");
		}

		if (checkNumber == 0) {
			throw new MissingNumberCharException("Mật khẩu phải có ít nhât" + "1 chữ số !! ");
		}

		if (checkSymbol == 0) {
			throw new MissingSymbolCharException("Mật khẩu phải có ít nhất" + "1 kí tự đặc biệt !! ");
		}

	}
}
