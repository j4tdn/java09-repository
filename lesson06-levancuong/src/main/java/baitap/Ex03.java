package baitap;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String email="";
		do {
			System.out.print("Enter email:");
			email=sc.nextLine();
			try {
				if(!isValidEmail(email)) {
					
				}
				System.out.println("Email hop le:"+email);
				break;
				
			} catch (Exception e) {
				System.err.println(e.getMessage());
				System.out.println("please enter email again!");
				// TODO: handle exception
			}
		}while(true);
	}

	private static boolean isValidEmail(String email) throws EmailException {
		char[] c = email.toCharArray();
		//@ khong o dau va o cuoi, dau cham khong o cuoi
		if (c[0] == '@' || c[c.length - 1] == '@'|| c[c.length - 1] == '.' ) {
			throw new EmailException();
		}
		
		// 1 dau @
		int count=0;
		for(char i :c) {
			if(i=='@') {
				count++;
			}
		}
		if(count!=1) {
			throw new EmailException();
		}
		//khong co khoang trang
		 count=0;
		for(char i :c) {
			if(i==' ') {
				count=1;
			}
		}
		if(count!=0) {
			throw new EmailException();
		}
		

		return true;
	}
}
