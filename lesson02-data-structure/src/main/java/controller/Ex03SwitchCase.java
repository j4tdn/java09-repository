package controller;

public class Ex03SwitchCase {
	public static void main(String[] args) {
		System.out.println();
		int month = 7;
		switch(month){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Thang co 31 ngay !");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Thang co 30 ngay");
			break;
		case 2:
			System.out.println("Thang co 29 ngay ");
			break;
		default:
			System.out.println();
			break;
		}
	}
}