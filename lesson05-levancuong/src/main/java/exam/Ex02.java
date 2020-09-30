package exam;

public class Ex02 {
	public static void main(String[] args) {
		int[] in = { 1, 4, 5, 6, 2, 3 };
		System.out.println(getMissingNumber(in));

	}

	private static int getMissingNumber(int[] in) {
		int sum = 0;
		for (int i : in) {
			sum += i;
		}
		int sumAll = (in.length + 1) * (in.length + 2) / 2;
		return sumAll - sum;
	}
}
