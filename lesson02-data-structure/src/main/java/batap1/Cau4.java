package batap1;

public class Cau4 {

	public static int checkSoLe(int a[]) {
		int max = 0, ans = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[i] > a[max] && a[i] % 2 != 0) {
				ans = max;
				max = i;
			}
		}
		return a[ans];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5, 1, 9, 11, 20, 19, 17, 21, 30 };
		int count = 9;
		System.out.println(checkSoLe(arr));
	}
}
