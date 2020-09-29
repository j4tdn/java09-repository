package ex02;

public class Ex02 {
	private static void swap(int i, int j, int[] array) {
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}
	
	public static void main(String[] args) {
		int[] array = {1, 5, 7, 15, 35, 21, 37, 90, 70, 65, 105, 63, 56, 49, 50, 14, 20};
		int begin = 0;
		int end = array.length - 1;

		for(int i = 0; i <= end; i++) {
			if(array[i] % 7 == 0 && array[i] % 5 != 0) {
				swap(begin, i,array);
				begin++;
			} else if(array[i] % 5 == 0 && array[i] % 7 != 0) {
				swap(end, i, array);
				end--;
				i--;
			}
		}

		System.out.println("Chuỗi số mới : các số chỉ hia hết cho 7 ở đầu dãy, chỉ chia hết cho 5 ở cuối dãy.");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "	");
		}
	}
}
