package random;

import java.util.Random;

public class Ex01 {
	public static void main(String[] args) {
		Random rd = new Random();
		int number = rd.nextInt();
		System.out.println("number: " + number);
	}
}
