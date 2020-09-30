package functionalinterface;

public class App {
	public static void main(String[] args) {

		// anonymous class
		// anonymous function
		// (parameters) -> {// body} : interface has only one asbstract class (
		// functional interface)

		Comparable<String> coma = (String o) -> {
			return 0;
		};

		System.out.println(operator(4, 5, (a, b) -> a + b));
		System.out.println(operator(4, 5, (a, b) -> a * b + a * b));
	}

	public static int operator(int a, int b, Operation operation) {
		return operation.perform(a, b);
	}
}
