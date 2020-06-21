package draw;

public class Ex01 {
	public static void main(String[] args) {
		draw01(7);
		draw02(7);
		draw03(7);
		draw04(7);
	}

	private static void draw01(int m) {
		for (int i = 0; i < m; i++) {
			System.out.print("*");
		}

	}

	private static void draw02(int m) {
		for (int i = 0; i < m; i++) {
			System.out.println("*");
		}
	}

	private static void draw03(int m) {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
	}

	private static void draw04(int m) {
        /* for(int i=m-1;i>=0;i--) {
        	 for(int j=0;j<i;j++) {
        		 System.out.print(" ");
        	 }
        	 System.out.println("*");
         }*/
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=m;j++) {
				if(j==(m-i+1)) {
					System.out.print("*");
				}
				else System.out.print(" ");
			}
			System.out.println();
		}
	}

}
