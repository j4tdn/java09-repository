package exercises;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {

		int number = 0;
		do {
			try {
				System.out.println("Enter number: ");
				number = inputNumber();
				break;
			} catch (NumberFormatException e1) {
				System.out.println(e1.getMessage());
			} catch (Exception e2) {
				System.out.println(e2.getMessage());
			}
		} while (true);
		System.out.println(readNumber(number));
		System.out.println("Done");
	}

	private static int inputNumber() throws Exception {
		Scanner scanner = new Scanner(System.in);
//		String numberStr = scanner.nextLine();
		int number = Integer.parseInt(scanner.nextLine());
		String numberStr = String.valueOf(number);
		if ((number > 0 && numberStr.length() > 3) || (number < 0 && numberStr.length() > 4)) {
			throw new Exception("Phải nhập số tối đa có 3 chữ số");
		}
		

		return number;
	}

	private static String readNumber(int number) {
		String sign = "";
		String numberStr = String.valueOf(number);
		if (number < 0) {
			sign = "âm ";
			numberStr = String.valueOf((-1) * number);
		}
		String numberInWords = sign;
		for (int i = 0; i < numberStr.length(); i++) {
			numberInWords += doNumberInWords(numberStr.charAt(i), numberStr.length() - i, numberStr.length()) + " ";
		}
		int length = numberStr.length();
		if(length > 1 && numberStr.charAt(length-1)=='1' && 
				(numberStr.charAt(length-2)=='0' || numberStr.charAt(length-2)=='1')) {
			numberInWords = numberInWords.replaceFirst("mốt", "một");
			System.out.println("a");
		}
		return numberInWords;
	}

	private static String doNumberInWords(char number, int n, int size) {
		String sign = "";
		if (n == 3) {
			sign = "trăm";
		}
		if (n == 2) {
			sign = "mươi";
		}
		switch (number) {
		case '0':
			if(n == 2) {
				return "lẻ";
			}
			return "";
		case '1':
			if (n == 3) {
				return "một " + sign;
			}
			if (n == 2) {
				return "mười";
			}
			if (size == 1 && n == 1) {
				return "một";
			}
			return "mốt " + sign;
		case '2':
			return "hai " + sign;
		case '3':
			return "ba " + sign;
		case '4':
			return "bốn " + sign;
		case '5':
			if (n == 1 && size > 1) {
				return "lăm";
			}
			return "năm " + sign;
		case '6':
			return "sáu " + sign;
		case '7':
			return "bảy " + sign;
		case '8':
			return "tám " + sign;
		case '9':
			return "chín " + sign;
		default:
			break;
		}
		return "";
	}

}
