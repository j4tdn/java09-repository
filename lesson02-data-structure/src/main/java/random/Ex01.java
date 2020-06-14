package random;

import java.util.Random;

public class Ex01 {
	public static void main(String[] args) throws InterruptedException {
		Random rd = new Random();
		while (true) {
			Thread.sleep(500);
			int number = rd.nextInt(10);
			System.out.println("number:" + number);
		}
	}
}
