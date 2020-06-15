package lesson02_Exercise;


public class Ex05 {

	public static void main(String[] args) {
		
		int a = 20;
		int b;
		int sum = 0;
		int i = 1;
		do {
			b = a % 2;
			sum = sum + (i * b);
			a = a / 2;
			i = i * 10;
		} while (a > 0);
		System.out.println(+sum);
	}
}
