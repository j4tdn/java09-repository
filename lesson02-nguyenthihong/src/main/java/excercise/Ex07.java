package excercise;

import java.util.Random;

public class Ex07 {
//Viết chương trình random 5 số nguyên ngẫu nhiên không trùng nhau từ 20 – 30.
	public static void main(String[] args) {
		Random rand = new Random();
		int[] numbers = new int[5];
		int lenght = 0;
		while (lenght < 5) {
			int num = 20 + rand.nextInt(11);
			if (!isDuplicate(numbers, num, lenght)) {
				System.out.println(num);
				numbers[lenght] = num;
				lenght++;
			}
		}
		for (int num : numbers) {
			System.out.print(num + " ");
		}
	}

	public static boolean isDuplicate(int[] array, int num, int lenght) {
		for (int i = 0; i <= lenght; i++) {
			if (num == array[i]) {
				return true;
			}
		}
		return false;
	}
}
