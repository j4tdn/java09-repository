package exam;

public class Ex03 {
	public static void main(String[] args) {
		System.out.println(isPowerOf(4, 20));
	}

	private static boolean isPowerOf(int a, int b) {
		int max = a > b ? a : b;
		int min = a + b - max;
		int i = 0;
		int temp = 0;
		int count = 0;
		while (true) {
			temp = (int) Math.pow(min, i);
			if (temp == max) {
				return true;
			}
			if (temp > max) {
				count++;
				break;
			}
			i++;
		}
		if (count == 1) {
			return false;
		}
		return true;
	}
}
