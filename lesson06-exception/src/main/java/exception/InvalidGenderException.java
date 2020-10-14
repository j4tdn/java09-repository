package exception;

public class InvalidGenderException extends Exception {
	
	public InvalidGenderException(String message) {
		super(message); //ham super se goi toi ham khoi tao cua thang cha va truyen
		//tham so message vo
	}
}
