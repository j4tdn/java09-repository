package exception;

public class Ex05 {

	public static void main(String[] args) {
		// not initial object -> NPE
		String[] sequences = new String [5];
		System.out.println("Value: " + sequences[0].toUpperCase());
	}

}
