package view;

public class UsingLocalVariable {
	public static void main(String[] args) {

	}
	private static void method() {
		String localVariable = "local";
		//anonymous class
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				String innerVariable = "inner";
				//trong 1 anonymous class co the su dung 
				// bien local trong ham
				System.out.println(localVariable);
//				localVariable = "fix";
			}
		};
	}
}
