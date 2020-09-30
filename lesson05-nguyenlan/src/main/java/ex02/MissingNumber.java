package ex02;

public class MissingNumber {
	public static int getMissingNumber(int a[], int n) {
		int result = 0;
		int tmp = 0;
		for(int i = 1; i < a.length + 1 ; i++ ) {
			for(int j = 0; j < a.length; j++) {
				if(i == a[j]) {
					tmp = 1;
				}
			}
			if(tmp == 0) {
				result = i;
			} else {
				tmp = 0;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int a[] = {1, 2 , 4, 5, 6};
		System.out.println(getMissingNumber(a, 6));
		
	}
}
