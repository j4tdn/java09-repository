package controller;

public class Ex03SwitchCase {
	public static void main(String[] args) {
		int month = 2;
		int days = 31;
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			break;
		case 2:
			days = 28;
			break;
		case 4:
		case 6:	
		case 9:	
		case 11:	
			days = 30;
			break;
		default:
			days = 0;
			break;
		}
		if (days != 0) {
			System.out.println(days);
		}
		else {
			System.out.println("Invalid month");
		}
	}
}
