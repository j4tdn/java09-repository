package exercises;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		do {
			try {
				System.out.println("Enter password: ");
				String password = scanner.nextLine();
				compare("A!1email", "A!1username", password);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (true);
		System.out.println("Done");
	}

	private static void compare(String email, String username, String password) throws Exception {
		String regexLowercase = ".*[a-z].*";// ".*": so khớp bất kì kí tự đơn nào, 0 hoặc nhiều..[a-z] có 1 kí tự thường
		String regexUppercase = ".*[A-Z].*";//luôn có kí tự hoa
		String regexNumber = ".*[0-9].*";//luôn có 1 chữ số
		String regexBlankChar = ".*[\\s].*";//so khớp kí tự rỗng
		String regexSpecial = ".*[^\\w].*";//kí tự không phải chữ và số--kết hợp với [\\s] suy ra kí tự đặc biệt
		if(password.length() < 8) {
			throw new Exception("Phải có ít nhất 8 kí tự");
		}
		if(password.length() > 256) {
			throw new Exception("Phải ít hơn hoặc bằng 256 kí tự");
		}
		if (!password.matches(regexLowercase)) {
			throw new Exception("Phải có ít nhất 1 kí tự thường");
		}
		if (!password.matches(regexUppercase)) {
			throw new Exception("Phải có ít nhất 1 kí tự hoa");
		}
		if (!password.matches(regexNumber)) {
			throw new Exception("Phải có ít nhất 1 chữ số");
		}
		if (password.matches(regexBlankChar)) {
			throw new Exception("Không được có kí tự trống");
		}
		if (!password.matches(regexSpecial)) {
			throw new Exception("Phải có ít nhất 1 kí tự đặc biệt");
		}
		
		if(password.contains(email) || password.contains(username)) {
			throw new Exception("Password không được chứa username hoặc email");
		}
	}
}
