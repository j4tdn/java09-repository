package exception;

import javax.annotation.processing.Messager;

public class InvalidGenderException extends Exception{

	private static final long serialVersionUID = 2352933136331991239L;
	
	
	
	public InvalidGenderException(String message) {
		super(message);
	}
	
}
