package ex04;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		int number = 0;
		do {
			try {
				System.out.println("Enter number: ");
				Scanner ip = new Scanner(System.in);
				number = Integer.parseInt(ip.nextLine());
				break;
			} catch (NumberFormatException e1) {
				System.out.println(e1.getMessage());
			}
		} while (true);
		readNumber(number);
	}
	private static void readNumber(int number) {
		String[] NUMBERS = {"không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
		int[] numbers = new int [3];
		int count = 0;
		while(number > 0) {
			numbers[count] = number%10;
			number/=10;
			count++;
		}
		switch(count) {
		case 1: 
			System.out.print(NUMBERS[numbers[count]+1]);
			break;
		case 2:
			switch(numbers[1]) {
			case 1:
				System.out.print("mười");
				switch(numbers[0]) {
				case 5: 
					System.out.print(" lăm");
					break;
				default:
					System.out.print(" " + NUMBERS[numbers[0]]);
				}
				break;
			default:
				System.out.print(NUMBERS[numbers[1]] + " mươi ");
				switch(numbers[0]) {
				case 1: 
					System.out.print(" mốt");
					break;
				case 5: 
					System.out.print(" lăm");
					break;
				default:
					System.out.print(" " + NUMBERS[numbers[0]]);
				}
			}		
			break;
		case 3:
			System.out.print(NUMBERS[numbers[2]] + " trăm");
			switch(numbers[1]) {
			case 0:
				switch(numbers[0]) {
				case 0:
					return;
				default:
					System.out.print(" lẻ");
					System.out.print(" " + NUMBERS[numbers[0]]);
					return;	
				}
			case 1:
				System.out.print("mười ");
				System.out.print(" " + NUMBERS[numbers[0]]);
				break;
			default:
				System.out.print(" " + NUMBERS[numbers[1]] + " mươi ");
				switch(numbers[0]) {
				case 1: 
					System.out.print(" mốt");
					break;
				case 5: 
					System.out.print(" lăm");
					break;
				default:
					System.out.print(NUMBERS[numbers[0]]);
				}
			}
		}	
	}
}
