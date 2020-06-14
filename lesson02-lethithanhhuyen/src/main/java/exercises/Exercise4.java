package exercises;

public class Exercise4 {
	public static void main(String[] args) {
		int[] a = { 5, 1, 9, 11, 20, 19, 17, 21, 30 };
		int max1 = 0, max2 = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 1 && max1 < a[i]) {
				max2 = max1;
				max1 = a[i];
			}
		}
		System.out.println("Số lẻ lớn nhất thứ hai: " + max2);
	}
}
