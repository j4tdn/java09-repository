package exercises;

public class Ex04 {
	public static void main(String[] args) {
		int num = 5;
		int a[] = { 1, 3, 5, 7, 9, 2, 4, 6, 8 };

		System.out.println("second odd :  " + secondOdd(a, num));

	}

	public static int secondOdd(int[] a, int n) {
		int max1 = a[0];
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 == 0)
				continue;
			else {
				if (a[i] > max1)
					max1 = a[i];
			}
		}
		int max2 = a[0];
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 == 0)
				continue;
			else {
				if (a[i] < max1 && a[i] > max2)
					max2 = a[i];
			}
		}
		return max2;
	}
}
