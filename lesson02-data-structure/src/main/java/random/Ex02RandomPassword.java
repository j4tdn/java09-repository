package random;

import java.util.Random;

public class Ex02RandomPassword {
	private static Random rd = new Random();
	
	public static void main(String[] args) throws InterruptedException {
		int count = 0;
		String[] passwords = new String[1000];
		final String password = "426";
		String textRand = "";
		
		do {
			Thread.sleep(5);
			textRand = "" + rd.nextInt(10) + rd.nextInt(10) + rd.nextInt(10);
			if (contains(passwords, textRand, count)) {
				continue;
			}
			passwords[count++] = textRand;
			System.out.print(textRand + "   ");
			if (count % 13 == 0) {
				System.out.println();
			}
		} while (!password.equals(textRand));
	}

	private static boolean contains(String[] passwords, String textRand, int count) {
		for (int i = 0 ; i < count; i++) {
			if (passwords[i].equals(textRand)) {
				return true;
			}
		}
		return false;
	}
}
