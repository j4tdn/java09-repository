package exception;

public class Ex05 {
	public static void main(String[] args) {
		String[] sequenses = new String[5];
		// not initial object -> NPE
		System.out.println(sequenses[0].toUpperCase());
	}
}
