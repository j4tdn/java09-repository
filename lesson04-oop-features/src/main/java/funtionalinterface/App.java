package funtionalinterface;

/**
 * Write ONE method to perform operations
 * between 2 numbers: + - * / %
 */
public class App {
	public static void main(String[] args) {
		// anonymous class
		// java 8:
		// anonymous class => anonymous function
		// (parameters) -> { // body}; => lambda expression
		// condition: Interface has ONE abstract method
		// Functional Interface
		
		System.out.println(operate(7, 5, (a, b) -> a * b));
		System.out.println(operate(7, 5, (a, b) -> a * b + a + b));
	}
	
	// strategy pattern
	private static int operate(int a, int b, Operation operation) {
		return operation.perform(a, b);
	}
}
