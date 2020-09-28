package ex02;

public class Ex02 {
	public static void main(String[] args) {
		int[] ranges = { 7, 35, 70, 5, 20,50,50,50,50, 7, 14, 28,7,21,17,14,35,35,70 };
		int first = 0;
		int last = ranges.length - 1;
		int mid = ranges.length / 2;

		for (int i = 0; i <= last; i++) {

			if (ranges[i] % 7 == 0 && ranges[i] % 5 != 0) {
//				System.out.print("nhom 7" + ranges[i] + ",");
				swap(first, i, ranges);
				first++;
			} else if (ranges[i] % 5 == 0 && ranges[i] % 7 != 0) {
//				System.out.print("nhom 5" + ranges[i] + ",");
				swap(last, i, ranges);
				last--;
				i--;
			}

		}
		for (int i = 0; i <= last; i++) {
			if (ranges[i] % 7 == 0 && ranges[i] % 5 == 0) {
//				System.out.println("mid" + mid);
				swap(mid, i, ranges);
			}
		}
		System.out.println();
		System.out.println("Chuoi sau khi xu ly:");
		for (int i = 0; i < ranges.length; i++) {
			System.out.print( ranges[i]+"-");
		}
	}

	private static void swap(int j, int i, int[] ranges) {
		int tmp = ranges[j];
		ranges[j] = ranges[i];
		ranges[i] = tmp;
	}
}
