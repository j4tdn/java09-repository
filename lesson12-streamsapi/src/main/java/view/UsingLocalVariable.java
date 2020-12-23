package view;

public class UsingLocalVariable {
	private static String globalVariale="global";
	public static void main(String[] args) {

	}

	private static void method() {
		final String localVariable = "local";
		//anonymous class
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				String innerVariable = "inner";
//				localVariable="xx";
				System.out.println(localVariable);
				System.out.println(localVariable.equals(innerVariable));
				globalVariale="global-local";
				System.out.println(globalVariale);
			}
		};
		runnable.run();

	}
}
