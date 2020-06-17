package random;

import java.util.Random;

public class Ex02RandomPassword {
	private static Random rd = new Random();

	public static void main(String[] args) throws InterruptedException {
		int count = 0;
		String[] passwords = new String[1000];
		final String password = "028";
		String textRand = "";
		do {
			Thread.sleep(10);
			textRand = "" + rd.nextInt(10) + rd.nextInt(10) + rd.nextInt(10);
			if (contains(passwords, textRand, count
					)) {
				continue;
			}
			passwords[count++] = textRand;

			System.out.print(textRand + "    ");
			if (count 
					% 14 == 0) {
				System.out.println();
			}

		} while (!password.equals(textRand));
	}

	private static boolean contains(String[] passwords, String textRand, int count) {
		for (int i = 0; i < passwords.length; i++) {
			if (textRand.equals(passwords[i]))
				return true;
		}
		return false;
	}

}
