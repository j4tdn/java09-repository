package baitap;

public class InvalidEmailException extends Exception{
	private static final long serialVersionUID = 2352933136331991239L;
	
	public InvalidEmailException(String mess) {
		super(mess);
	}
	
}
