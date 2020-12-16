package view;

public class UsingLocalVariable {
	
	private static String globalVariable = "globalVariable";

	public static void main(String[] args) {
		method();
		
	}
	private static void method() {
		String localVariable = "local";
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				String innerVariable = "inner";
				//localVariable = "xx";
				globalVariable = "global-local";
				System.out.println(localVariable);
				System.out.println(localVariable.equals(innerVariable));
				
			}
		};
		runnable.run();
	}
	
}
