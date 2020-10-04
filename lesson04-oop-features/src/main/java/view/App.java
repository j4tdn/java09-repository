package view;

public class App {
	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		
//		c1:
//		Operation operation = new Operation() {
//			
//			@Override
//			public int perform(int a, int b) {
//				return a + b;
//			}
//		};
		
//		c2:
//		Operation operation = (int x,int y) -> {
//			return x + y;
//		};
		Operation operation = (x,y) -> x + y;
		int result = perform(a, b, operation);
		
		System.out.println(result);
	}
	private static int perform(int a,int b,Operation operation) {
		return operation.perform(a, b);
	}
}
