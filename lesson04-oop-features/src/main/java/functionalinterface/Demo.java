package functionalinterface;

public class Demo {
	public static void main(String[] args) {
		Operation operation = (a, b) -> a * b;
		int result = operation.perform(5, 7);
		System.out.println(result);
	}
}
