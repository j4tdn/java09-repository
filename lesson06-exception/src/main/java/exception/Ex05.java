package exception;

public class Ex05 {
	public static void main(String[] args) {
		// not initial object -> NPE(NullPointerException)
		String[] sequenses = new String[5];
		System.out.println("Value: " + sequenses[0].toUpperCase());
	}
}
