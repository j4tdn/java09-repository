package ex03;

public class EmailException extends Exception {
	public EmailException(String mess) {
		System.out.println(mess);
	}
}
