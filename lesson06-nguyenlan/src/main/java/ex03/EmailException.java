package ex03;

public class EmailException extends Exception{
	public EmailException(String message) {
		super(message);
	}
	public EmailException() {
		super("Email không hợp lệ!!!");
	}
}
