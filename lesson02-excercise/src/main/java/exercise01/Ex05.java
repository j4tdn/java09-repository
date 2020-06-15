package exercise01;

public class Ex05 {
	public static void main(String[] args) {
		int n = 0;
		System.out.println("result binary:" + convertDecimalToBinary(n));

	}

	private static String convertDecimalToBinary(int n) {
		if (n == 0) {
			return 0 + "";
		}
		String s = "", result = "";
		int temp = 0;
		while (n != 0) {
			temp = n % 2;
			n /= 2;
			s += temp;
		}

		char[] c = s.toCharArray();
		for (int i = c.length - 1; i >= 0; i--) {
			result += c[i];
		}
		return result;
	}
}
