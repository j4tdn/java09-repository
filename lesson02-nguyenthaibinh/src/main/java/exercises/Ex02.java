package exercises;

public class Ex02 {
	public static void main(String[] args) {
		long result = factorial(4) + factorial(7) + factorial(12) + factorial(18);
		System.out.println("Tong : " + result);
	}

	public static long factorial(int params) {
		if (params == 1) {
			return 1;
		}
		return params * factorial(params - 1);
	}

}
