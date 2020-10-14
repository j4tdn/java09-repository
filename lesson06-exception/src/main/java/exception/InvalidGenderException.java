package exception;

import java.io.IOException;

public class InvalidGenderException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public InvalidGenderException(String message) {
		super(message);
	}
}
