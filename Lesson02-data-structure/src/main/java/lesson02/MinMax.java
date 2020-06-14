package lesson02;

public class MinMax {
	public static void main(String[] args) {
		int a = 10, b = 9, c = 9;
		System.out.println(
				"thu tu tang dan lien tiep cua 3 so: " + min(a, b, c) + " " + middle(a, b, c) + " " + max(a, b, c));

	}

	public static int max(int a, int b, int c) {
		int tmp;
		if (a >= b && a >= c)
			tmp = a;
		else if (b >= a && b >= c)
			tmp = b;
		else
			tmp = c;
		return tmp;
	}

	public static int min(int a, int b, int c) {
		int tmp;
		if (a <= b && a <= c)
			tmp = a;
		else if (b <= a && b <= c)
			tmp = b;
		else
			tmp = c;
		return tmp;
	}

	public static int middle(int a, int b, int c) {
		int tmp;
		if (a >= b && a <= c)
			tmp = a;
		else if (b >= a && b <= c)
			tmp = b;
		else
			tmp = c;
		return tmp;
	}

}
