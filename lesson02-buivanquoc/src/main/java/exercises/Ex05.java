package exercises;

public class Ex05 {
	public static void main(String[] args) {
		int[] a = new int[10];
		int num = 10;
		convert(a, num);
	}

	public static void convert(int[] a, int num) {
		int count = 0;
		do {
			a[count] = num % 2;
			count++;
			num /= 2;
		} while (num != 0);

		for (int j = count - 1; j >= 0; j--) {
			System.out.println(a[j] + " ");
		}
	}

}
