package view;

public class UsingLocalVariable {
	private static String globalVariable = "global";
	public static void main(String[] args) {
		
	}
	
	private static void method() {
		String localVariable = "local";
		// anonymous class
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				String innerVariable = "inner";
				// localVariable = "xx";
				globalVariable = "global-local";
				System.out.println(localVariable);
				System.out.println(localVariable.equals(innerVariable));
			}
		};
		runnable.run();
	}
}
