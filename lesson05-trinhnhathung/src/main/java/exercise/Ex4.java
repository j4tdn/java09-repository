package exercise;

public class Ex4 {
	public static void main(String[] args) {
		int [] arr = {2,6,4};
		 System.out.println(getLeastCommon(arr));
	}

	public static int greatestCommonDivisor(int a, int b) {
		if (a == 0 || b == 0) {
			return a + b;
		}
		while (a != b) {
			if (a > b) {
				a -= b; 
			} else {
				b -= a;
			}
		}
		return a;
	}

	public static int getLeastCommon(int arr[]) {
		int x = arr[0];
		for (int a : arr ) {
			int y = greatestCommonDivisor(x, a);
			x = (x * a) /y; 
		}
		return x;
	}
}
