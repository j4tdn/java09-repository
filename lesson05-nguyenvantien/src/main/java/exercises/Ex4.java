package exercises;

public class Ex4 {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 3 };
		System.out.println(getLeastCommonMultiple(arr));
	}

	private static int getLeastCommonMultiple(int[] arr) {
		int result = arr[0];
		for (int i = 1; i < arr.length; i++) {
			result = BCNN(result, arr[i]);
		}
		return result;
	}

	private static int BCNN(int result, int i) {
		// TODO Auto-generated method stub
		return (result * i) / UCLN(result, i);
	}

	private static int UCLN(int result, int i) {
		if (i == 0) {
			return result;
		}
		return UCLN(i, result % i);
	}

}
