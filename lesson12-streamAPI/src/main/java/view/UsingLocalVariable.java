package view;

public class UsingLocalVariable {
	private static String globalVariable = "global";
	public static void main(String[] args) {
		method();

	}

	private static void method() {
	final	String localVariable = "local";
		//anonymous class
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				String innerVariable = "inner";
				System.out.println(localVariable);
				System.out.println(localVariable.equals(localVariable.equals(innerVariable)));
				globalVariable = "global-local";
				System.out.println(globalVariable);
			}
		};

		runnable.run();
	}

}
