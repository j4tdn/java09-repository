package main;

public class Ex06 {

	public static void main(String[] args) {
		int count = 0;
		long value = 1;
		while(count < 200) {
			value++;
			if(isPrime(value) == true) {
				count++;	
			}
		}
		System.out.println(value);
	}

	private static boolean isPrime(long value) {
		for(int i = 2; i <= Math.sqrt(value); i++) {
			if((value % i) == 0) return false;
		}
		return true;
	}

}
