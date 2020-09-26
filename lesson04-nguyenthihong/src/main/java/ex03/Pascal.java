package ex03;

public class Pascal {
	public static void main(String[] args) {
		Pascal demo = new Pascal();
		demo.draw(4);
	}

	public int combination(int k, int n) {
		if (k == 0 || k == n) {
			return 1;
		}
		if (k == 1) {
			return n;
		}
		return combination(k - 1, n - 1) + combination(k, n - 1);
	}

	public void draw(int h) {
		for (int i = 1; i < h; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print(combination(j, i) + "   ");
			}
			System.out.println();
		}
	}

}
