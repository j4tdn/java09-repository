package baitap;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		do {
			try {
				inputEmail();
				break;
			} catch (InvalidEmailException e) {
				System.out.println(e.getMessage());
			}	
		} while (true);
		
	}
	public static void inputEmail() throws InvalidEmailException {
		Scanner ip = new Scanner(System.in);
		System.out.print("Moi nhap email: ");
		String email = ip.nextLine();
		if (!email.matches("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+")) {
			throw new InvalidEmailException("Email nhập sai!!");
		}
		System.out.println("Email bạn nhập thành công !!");
	}
}
