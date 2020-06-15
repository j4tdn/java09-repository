package exercises;

public class Ex06 {
	public static void main(String[] args) {
		int number = 3;
		int count = 1;
		while (count <= 200) {
			if(isPrime(number)) {
				count++;
			} 
			if (count == 200) {
				System.out.println(number);
				break;
			}
			number++;
		}
	}
	public static boolean isPrime(int params) {
		for(int i = 2; i <= Math.sqrt(params); i++) {
			if (params % i == 0) {
				return false;
			}
		}
		return true;
	}
}
