package exception;

public class Ex04 {
	public static void main(String[] args) {
		// exceed array size
		int[] numbers = new int[10];
		numbers[0] = 22;
		numbers[10] = 14;
		System.out.println(numbers.toString());
	}
}
