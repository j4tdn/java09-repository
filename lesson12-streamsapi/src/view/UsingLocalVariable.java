package view;

public class UsingLocalVariable {
	
	private static String globalVariable = "gloabal";
	public static void main(String[] args) {
		method();
		
	}
	private static void method() {
		String localVariable = "local";						// mac dinh la final
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				String innerVariable ="inner";
				System.out.println(localVariable);
				System.out.println(localVariable.equals(innerVariable));
				System.out.println(globalVariable);

				globalVariable = "global-local";
				//localVariable = "xx";						khong gan dc
			}
		};
		
		runnable.run();
	}

}
