package view;

public class UsingLocalVariable {
	public static void main(String[] args) {
		
	}
	private static void method() {
		String localVariable="hello";
		Runnable runnable=new Runnable() {
			
			@Override
			public void run() {
				String innerVaribale="inner";
				System.out.println(localVariable);
				System.out.println(localVariable.equals("hello"));
			}
		};
	}
}
