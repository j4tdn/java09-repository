package exercises;

public class Ex01 {
	public static void main(String[] args) {
		int a = 2;
		int b = 2;
		int c = 5;
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
		System.out.println("Day so tang dan: " + a +" "+ b +" "+ c);
	}
}
