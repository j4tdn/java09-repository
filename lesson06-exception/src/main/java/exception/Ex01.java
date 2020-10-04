package exception;

import java.util.Scanner;

public class Ex01 {
	private static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
//		while(true){
//			try {
//				System.out.print("Nhap 1 so :");
//				int number = Integer.parseInt(ip.nextLine());
//				System.out.println("Value: " + number);
//				break;
//			} catch (Exception e) {
//				System.out.println("Invalid number");
//			}
//		}
		
		do {
			System.out.print("Nhap 1 so :");
			String s = ip.nextLine();
			if (s.matches("\\d{1,}")){
				int number = Integer.parseInt(s);
				System.out.println("Value :" + number);
				break;
			} 

			System.out.println("Nhap lai!");
		} while(true);
		

	}
}
