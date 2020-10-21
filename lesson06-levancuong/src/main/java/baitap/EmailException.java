package baitap;

public class EmailException extends Exception{
	private static final long serialVersionUID = 2352933136331991239L;
	@Override
	public String getMessage() {
		return "invalid email";
	}
}
