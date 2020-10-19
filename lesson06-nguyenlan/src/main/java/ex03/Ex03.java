package ex03;

import java.util.Scanner;

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
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập email: ");
		String email = ip.nextLine();
		if(!email.matches("^[A-Za-z0-9.-]+@[A-Za-z0-9.-]+[^.]+$")) { // email phải bắt đầu bằng các kí tự chữ a-z A-Z, 0-9 + 1 kí tự @ và không được kết thúc bằng dấu chấm
			throw new EmailException();
		}
		if(email.matches("[,?/;:'{}!#$%^&*()-=+]")) {				//email có chứa dấu các ký tự đặc biệt (ngoại trừ . @) thì không hợp lệ
			throw new EmailException();
		}
		return email;
	}
}
