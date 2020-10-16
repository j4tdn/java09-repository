package bt;

import java.util.Scanner;
import java.util.regex.Pattern;

public class BT3 {
	public static void main(String[] args) {
		do {
			try {
				String email = input();
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}while(true);
	}
	
	private static String input() throws EmailException {
		Scanner sc = new Scanner(System.in);
		
		String EMAIL_PATTERN = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]{2,}|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
		// ^[a-zA-Z] bắt đầu bằng chữ cái
		// [\\w-]+ tên chỉ chứa chữ cái, chữ số hoặc dấu gạch ngang
		// ký tự @ ở giữa
		// sau @ là tên miền có dạng domain.x.y hoặc domain.x với x,y >= 2 ký tự
		
		String email = "";
		System.out.println("Nhập email: ");
		email = sc.nextLine();
		
		if (!email.matches(EMAIL_PATTERN)) {
			throw new EmailException();
		}
		
		return email;
	}
}
