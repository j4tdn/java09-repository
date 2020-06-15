package excercise;

public class Ex02 {
//Viết chương trình tính tổng S = 4! +7! + 12! + 18!
	public static void main(String[] args) {
		long result = factorial(4) + factorial(7) + factorial(12) + factorial(18);
		System.out.println(result);
	}

	public static long factorial(int number) {
		if (number == 1) {
			return 1;
		}
		return number * factorial(number - 1);
	}
}
