
package exception;

import java.util.Scanner;

public class Ex02 {
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
				
		//s đọc các kí tự từ 0 đến 9, ít nhất 1 kí tự và tối đa 5 kí tự
		// s.matches("\\d+") s chỉ đọc các kí tự chỉ gồm toàn số nguyên
		System.out.println("Enter number: ");
		int number = 0;
		do {
			try {
				number = Integer.parseInt(ip.nextLine());	
				break;
			} catch (NumberFormatException e) {
				//e.printStackTrace();
				System.out.println(e.getMessage());
				//System.out.println("Invalid number!!!!!!!");				
			}		
		}while(true);
		System.out.println("Value: " + number);
	}
}
