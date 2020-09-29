package exercises;

public class Ex02 {
	public static void main(String[] args) {
		int arr[] = { 5, 7, 35, 14, 20, 70, 100, 15, 150 };
		int temp;
		int index7 = 0;
		int index5 = arr.length - 1;

		for (int i = 0; i < arr.length; i++) {
			if (i > index5) {
				break;
			}

			if (arr[i] % 7 == 0) {
				if (arr[i] % 5 != 0) {
					temp = arr[index7];
					arr[index7] = arr[i];
					arr[i] = temp;
					index7++;
				}
			} else {

				temp = arr[index5];
				arr[index5] = arr[i];
				arr[i] = temp;
				index5--;
				i--;
			}

		}
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
