package excercise;

public class Ex06 {
//Viết chương trình tìm số nguyên tố thứ 200 trong hệ thống số tự nhiên.
	public static void main(String[] args) {
		int count = 0;
		int i = 1;
		while (count < 200) {
			if (isPrime(i)) {
				count++;
			}
			i++;
		}
		System.out.println(--i);
	}

	public static boolean isPrime(int number) {
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return number > 1;
	}

}
