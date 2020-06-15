package excercise;

public class Ex04 {
//Viết chương trình nhập vào một dãy các số nguyên từ bàn phím.
//	Tìm số lẻ lớn nhất thứ hai trong dãy số và in ra.
	public static void main(String[] args) {
		int[] numbers = { 5, 1, 9, 11, 20, 19, 17, 21, 30 };
		// sort
		for (int i = 0; i < numbers.length; i++) {
			for (int j = numbers.length - 1; j > i; j--) {
				if (numbers[j] > numbers[i]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}

		// find second odd number

		int count = 0;
		int i = 0;
		while (count < 2 && i < numbers.length) {
			if (numbers[i] % 2 != 0) {
				count++;
			}
			i++;
		}

		if (i > numbers.length || count == 0) {
			System.out.println("Không tồn tại số lẻ");
		} else {
			if (count == 2) {
				System.out.println("Số lẻ thứ 2: " + numbers[i - 1]);
			} else {
				System.out.println("Mảng chỉ có 1 số lẻ duy nhất");
			}
		}
	}
}
