
package exception;

import java.util.Scanner;

public class Ex01 {
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
				
		//s đọc các kí tự từ 0 đến 9, ít nhất 1 kí tự và tối đa 5 kí tự
		// s.matches("\\d+") s chỉ đọc các kí tự chỉ gồm toàn số nguyên
		
		
		/*while(true) {
			System.out.println("Enter number: ");
			String s = ip.nextLine();
			if(s.matches("[0-9]{1,5}")) {
				int number = Integer.parseInt(s);
				System.out.println("value: " + number);
				break;
			} else {
				System.out.println("Invalid number");
			}
			
		}*/
		String s;
		do {
			System.out.println("Enter number: ");
			s = ip.nextLine();
			if(s.matches("[0-9]{1,5}")) {
				int number = Integer.parseInt(s);
				System.out.println("value: " + number);
				break;
			} else {
				System.out.println("Invalid number");
			}
		}while(true);
		//int number = Integer.parseInt(ip.nextLine());		
		//System.out.println("Value: " + number);
	}
}
