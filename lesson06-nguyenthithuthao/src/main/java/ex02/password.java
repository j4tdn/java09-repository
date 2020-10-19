package ex02;

import java.util.Scanner;

public class password {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		String pw = "";
		do {
			try {
				pw = input(pw);

			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
		} while (true);

	}

	private static String input(String pw) throws Exception {
		System.out.println("Enter your password: ");
		// String pw;
		pw = ip.nextLine();
		if (pw.length() < 8) {
			System.err.println("At least 8 characters !!!");

		}
		if (pw.length() > 256) {
			System.out.println("Almost 256 characters!!");
		}

		//String p = "!@#$%^&*()_+";
		boolean check1 = false;
		boolean check2 = false;
		boolean check3 = false;
		boolean check4 = false;
		for (int i = 0; i <= pw.length(); i++) {
			if (pw.charAt(i) >= 65 && pw.charAt(i) <= 90) {
				check1 = true;

			}
			else if (pw.charAt(i) >= 97 && pw.charAt(i) <= 122) {
				check2 = true;

			}

			else if (pw.charAt(i) >= '0' && pw.charAt(i) <= '9') {
				check3 = true;

			}
			else if (pw.charAt(i) >= 33 && pw.charAt(i) <= 126) {
				check4 = true;
			}

		}
		if(!check1) {
		System.out.println("At least 1 Uppercase alphabetic character!!");
		}
		if(!check2) {
			System.out.println("At least 1 lowercase alphabetic character!!");

			
		}
		if(!check3) {
			System.out.println("At least 1 number !!");
			

			
		}
		if(!check4) {
			System.out.println("At least 1 special character!!");

			
		}
		return pw;

	}

}
