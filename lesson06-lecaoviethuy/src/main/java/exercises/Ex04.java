package exercises;

import java.util.ArrayList;
import java.util.List;

public class Ex04 {
	private static String[] numbers = {"không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
	public static void main(String[] args) {
		int number = 219;
		readNumber(number);
	}

	private static void readNumber(int number) {
		List<Integer> numberChars = new ArrayList<Integer>();
		while(number > 0) {
			numberChars.add(number % 10);
			number /= 10;
		}
		
		StringBuffer numberString = new StringBuffer();
		
		if(numberChars.size() == 3 && numberChars.get(1) == 0) {
			numberString.append(numbers[numberChars.get(2)]).append(" trăm lẻ ").append(numbers[numberChars.get(0)]);
			System.out.println(numberString);
			return;
		}
		
		switch (numberChars.size()) {
		case 1:
			numberString.append(numbers[numberChars.get(0)]);
			break;
			
		case 3:
			numberString.append(numbers[numberChars.get(2)]).append(" trăm ");
		case 2:
			if(numberChars.get(1) == 1) {
				numberString.append("mười ").append(numbers[numberChars.get(0)]);
			} else if(numberChars.get(0) == 1) {
				numberString.append(numbers[numberChars.get(1)]).append(" mươi mốt");
			} else if(numberChars.get(0) == 5) {
				numberString.append(numbers[numberChars.get(1)]).append(" mươi lăm");
			} else if(numberChars.get(0) == 0) {
				numberString.append(numbers[numberChars.get(1)]).append(" mươi");
			} else {
				numberString.append(numbers[numberChars.get(1)]).append(" mươi ").append(numbers[numberChars.get(0)]);
			}
		}
		
		System.out.println(numberString);
	}
}
