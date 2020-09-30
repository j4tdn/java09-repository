package lesson05;

public class Ex01 {
	static int n = 0;

	public static void main(String[] args) {
		int a[] = { 1, 2, 5, 4, 2, 14, 5, 6, 7, 8 };
		int n = a.length;
		System.out.println(UniqueNumbers(a, n));
	}

	public static void Sort(int a[]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; i < a.length; i++) {
				if (a[i] > a[j]) {
					int tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;

				}
			}
		}
	}

	public static int[] UniqueNumbers(int a[], int n) {
		Sort(a);
		int count = 0;
		int b[] = new int[10];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; i++) {
				if (a[i] == a[j]) {
					count++;
				}
			}

			if (count == 1) {
				b[n] = a[i];
				n++;
			}
		}
		return b;
	}
}
