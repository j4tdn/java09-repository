package baitap;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		System.out.print("Nhap so luong so:");
		n = Integer.parseInt(sc.nextLine());
		int number;
		for (int i = 0; i < n; i++) {
			System.out.print("enter number:");
			number = Integer.parseInt(sc.nextLine());

			if ((number + "").length() == 1) {
				System.out.println(readOneNumber(number));
			}
			if ((number + "").length() == 2) {
				System.out.println(readTwoNumber(number));
			}
			if ((number + "").length() == 3) {
				System.out.println(readThreeNumber(number));
			}
		}

	}

	private static String readOneNumber(int number) {
		String result = "";
		switch (number) {
		case 0:
			result = "Không";
			break;
		case 1:
			result = "Một";
			break;
		case 2:
			result = "Hai";
			break;
		case 3:
			result = "Ba";
			break;
		case 4:
			result = "Bốn";
			break;
		case 5:
			result = "Năm";
			break;
		case 6:
			result = "Sáu";
			break;
		case 7:
			result = "Bảy";
			break;
		case 8:
			result = "Tám";
			break;
		case 9:
			result = "Chín";
			break;
		}
		return result;

	}

	private static String readTwoNumber(int number) {
		String num = number + "";
		char[] c = num.toCharArray();
		String result = "";
		switch (Integer.parseInt(c[0] + "")) {
		case 1:
			result = "Mười";
			break;
		case 2:
			result = "Hai";
			break;
		case 3:
			result = "Ba";
			break;
		case 4:
			result = "Bốn";
			break;
		case 5:
			result = "Năm";
			break;
		case 6:
			result = "Sáu";
			break;
		case 7:
			result = "Bảy";
			break;
		case 8:
			result = "Tám";
			break;
		case 9:
			result = "Chín";
			break;
		}
		String consequence = readOneNumber(Integer.parseInt(c[1] + ""));

		if (consequence.equals("Năm")) {
			consequence = "Lăm";
		}
		if ((consequence.equals("Không"))) {
			consequence = "";
		}

		String res = "";
		if (c[0] == '1') {

			res = result + " " + consequence;
		} else {
			if ((consequence.equals("Một"))) {
				consequence = "Mốt";
			}
			res = result + " Mươi " + consequence;
		}

		return res;

	}

	private static String readThreeNumber(int number) {
		String num = number + "";
		char[] c = num.toCharArray();
		String result = "";
		String t0 = readOneNumber(Integer.parseInt(c[0] + ""));
		String t1;
		if (c[1] == '0') {
			if (c[2] == '0') {
				t1 = "";
			} else {
				t1 = "Linh " + readOneNumber(Integer.parseInt(c[2] + ""));
			}
		} else {
			t1 = readTwoNumber(Integer.parseInt(num.substring(1, 3)));
		}

		result = t0 + " Trăm " + t1;
		return result;
	}
}
