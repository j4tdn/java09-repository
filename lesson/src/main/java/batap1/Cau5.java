package batap1;

public class Cau5 {
	public static void main(String[] args) {
		int n = 40;
		int du;

		while (n > 0) {

			du = n % 2;
			n = n / 2;
			System.out.print(du);
		}

	}

}