package radom;

import java.util.Random;

public class Ex02RandomPassword {
	
	private static Random rd = new Random();
	
	public static void main(String[] args) throws InterruptedException {
		final String password = "028";
		int i= 0;
		String[] a = new String[1000];
		
		String x = "";
		
		do {
			Thread.sleep(10);
			x = "" + rd.nextInt(10) + rd.nextInt(10) + rd.nextInt(10);
			
			if (contains(a, x, i)) {
				continue;
			}
			
			a[i++]=x;
			
			System.out.print(x + "   ");
			if (i%14 == 0) {
				System.out.println();
			}
			
		} while (!password.equals(x));
		
	}

	private static boolean contains(String[] a, String x, int n) {
		// TODO Auto-generated method stub
		for (int i =0; i< n ; i++) {
			if (x.equals(a[i])) {
				return true;
			}
		}
		return false;
	}

}
