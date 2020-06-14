package main;

public class Ex02 {

	public static void main(String[] args) {
		long S = factorial(4) + factorial(7) + factorial(12) + factorial(18);

	}

	private static long factorial(int x) {
		if (x == 1)
			return 1;
		else
			return x * factorial(x - 1);
	}

}
