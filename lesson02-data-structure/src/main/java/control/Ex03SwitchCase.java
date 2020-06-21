package control;

public class Ex03SwitchCase {
	public static void main(String[] args) {
		int n= 7;
		int day =31;
		switch (n) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day =31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day =30;
			break;
		case 2:
			day =28;
			break;
		default:
			System.out.println("invalid month");
			break;
		}
		System.out.println("day : " + day);
		
	}

}
