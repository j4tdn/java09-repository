package random;

import java.util.Random;

public class Ex02RandomPassword {
	private static Random rd = new Random();

	public static void main(String[] args) throws InterruptedException {
		int count = 1;
		int pIndex=0;
		String[] passwords=new String[1000];
		final String password = "028";
		String textRand = "";
		do {
			Thread.sleep(10);
			textRand = "" + rd.nextInt(10) + rd.nextInt(10) + rd.nextInt(10);
			if(contains(passwords,textRand)) {
				continue;
			}
			passwords[pIndex]=textRand;
			
			
			
			System.out.print(textRand + "   ");

			if (count % 14 == 0) {
				System.out.println();

			}
			count++;
		} while (!password.equals(textRand));

		System.out.println(textRand);
	}

	private static boolean contains(String[] passwords, String textRand) {
		for(int i=0;i<passwords.length;i++) {
			if(textRand.equals(passwords[i]) )
				return true;
		
		}
		return false;
	}
}
