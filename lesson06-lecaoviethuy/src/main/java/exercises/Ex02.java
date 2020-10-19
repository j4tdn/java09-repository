package exercises;

import java.util.Scanner;

public class Ex02 {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Create a password!");
		String password = null;
		while(true) {
			try {
				password = inputPassword();
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println("Your password: " + password);
		
	}
	
	private static String inputPassword() throws Exception {
		System.out.print("Input your password: ");
		String password = sc.nextLine();
		if(password.length() < 8 || password.length() > 256) {
			throw new Exception("Password length between 8 and 256");
		}
		// .* là: . là bất kỳ ký tự nào, * là số lượng lớn hơn 0
		// neu chuoi khong chua ky tu a->z thi nem ra ngoai le
		// [a-z]+ : chứa các ký tự thường với số lượng lớn hơn 0
		if(!password.matches(".*[a-z]+.*")) {
			throw new Exception("Contains at least one lowercase alphabetic character");
		}
		// neu chuoi khong chua ky tu A->Z thi nem ra ngoai le
		// [A-Z]+ : chứa các ký tự hoa với số lượng lớn hơn 0
		if(!password.matches(".*[A-Z]+.*")) {
			throw new Exception("Contains at least one uppercase alphabetic character");
		}
		// \d+ là số với số lượng lớn hơn 0
		if(!password.matches(".*\\d+.*")) {
			throw new Exception("Contains at least one number");
		}
		// các ký tự đặc biệt số lượng lớn hơn 0
		if(!password.matches(".*[~!@#$%^&*()_+-=[]\\{}|;':\",.//<>?]]+.*")) {
			throw new Exception("Contains at least one special character");
		}
		
		return password;
	}
}
