package ex03;

public class Ex03 {
	public static void main(String[] args) {
		draw(8);
	}

	public static int triangle(int k, int n) {
		if (k == 0 || k == n) {
			return 1;
		}
		if (k == 1) {
			return n;
		}
		return triangle(k - 1, n - 1) + triangle(k, n - 1);
	}

	public static void draw(int h) {
		for (int i = 1; i < h; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print(triangle(j, i) + "   ");
			}
			System.out.println();
		}
	}
}
