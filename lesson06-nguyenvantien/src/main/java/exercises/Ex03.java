package exercises;

import java.util.Scanner;

import entity.EmailException;

public class Ex03 {
	public static void main(String[] args) {

		String email = "";
		do {
			try {
				System.out.println("Enter email: ");
				email = inputEmail();
				System.out.println("Email: " + email + "...Hợp lệ");
				break;
			} catch (EmailException e) {
				System.out.println(e.getMessage());
			}
		} while (true);

	}

	public static String inputEmail() throws EmailException {
		Scanner scanner = new Scanner(System.in);
//		^[a-zA-Z]: chữ cái đầu phải là chữ thường hoặc hoa
//		[\\w]*: có 0 hoặc nhiều chữ thường hoa và số
//		@: tiếp theo là @.....[\\w]+: có 1 hoặc nhiều chữ thường hoa hoặc số
//		(\\.[\\w]+)*: tiếp theo là dấu chấm rồi đến 1 hoặc nhiều chữ thường, hoa và số(biểu thức có thể có hoặc không)
//		(\\.[a-zA-Z]{2,})$: sau dấu chấm phải luôn có ít nhất 2 kí tự chữ và kết thúc chuỗi
		String regexEmail = "^[a-zA-Z][\\w]*@[\\w]+(\\.[\\w]+)*(\\.[a-zA-Z]{2,})$";
		String email = scanner.nextLine();
		if (!email.matches(regexEmail)) {
			throw new EmailException("Không hợp lệ");
		}
		return email;
	}
}
