package view;


public class UsingLocalVariable {
	
	public static void main(String[] args) {
		System.out.println();
	}
	private static String gloalVariable = "global";

	private static void method() {
		String lovalVariable = "local";

		// anonymous class
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				String innerVariable = "inner";
				// localVariable = "xx";
				System.out.println(lovalVariable);
				System.out.println(lovalVariable.equals(innerVariable));
				gloalVariable = "global-local";
				System.out.println(gloalVariable);
			}
		};
		runnable.run();
	}
}
