package bt;

import java.util.Scanner;
import java.util.regex.Pattern;

public class BT4 {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = 0;
		do {
			try {
				System.out.printf("Nhập n: ");
				n = Integer.parseInt(sc.nextLine());
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (true);
		int[] arr = new int[n];
		for (int i = 0; i<n; i++) {
			arr[i] = Integer.parseInt(input(i+1));
		}
		for (int i = 0; i<n; i++) {
			System.out.println(arr[i] + " : " + readNumber(arr[i]));
		}
	}
	
	private static String input(int i) {
		String INPUT_PATTERN = "[0-9]{1,3}"; //bao gồm các chữ số, tối thiểu 1 ký tự, tối đa 3 ký tự
		System.out.printf("Nhập số thứ " + i +": ");
		String input = sc.nextLine();
		while (!input.matches(INPUT_PATTERN)) {
			System.out.println("Nhập số (0<=x<=999)");
			System.out.printf("Nhập lại số thứ " + i +": ");
			input = sc.nextLine();
		}
		return input;
	}
	
	private static String number(char s) {
		switch (s) {
		case '0':
			return "không"; 
		case '1':
			return "một"; 
		case '2':
			return "hai"; 
		case '3':
			return "ba"; 
		case '4':
			return "bốn"; 
		case '5':
			return "năm"; 
		case '6':
			return "sáu"; 
		case '7':
			return "bảy"; 
		case '8':
			return "tám"; 
		case '9':
			return "chín"; 
		}
		return "";
	}
	
	private static String donVi (char s) {
		switch (s) {
		case '0':
			return "";
		case '1':
			return "mốt";
		case '5':
			return "lăm";
		default:
			return number(s);
		}  
	}
	
	private static String readNumber(int number) {
		String s = Integer.toString(number);
		if (s.length() == 1) {
			return number(s.charAt(0));
		} else if (s.length() == 2) {
			String chuc ="", dv = "";
			if (s.charAt(0) == '1') {
				chuc = "mười ";
			} else {
				chuc = number(s.charAt(0)) + " mươi ";
			}
			return chuc + donVi(s.charAt(1));
		} else if (s.length() == 3) {
			String tram = "", chuc = "", dv = "";
			tram = number(s.charAt(0)) + " trăm ";
			if (s.charAt(1) == '0') {
				chuc = "linh || lẻ ";
				if (s.charAt(2) == '1') {
					return tram + chuc + "một";
				} else if (s.charAt(2) == '5') {
					return tram + chuc + "năm";
				}
			} else if (s.charAt(1) == '1') {
				chuc = "mười ";
				if (s.charAt(2) == '1') {
					return tram + chuc + "một";
				}
			} else {
				chuc = number(s.charAt(1)) + " mươi ";
			}
			dv = donVi(s.charAt(2));
			return tram + chuc + dv;
		}
		return "";
	}
}
