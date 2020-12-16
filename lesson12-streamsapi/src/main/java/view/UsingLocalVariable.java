package view;

public class UsingLocalVariable {
	private static String globalVariable="global";
	public static void main(String[] args) {
		
	}
	private static void method() {
		String localVariable="local";
		Runnable runnable= new Runnable() {
			
			@Override
			public void run() {
				String innerVariable="inner";
			//	localVariable="no"; error =>final in stack
				System.out.println(localVariable);
				globalVariable="global";
				System.out.println(globalVariable);
			}
		};
		runnable.run();
	}
}
