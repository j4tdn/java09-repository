package exercises;

public class Bai1 {
	public static void main(String[] args) {
		int a = 6;
		int b = 20;
		int c = 2;
		if (a < b) {
			if (b < c) {
				System.out.println(a + "," + b + "," + c);
			} else if (c > a) {
				System.out.println(a + "," + c + "," + b);
			} else {
				System.out.println(c + "," + a + "," + b);
			}
		}

		else {
			if (a < c) {
				System.out.println(b + "," + a + "," + c);
			} else if (c > b) {
				System.out.println(b + "," + c + "," + a);
			} else {
				System.out.println(c + "," + b + "," + c);
			}
		}
	}
}
