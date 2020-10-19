package exercises;

import java.util.Scanner;

public class Ex03 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String email = "buivanquocpd@gmail.com";
		do {
			try {
				System.out.print("Enter email:");
				email = checkEmail();
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (true);
		System.out.println("nhâp thành công");

	}

	private static String checkEmail() throws Exception {
		String email = sc.nextLine();
		if (!email.matches("^[A-Za-z0-9.-]+@[A-Za-z0-9.-]+$"))
		{
			throw new Exception("email không hợp lệ");
		}
		return email;
	}

}
