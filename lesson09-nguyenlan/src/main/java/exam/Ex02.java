package exam;

public class Ex02 {
	public static void main(String[] args) {
		String s = "01a2b3456cde478";
		System.out.println(getLargestNumbers(s));
		
	}
	private static int getLargestNumbers(String s) {
		String[] numbers = s.split("[^\\d]+");
		int[] Numbers = new int[numbers.length];
		for(int i = 0; i < numbers.length ; i++) {
			Numbers[i] = Integer.parseInt(numbers[i]);
		}
		int max = Numbers[0];
		for(int i = 1; i < Numbers.length ; i++) {
			if(max < Numbers[i]) {
				max = Numbers[i];
			}
		}
		return max;
	}
}
