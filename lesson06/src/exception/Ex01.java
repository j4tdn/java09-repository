package exception;


	
	import java.util.Scanner;

	public class Ex01 {
		private static Scanner ip = new Scanner(System.in);

		public static void main(String[] args) {
			System.out.println("Enter number ");

			// \\d: so nguyen [0-9]
			// +1 : 1 hoac nhieu ky tu

			do {
				String s = ip.nextLine();

				if (s.matches("\\d+")) {
					int number = Integer.parseInt(s);
					System.out.println("Value: " + number);
					break;
				}

				else
					System.out.println("Enter number (\\d+)");
			}
			while(true);
		}

	}



