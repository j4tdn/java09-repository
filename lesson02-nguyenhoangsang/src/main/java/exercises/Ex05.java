package exercises;

public class Ex05 {
	public static void main(String[] args) {
		chuyenCoSo(24);
	}
	public static void chuyenCoSo(int n) {
		int[] arr = new int[15];
		int so = n;
		int i = 0;
		while(true) {
			int temp = n;
			n = n / 2;
			int soDu = temp % 2;
			arr[i] = soDu;

			i++;
			
			if (n == 0) {
				break;
			}

		}
		System.out.print(so + " doi sang he nhi phan la : ");
		for(int j = i-1 ; j >= 0 ; j --) {
			System.out.print(arr[j]);
		}
	}
}