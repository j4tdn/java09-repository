package excercises;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		while (true) {
			try {
				System.out.print("Enter the number:");
				String readNumber = readNumber();
				System.out.println(readNumber);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	private static String readNumber() throws Exception {
		Scanner ip = new Scanner(System.in);
		int a = Integer.parseInt(ip.nextLine());
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (a == 0) {
			list.add(a);
		}
		while (a != 0) {
			list.add(a % 10);
			a = a / 10;
		}
		if (list.size() > 3) {
			throw new Exception("Number has more than 3 character");
		}
		Collections.reverse(list);
		String result = "";
		for (int i = 0; i < list.size(); i++) {
			int pos = 3 - list.size() + i;
			switch (list.get(i)) {
			case 0:
				if (pos == 1) {
					result += "lẻ ";
				}
				if (list.size() == 1) {
					result += "không";
				}
				break;
			case 1:
				if (pos == 0) {
					result += "một trăm ";
				}
				if (pos == 1) {
					result += "mười ";
				}
				if (pos == 2) {
					if (list.size() == 1) {
						result += "một";
					} else {
						if (list.get(pos - 3 + list.size() -1) == 1 || list.get(pos - 3 + list.size() -1) == 0) {
							result += "một ";
						} else {
							result += "mốt ";
						}
					}

				}
				break;
			case 2:
				result += "hai ";
				if (pos == 0) {
					result += "trăm ";
				}
				if (pos == 1) {
					result += "mươi ";
				}
				break;
			case 3:
				result += "ba ";
				if (pos == 0) {
					result += "trăm ";
				}
				if (pos == 1) {
					result += "mươi ";
				}
				break;
			case 4:
				result += "bốn ";
				if (pos == 0) {
					result += "trăm ";
				}
				if (pos == 1) {
					result += "mươi ";
				}
				break;
			case 5:
				if (pos == 2) {
					if (list.size() == 1) {
						result += "năm";
					} else {
						result += "lăm ";
					}
				}
				if (pos == 0) {
					result += "năm trăm ";
				}
				if (pos == 1) {
					result += "năm mươi ";
				}
				break;
			case 6:
				result += "sáu ";
				if (pos == 0) {
					result += "trăm ";
				}
				if (pos == 1) {
					result += "mươi ";
				}
				break;
			case 7:
				result += "bảy ";
				if (pos == 0) {
					result += "trăm ";
				}
				if (pos == 1) {
					result += "mươi ";
				}
				break;
			case 8:
				result += "tám ";
				if (pos == 0) {
					result += "trăm ";
				}
				if (pos == 1) {
					result += "mươi ";
				}
				break;
			case 9:
				result += "chín ";
				if (pos == 0) {
					result += "trăm ";
				}
				if (pos == 1) {
					result += "mươi ";
				}
				break;
			}
		}
		return result.trim();
	}
}