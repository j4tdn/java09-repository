package beans;

public class StrategyPattern {
	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		Operation operation = new Operation() {
			
			@Override
			public int perform(int x, int y) {
				return x * y;
			}
		};
		int result = perform(a, b, operation);
		System.out.println(result);
	}
	private static int perform(int a, int b, Operation operation) {
		return operation.perform(a,b);
	}
}
