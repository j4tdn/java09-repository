package ex3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex03 {
	private static String nhapMail() throws MailCheckingException {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Hãy nhập Mail Adress: ");
	    String mail = null;
	    try {
	        mail = sc.nextLine();
	        
	        boolean f= true;
            String usernamePattern = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
            f = mail.matches(usernamePattern);

            if (!f) throw new MailCheckingException("Email không hợp lệ");
	    } catch (InputMismatchException e) {
	    }
	    return mail;
	}
	
	public static void main(String[] args) {
	    try {
	        String mail = nhapMail();
	        System.out.println("Mail đã nhập: " + mail);
	    } catch (MailCheckingException e) {
	        System.out.println(e.getMessage());
	    }
	}

}
