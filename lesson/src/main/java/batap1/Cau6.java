package batap1;

public class Cau6 {

	public static boolean isSNT(int n) {

		if (n < 2) {
			return false;
		}
		for (int i = 2; i < (n - 1); i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;

	}

	public static void main(String[] args) {
		int[] n = {};
		int i = 0;
		int dem = 0;

		while (dem <= 200) {

			if (isSNT(i)) {

				if (dem == 200) {

					dem++;
					System.out.println(i);
				} else {
					dem++;
				}

			}
			i++;

		}

	}

}
