package exercises;

public class Ex02 {
	public static void main(String[] args) {
		long result = fatorial(4) + fatorial(7) + fatorial(12) + fatorial(18);
		System.out.println("factorial sum:" + result);

	}

	public static long fatorial(int num) {
		int result = 1;
		if (num < 0) {
			return 0;
		} else {
			for (int i = 1; i <= num; i++) {
				result *= i;
			}

			return result;
		}
	}

}
