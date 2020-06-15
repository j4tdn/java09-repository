package exercises;

public class Bai2 {
	public static void main(String[] args) {
		long gt = 1;
		long sum = 0;
		for (int i = 2; i <= 18; i++) {
			gt *= i;
			if (i == 4 || i == 7 || i == 12 || i == 18) {
				sum += gt;
			}
		}
		System.out.println(+sum);
	}
}
