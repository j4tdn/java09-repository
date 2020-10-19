package exercises;

import java.util.Scanner;

public class Ex02 {
	static Scanner ip = new Scanner(System.in);

		public static void main(String[] args) {
			String passw = null;
			do {
				
				try {
					passw=password();
					break;
				} catch (Exception e) {
					// TODO: handle exception
				System.out.println(e.getMessage());
				}
			} while (true);
			System.out.println("mat khau la "+passw);
		}
		
		
		public static String password () throws Exception {
			System.out.println("nhap mat khau: ");
			String pw=ip.nextLine();
			
			if(pw.length() < 8 || pw.length()>256) {
				throw new Exception("k dc nho hon 8 va lon hon 256");
				
			}
			if(!checkLower(pw)) {
				throw new Exception("co 1 chu cai thuong thuong");
			}
			if(!checkNumbers(pw)) {
				throw new Exception("phai co 1 so trong mat khau");
			}
			if(!checkUpper(pw)) {
				throw new Exception("phai co 1 chu in hoa trong mat khau");
			}
		//	if(pw.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\\\d).+$")) {
		//		throw new Exception("at least 1 lowercase alphabetic character");
		//	}
			if(!checkSpecial(pw)) {
				throw new Exception("phai co 1 ky tu dac biet trong mat khau");
			}
			return pw;
		}
			//if(pw.matches(".*[a-z]+.*")) {
			//	throw new Exception("at least 1 lowercase alphabetic character");
				
		//	}
		
			
		//	}
			
			
		
		public static boolean checkLower(String pass) {
			
			for (int i = 0; i < pass.length()  ; i++) {
				if(pass.charAt(i) >= 'a'  && pass.charAt(i) <= 'z'){
					
					return true;
				}
			
			}
			return false;
		}
		
		public static boolean checkNumbers(String pass) {
			
			for (int i = 0; i < pass.length()  ; i++) {
				if(pass.charAt(i)>='0' && pass.charAt(i)<='9') {
					return true;
				}
			}
			return false;
		
}
		
		public static boolean checkUpper(String pass) {
			
			for (int i = 0; i < pass.length()  ; i++) {
				if(pass.charAt(i)>='A' && pass.charAt(i)<='Z') {
					return true;
				}
			}
			return false;
}
public static boolean checkSpecial(String pass) {
			
			for (int i = 0; i < pass.length()  ; i++) {
				if(pass.charAt(i)>= 33 && pass.charAt(i)<= 126) {
					return true;
				}
			}
			return false;
		
		
}
}