package exercises;

public class Ex01 {
	public static void main(String[] args) {
		int a = 9, b = 10, c = 9;
		test(a, b, c);

	}

	public static void test(int a, int b, int c) {
		int tmp;
		if (a > b) {
			tmp = a;
			a = b;
			b = tmp;
		}

		if (a > c) {
			tmp = a;
			a = c;
			c = tmp;
		}

		if (b > c) {
			tmp = b;
			b = c;
			c = tmp;
		}
		System.out.printf("a=" + a + "  b=" + b + "  c=" + c);
	}
}
