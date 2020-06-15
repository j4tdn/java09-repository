package exercise01;

public class Ex02 {
	public static void main(String[] args) {
		
		long result = giaiThua(4) + giaiThua(7) + giaiThua(12) + giaiThua(18);
		System.out.println("Result :" + result);

	}

	private static long giaiThua(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * giaiThua(n - 1);
	}
}
