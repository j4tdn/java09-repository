package view;

public class UsingLocalVariable {
	
	private static String globalVariable = "global";
	
	public static void main(String[] args) {
		
	}
	
	private static void method() {
		String localVariable = "local";
	
		//anonymous class
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				String innerVariable = "inner";
				//localVariable = "xx";
				System.out.println(localVariable);
				globalVariable = "global-local";
				System.out.println(globalVariable);
			}
		};
		runnable.run();
	}
}
