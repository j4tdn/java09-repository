package view;

public class UsingLocalVariable {
	private static String globalVariable = "local";

	public static void main(String[] args) {

	}

	// method là phương thức của class Using..
	// runnable là phương thức của class new Runnable
	private static void method() {
		String localVariable = "local"; // mặc định là final

		// anonymous class
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				String innerVariable = "inner";
				globalVariable = "global-local";
				System.out.println(localVariable);
			}
		};
		runnable.run();
	}
}
