package random;

import java.util.Random;

public class Ex02RandomPassword {
	private static Random rd = new Random();

	public static void main(String[] args) throws InterruptedException {
		String[] passwords = new String[1000];
		final String password = "028";
		int count = 0;
		String textRand = "";

		do {
			Thread.sleep(10);
			// System.out.print(textRand + " ");
			textRand = "" + rd.nextInt(10) + rd.nextInt(10) + rd.nextInt(10);

			if (contains(passwords, textRand, count)) {
				continue;
			}
			passwords[count++] = textRand;

			System.out.print(textRand + "  ");
			if (count % 24 == 0) {
				System.out.print("\n");
			}
		} while (!password.equals(textRand));

//		
//		while() {
//			Thread.sleep(10);
//			System.out.print(textRand + "  ");
//			textRand = "" + rd.nextInt(10) + rd.nextInt(10) + rd.nextInt(10);
//			if(count %24 == 0) {
//				System.out.println("\n");
//			}
//			count ++;
//		}
//		System.out.println( "Final :"  + textRand + "  ");
	}

	private static boolean contains(String[] passwords, String textRand, int count) {
		for (int i = 0; i <= count; i++) {
			if (textRand.equals(passwords[i])) { // passwords[i].equals(textRand) ko dc, vi khi tao passwords[i] thi se co gia tri
				//null nhung chua khoi tao tai heap,nen han ko goi ham equals dc
				return true;
			}
		}
		return false;
	}
}
