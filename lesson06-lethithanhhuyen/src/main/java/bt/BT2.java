package bt;

import java.util.Scanner;

public class BT2 {
	public static void main(String[] args) throws Exception {
		String password = "";
		do {
			try {
				password = input();
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (true);
	}
	
	private static String input() throws Exception {
		Scanner sc = new Scanner(System.in);
		String s ="";
		System.out.printf("Nhap mat khau: ");
		s = sc.nextLine();
		String err = "";
		if (s.length()<8) {
			err += "Mật khẩu phải có ít nhất 8 ký tự\n";
		}
		if (s.length()>256) {
			err += "Mật khẩu có độ dài tối đa là 256\n";
		}
		boolean kt1 = false, kt2 = false, kt3 = false, kt4 = false;
		for (int i=0; i<s.length(); i++) {
			if (s.charAt(i)>='a' && s.charAt(i)<='z') {
				kt1 = true;
			} else if (s.charAt(i)>='0' && s.charAt(i)<='9') {
				kt2 = true;
			} else if (s.charAt(i)>='A' && s.charAt(i)<='Z') {
				kt3 = true;
			} else if (s.charAt(i)>=33 && s.charAt(i)<=126) {
				kt4 = true;
			}
		}
		if (!kt1) {
			err += "Chuỗi phải có ít nhất một chữ cái thường\n";
		}
		if (!kt2) {
			err += "Chuỗi phải có ít nhất một chữ số\n";
		}
		if (!kt3) {
			err += "Chuỗi phải có ít nhất một chữ cái hoa\n";
		}
		if (!kt4) {
			err += "Chuỗi phải có ít nhất một kí tự đặc biệt\n";
		}
		
		if (err != "") {
			throw new Exception(err);
		}
		return s;
	}

}
