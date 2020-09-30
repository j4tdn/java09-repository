package ex03;

public class isPowerOf {

	public static boolean isPowerOf(int a, int b) {

		int min;
		int max;
		min = (a < b) ? a : b;
		max = (a > b) ? a : b;

		if (min == 0 || max == 0)
			return false;

		while (min < max) {

			max = max / min;
		}

		return max == 1;

	}
	public static void main(String[] args) {
		isPowerOf(3, 4);
	}
	
	

}
