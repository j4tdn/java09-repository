package exercises;

public class Ex3 {
	public static void main(String[] args) {
		System.out.println(isPowerOf(9,2));
	}

	private static boolean isPowerOf(int a, int b) {
		int i = 0;
		long result;
		while(true) {
			result = (long) Math.pow(b,i);
			if(result == a) {
				return true;
			}else if(result > a) {
				return false;
			}
			i++;
		}
	}
}
