package draw;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		drawEx01(5);
		drawEx02(5);
		drawEx03(5);
		drawEx04(5);

	}
	
	private static void drawEx01(int i) {
		for (int n =0; n< i; n++) {
			System.out.print("*");
		}
		
	}
	
	private static void drawEx02(int i) {
		for (int n =0; n< i; n++) {
			System.out.println("*");
		}

	}

	private static void drawEx03(int i) {
		for (int n =0; n< i; n++) {
			for (int j = n; j >0; j--) {
				System.out.print(" ");
			}
			System.out.println("*");
		}

	
	}

	private static void drawEx04(int i) {
		for (int n =0; n< i; n++) {
			for (int j = i-1-n; j >0; j--) {
				System.out.print(" ");
			}
			System.out.println("*");
		}

	}


}
