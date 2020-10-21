package ex3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex02 {
	
	private static String passWord() throws CheckPass {
	    Scanner sc = new Scanner(System.in);
	    boolean f= true;
	    String pass = null;
	    System.out.print("Hãy nhập mật khẩu: ");
	    
	    try {
	       pass = sc.nextLine();
	       char s[] = pass.toCharArray();
	       
	       
	        if (s.length < 8) {
	        	f=false;
	        	throw new CheckPass("mật khẩu có độ dài lớn hơn 8.");
	        }
	        
	        if (s.length > 256) {
	        	f=false;
	        	throw new CheckPass("mật khẩu có độ dài nhỏ hơn 256.");
	        }
	        
	        f= false;
	        for (int i = 0; i< s.length; i++) {
	        	for (char a= 'a'; a <= 'z'; a++) {
	        		if (s[i] == a) {
	        			f=true;
	        			break;
	        		}
	        	}
	        }
	        if (f == false) throw new CheckPass("mật khẩu có it nhất 1 ký tự chữ cái thường");
	        
	        f= false;
	        for (int i = 0; i< s.length; i++) {
	        	for (char a= 'A'; a <= 'Z'; a++) {
	        		if (s[i] == a) {
	        			f=true;
	        			break;
	        		}
	        	}
	        }
	        if (f == false) throw new CheckPass("mật khẩu có it nhất 1 ký tự chữ cái hoa");
	        
	        f= false;
	        for (int i = 0; i< s.length; i++) {
	        	for (int a= 0; a <= 9; a++) {
	        		if (s[i] - 0x30 == a) {
	        			f=true;
	        			break;
	        		}
	        	}
	        }
	        if (f == false) throw new CheckPass("mật khẩu có it nhất 1 ký tự số");
	        
	        f= false;
	            String usernamePattern = "\\w+";
	            f = pass.matches(usernamePattern);

	            if (f) throw new CheckPass("mật khẩu có it nhất 1 ký tự đặc biệt");

	        
	    } catch (InputMismatchException e) {
	    }
	    return pass ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
	        String pass = passWord();
	        System.out.println("password đã nhập : " + pass);
	    } catch (CheckPass e) {
	        System.out.println(e.getMessage());
	    }
	}

}
