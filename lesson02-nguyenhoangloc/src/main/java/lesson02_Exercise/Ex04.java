package lesson02_Exercise;


public class Ex04 {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7};
		int n=6;
		sapXep(a, n);

		int dem = 0;
		int i = 0;
		while (dem < 2) {
			if (a[i] % 2 != 0) {
				dem++;
				i++;
			} else {
				i++;

			}
		}
		System.out.println(a[i-1]);

	}

	public static void sapXep(int[] a, int n) {
		int temp;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j <= n - i - 1; j++) {
				if (a[j] < a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
				//n=5
				//chay vong for n=4
				//chay vong for n-i-1
				//
				
				//
				//
				
				
				
						
			}
		}

	}
}
