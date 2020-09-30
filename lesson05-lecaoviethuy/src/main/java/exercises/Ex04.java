package exercises;

public class Ex04 {
	public static void main(String[] args) {
		long[] numbers = {4, 3, 5};
		
		long result = 1;
		for(long number : numbers) {
			result = getLCM(result, number);
		}
		
		System.out.println("Boi chung nho nhat cua day so la: " + result);
	}
	
	public static long getLCM(long a, long b) {
		long mul = a * b;
		while(b > 0) {
			long tmp = b;
			b = a % b;
			a = tmp;
		}
		
		return mul / a;
	}
}
