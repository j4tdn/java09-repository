package exercises;

public class Ex04 {
	public static void main(String[] args) {
		int[] array = {5, 1, 9, 11, 21, 19, 17, 27, 29};
		int result = isOdd(array);
		System.out.println(result);
	}
	public static int isOdd(int[] arrayNumber) {
		int max = 0;
		int result = 0;
		int tmp = 0;
		for(int i = 0;i <arrayNumber.length;i++) {
			if (arrayNumber[i] % 2 != 0 && arrayNumber[i] > result) {
				result = arrayNumber[i];
			}
			if ( result > max) {
				tmp = max;
				max = result;
				result =tmp;
			}
		}
		return result;
	}
}
