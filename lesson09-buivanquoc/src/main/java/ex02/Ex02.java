package ex02;

public class Ex02 {
	public static void main(String[] args) {
String string="abc53afbbf243fkf2";

print(getLargestNumbers(string));
	}

	private static int[] getLargestNumbers(String string) {
		String[] result = new String[string.length()];
		result = string.split("[a-z]+");
		int[] numbers = new int[string.length() / 2];
		for (int i = 0; i < result.length; i++) {
			numbers[i] = Integer.parseInt("result[i]");
		}
		return numbers;
	}
	private static void print(int [] numbers)
	{
		for (int i=0;i<numbers.length;i++)
		{
			System.out.println(numbers[i]);
		}
	}
}
