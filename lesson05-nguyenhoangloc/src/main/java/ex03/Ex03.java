package ex03;

public class Ex03 {
	public static void main(String[] args) {
		System.out.println(isPowerOf(8, 4));

	}

	private static boolean isPowerOf(int a, int b) {
		int number = 1;
		for (int i = 1; i <= a; i++) {
			number *= b;
			if (number == a) {
				return true;
			}
		}
		return false;
	}
}
