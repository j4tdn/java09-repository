package view;

public class UsingLocalVariable {
	
	private static String globalVariable = "global";
	
	public static void main(String[] args) {
		
	}
	private static void method() {
		String localVariable = "local";
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				String innerVariable = "inner";
				System.out.println(localVariable);
				System.out.println(localVariable.equals(innerVariable));
				globalVariable = "globle-globle";
				System.out.println(globalVariable);
			}
		};
		runnable.run();
	}
}