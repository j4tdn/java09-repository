package view;

public class UsingLocalVariable {
	
	private static String globalVariable = "global";
	public static void main(String[] args) {
		
	}
	
	private static void method() {
		String localVariable = "local";
		// bien final k the thay doi dia chi o stack
		// anonymous class
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				String innerVariable = "inner";
				System.out.println(localVariable);
				globalVariable = "global";
				System.out.println(globalVariable);
			}
		};
		
		runnable.run();
	}
}
