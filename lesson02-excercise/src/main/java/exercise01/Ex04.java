package exercise01;

public class Ex04 {

	public static void main(String[] args) {
		int[] a = { 5, 1, 9, 11, 20, 19, 17, 21, 30 };
		int maxOdd = findMaxOdd(a);
		int maxSecondOdd = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0 && maxSecondOdd == 0) {
				maxSecondOdd = a[i];
				continue;
			}
			if (a[i] % 2 == 1 && a[i] != maxOdd) {
				if (a[i] > maxSecondOdd) {
					maxSecondOdd = a[i];
				}
			}
		}

		System.out.println("Value max second in array :" + maxSecondOdd);

	}

	private static int findMaxOdd(int[] a) {
		int maxOdd = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 1 && maxOdd == 0) {
				maxOdd = a[i];
				continue;
			}
			if (a[i] % 2 == 1) {
				if (a[i] > maxOdd) {
					maxOdd = a[i];
				}
			}
		}
		return maxOdd;
	}

}
