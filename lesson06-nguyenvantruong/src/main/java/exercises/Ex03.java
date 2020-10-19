package exercises;

import java.util.Scanner;

public class Ex03 {
	

		private static Scanner sc = new Scanner(System.in);

		
		
		public static void main(String[] args) {
		String mail=null;
			do {
				try {

					mail = checkEmail();
					break;
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}
			} while (true);
			
				System.out.println("email la: " + mail);
		}

		private static String checkEmail() throws Exception {
			System.out.println("Nhap email: ");
			String mail = " ";
			mail = sc.nextLine();
			

			if (!mail.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
					+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")) {
				throw new Exception();
			}

			return mail;

		}

	
}
