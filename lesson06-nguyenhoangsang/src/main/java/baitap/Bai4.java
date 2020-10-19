package baitap;

import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		try {
			System.out.println("Kết quả là : " + readNumber());
		} catch (Exception e) {
			System.out.println("Bạn nhập không đúng !");
		}
	}

	public static String readNumber() throws Exception{
		String result = "";
		String[] arrChar = { "Không", "Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín" };
		String[] arrChar1 = { "Lẻ", "Mốt", "Hai", "Ba", "Bốn", "Lăm", "Sáu", "Bảy", "Tám", "Chín" };

		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập số : ");
		String number = ip.nextLine();

		int length = number.length();

		if (length == 1) {
			result = arrChar[Integer.parseInt(number)];
		}
		if (length == 2) {

			if (Integer.parseInt(number) % 10 == 0) {
				if (Integer.parseInt(number) / 10 == 1) {
					result = "Mười";
				} else {
					result = arrChar[Integer.parseInt(number) / 10] + " mươi ";
				}

			} else {
				String p1 = arrChar[Integer.parseInt(number) / 10] + " mươi ";
				String p2 = arrChar1[Integer.parseInt(number) % 10];
				result = p1 + p2;
			}

		}

		if (number.length() == 3) {
			if (Integer.parseInt(number) % 100 == 0) {
				result = arrChar[Integer.parseInt(number) / 100] + " trăm ";
			} else if (number.charAt(1) == '0') {
				String p1 = arrChar[Integer.parseInt(number) / 100] + " trăm lẻ ";
				String p2 = arrChar1[Integer.parseInt(number) % 10];
				result = p1 + p2;
			} else {
				String numberF = number.substring(1);
//				System.out.println(numberF);
				if (Integer.parseInt(numberF) % 10 == 0) {
					if (Integer.parseInt(numberF) / 10 == 1) {
						result = arrChar[Integer.parseInt(number) / 100] + " trăm " + " mười";
					} else {
						result =arrChar[Integer.parseInt(number) / 100] + " trăm " + arrChar[Integer.parseInt(numberF) / 10] + " mươi ";
					}

				} else {
					String p1 = arrChar[Integer.parseInt(numberF) / 10] + " mươi ";
					String p2 = arrChar1[Integer.parseInt(numberF) % 10];
					result =arrChar[Integer.parseInt(number) / 100] + " trăm "+ p1 + p2;
				}
			}
		}

		return result;
	}
}

//if (length == 3) {
//	String p1 = arrChar[Integer.parseInt(number) / 100] + "Trăm ";
//	String p2 = arrChar[Integer.parseInt(number) / 10] + " mươi ";
//	String p3 = arrChar1[Integer.parseInt(number) % 10];
//	result = p1 + p2 + p3;
//}
