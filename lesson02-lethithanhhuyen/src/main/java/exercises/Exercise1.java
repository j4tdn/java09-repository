package exercises;

public class Exercise1 {
	public static void main(String[] args) {
		int a=7, b=5, c=6;
		if (a>b) {
			int tmp=a;
			a=b;
			b=tmp;
		}
		if (c>b) {
			System.out.println(a + " " + b + " " + c);
		} else if (c>a) {
			System.out.println(a + " " + c + " " + b);
		} else {
			System.out.println(c + " " + a + " " + b);
		}
	}

}
