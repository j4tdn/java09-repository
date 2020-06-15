package baophuoc.lesson02_baophuoc;

public class bai1 {
	public static void main(String[] args) {
		int[] a = { 9, 5, 8 };
		for (int i=0; i<= a.length; i++) {
			for (int j= i+1; j< a.length; j++) {
				if (a[i] > a[j]) {
					a[i] = a[i] + a[j];
					a[j] = a[i] - a[j];
					a[i] = a[i] - a[j];
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println("      " + a[i]);
		}

	}
}
