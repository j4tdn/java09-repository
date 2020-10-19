package ex04;

import java.util.ArrayList;
import java.util.Scanner;

public class ReadingNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhập số n: ");
		int number;
		do {
			try {
				number = Integer.parseInt(input.nextLine());
				if (number >= 0 && number <= 999) {
					break;
				} else {
					System.out.println("yêu cầu: nhiều nhất 3 chữ số -> Nhập lại:");
				}
			} catch (NumberFormatException e) {
				System.out.println("Yêu cầu là 1 số có nhiều nhất 3 chữ số. Nhập lại số n");
			}
		} while (true);
		System.out.println("Cách đọc: " + readNumber(number));
	}

	private static ArrayList<Integer> elements(int number) {
		ArrayList<Integer> elements = new ArrayList<Integer>(0);
		int num = number;
		if (number == 0) {
			elements.add(0);
		} else {
			while (num != 0) {
				int element = num % 10;
				elements.add(element);
				num /= 10;
			}
		}
		return elements;
	}

	private static String readNumber(int number) {
		ArrayList<Integer> elements = elements(number);
		String[] units = { "không ", "một ", "hai ", "ba ", "bốn ", "năm ", "sáu ", "bảy ", "tám ", "chín " };
		String read = "";
		int numberOfElements = elements.size();
		if (numberOfElements == 1) {
			read += units[number];
		} else if (numberOfElements == 2) {
			read += readNumber2(number);
		} else {
			int res3 = elements.get(2);
			int res2 = elements.get(1);
			int res1 = elements.get(0);
			read += units[res3] + "trăm ";
			if (res1 == 0 && res2 == 0) {
				return read;
			}
			if (res2 == 0) {
				read += "lẻ ";
				if (res1 == 1) {
					read += "mốt ";
				} else {
					read += units[res1];
				}
			} else {
				int number2 = res2 * 10 + res1;
				read += readNumber2(number2);
			}
		}
		return read;
	}

	private static String readNumber2(int number) {
		String read = "";
		String[] units = { "không ", "một ", "hai ", "ba ", "bốn ", "năm ", "sáu ", "bảy ", "tám ", "chín " };
		ArrayList<Integer> elements = elements(number);
		int res2 = elements.get(1);
		int res1 = elements.get(0);
		if (res2 == 1) {
			read += "mười ";
			if (res1 == 0) {
				return read;
			} else {
				read += units[res1];
			}
		} else {
			read = read + units[res2] + "mươi ";
			if (res1 == 0) {
				return read;
			}
			if (res1 == 1) {
				read += "mốt ";
			} else if (res1 == 5) {
				read += "lăm ";
			} else {
				read += units[res1];
			}
		}
		return read;
	}
}
