package ex02;

public class Bai02 {
	
	private static void swap(int i, int j, int[] A) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}
	
	public static void main(String[] args) {
		int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 30, 31, 32, 33, 34, 35, 36};
		int begin = 0;
		int end = A.length - 1;

	
		
		for(int i = 0; i <= end; i++) {
			if(A[i] % 7 == 0 && A[i] % 5 != 0) {
				swap(begin, i,A);
				begin++;
			} 
			else if(A[i] % 5 == 0 && A[i] % 7 != 0) {
				swap(end, i, A);
				end--;
				i--;
			}
		}

		System.out.println("Chuoi sau khi xu ly: ");
		for(int i = 0; i < A.length; i++) {
			System.out.print(A[i] + "	");
		}
	
	}
}
