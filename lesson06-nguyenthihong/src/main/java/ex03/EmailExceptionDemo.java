package ex03;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
 * mở đầu email: k phải dấu @ và các chữ số nên bắt buộc nó là các chữ cái 
 * trong các chữ cái từ a-z, A-Z và có thể xuất hiện 1 hoặc nhiều lần -> ^[a-zA-Z]+
 * tiếp theo: chuỗi có các kí tự nằm trong khoảng từ a-z, A-Z và các chữ số từ 0-9 và có thể xuất hiện 0 hoặc nhiều lần -> \\w*
 * dấu @ chỉ được xuất hiện 1 lần -> @{1}
 * tiếp theo: các chữ cái từ a-z, A-Z có thể xuất hiện 0 hoặc nhiều lần và không thể là các chữ số -> [a-zA-Z] .
 * sau đó là đuôi .com hoặc mail.com hoặc mail.com.vn -> (.com|mail.com|mail.com.vn)
 * kết thúc: dấu $
 */

public class EmailExceptionDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhập email: ");
		String email = input.nextLine();
		while (true) {
			try {
				validateEmail(email);
				break;
			} catch (Exception e) {
				System.out.println("Exception ocured: " + e);
				System.out.println("enter email again: ");
				email = input.nextLine();
			}
		}
	}

	public static void validateEmail(String email) throws EmailException {
		String regex = "^[a-zA-Z]+\\w*@{1}[a-zA-Z]+(.com|mail.com|mail.com.vn)$";
		Pattern patern = Pattern.compile(regex);
		Matcher matcher = patern.matcher(email);
		if (!matcher.find()) {
			throw new EmailException("Email is ot valid");
		} else {
			System.out.println("OK");
		}
	}

}
