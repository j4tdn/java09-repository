package exercise01;

public class UniqueNumber {
	public static void main(String[] args) {
		int n = 7;
		int max = 1;
		int[] A = { 3, 15, 21, 0, 15, 17, 21 };
		demphantu(A, n);
		
		
		
		

	}

	public static int demphantu(int A[], int n) {
		int tmp = 0;
		for (int i = 0; i < n; i++) {
			for(int j=0;j<n ; j++) {
			if (A[i] == A[i + 1]) {
				tmp++;
			}

		}
		}
		return tmp;
	}
}
