package view;

/**
 * Write "ONE" method to perform operations between 2 numbers: + - * / %
 */
public class App {
	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		// Operation: Interface
		// The highlight code: Anonymous class
		// That is an instance of Interface
		
		// From JAVA8: We can create an instance of Interface by lambda expression
		// How does it work
		int result = perform(a, b, (x, y) -> x / y);
		System.out.println("result: " + result);
	}

	private static int perform(int a, int b, Operation operation) {
		return operation.perform(a, b);
	}
}
