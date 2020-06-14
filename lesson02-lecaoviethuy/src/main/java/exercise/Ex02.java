package exercise;

public class Ex02 {
	public static void main(String[] args) {
		long result = factorial(4) + factorial(7) + factorial(12) + factorial(18);
		System.out.println("Kết quả là: " + result);
	}

	private static long factorial(int n) {
		long result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}

		return result;
	}
}
