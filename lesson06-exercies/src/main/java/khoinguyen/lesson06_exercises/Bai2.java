package khoinguyen.lesson06_exercises;

import java.util.Scanner;

public class Bai2 {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		String matkhau = null;
		while (true) {
			try {
				matkhau = inputPassword();
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		System.out.println("Mật khẩu của bạn là: " + matkhau);

	}

	private static String inputPassword() throws Exception {
		System.out.print("nhập nật khẩu: ");
		String matkhau = ip.nextLine();
		if (matkhau.length() < 8 || matkhau.length() > 256) {
			throw new Exception("Password 8->256");
		}
		if (!matkhau.matches(".*[a-z]+.*")) {
			throw new Exception("Phải có ít nhất 1 chữ viết thường");
		}
		if (!matkhau.matches(".*[A-Z]+.*")) {
			throw new Exception("Phải có ít nhất 1 chữ viết hoa");
		}
		if (!matkhau.matches(".*\\d.*")) {
			throw new Exception("Phải có ít nhất 1 chữ số");
		}
		if (!matkhau.matches(".*[~!@#$%^&*()_+-=[]\\{}|;':\",.//<>?]]+.*")) {
			throw new Exception(" Phải có ít nhất 1 ký tự đặc biệt");
		}


		return matkhau;
	}
}