package exercise;

import java.util.Stack;

public class Ex05 {
	public static void main(String[] args) {
		int decimalNumber = 123;
		int binaryNumber = convertToBinary(decimalNumber);

		System.out.println("Số " + decimalNumber + " chuyển sang hệ nhị phân là: " + binaryNumber);
	}

	private static int convertToBinary(int decimalNumber) {
		int result = 0;

		Stack<Integer> numbers = new Stack<>();
		while (decimalNumber != 0) {
			numbers.push(decimalNumber % 2);
			decimalNumber /= 2;
		}

		while (!numbers.empty()) {
			result = result * 10 + numbers.pop();
		}

		return result;
	}
}
