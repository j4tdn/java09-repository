package excercises;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex02 {
	public static void main(String[] args) {
		while (true) {
			try {
				System.out.print("Enter password:");
				String password = signUp();
				System.out.println("Sign up succeed");
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	private static String signUp () throws Exception {
		Scanner ip = new Scanner(System.in);
		String password = ip.nextLine();
		if (!password.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[1-9])(?=.*\\W).{8,256}$")) {
			// ^ : bắt đầu chuỗi
			// (?=.*[A-Z]) : kiểm tra có ít nhất 1 kí tự hoa trong chuỗi
			// (?=.*[a-z]) : kiểm tra có ít nhất 1 kí tự thường trong chuỗi
			// (?=.*[1-9]) : kiểm tra có ít nhất 1 kí tự số trong chuỗi
			// (?=.*\\W)   : kiểm tra có ít nhất 1 kí tự đặc biệt trong chuỗi
			// .{8,256} : chuỗi phải có từ 8 -> 256 kí tự
			// $ : kết thúc chuỗi
			throw new  Exception("Invalid password");
		}
		return password;
	}
}
