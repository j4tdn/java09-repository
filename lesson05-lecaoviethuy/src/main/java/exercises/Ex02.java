package exercises;

public class Ex02 {
	public static void main(String[] args) {
		int[] numbers = {1, 4, 5, 7, 2, 6};
		
		System.out.println("So con thieu: " + getMissingNumber(numbers));
	}
	
	public static int getMissingNumber(int[] numbers) {
		int n = numbers.length + 1;
		int sum = (n * (n + 1)) / 2;
		int tmpSum = 0;
		
		for(int number : numbers) {
			tmpSum += number;
		}
		return sum - tmpSum;
	}
	
}
