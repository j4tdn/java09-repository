package exception;

public class Ex05 {
	public static void main(String[] args) {
		// not initial object -> NPE(null point exception)
		String[] sequenses = new String[5];
		System.out.println("value: " + sequenses[0].toUpperCase());
		}
}
