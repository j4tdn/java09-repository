package bt;

public class EmailException extends Exception{
	private static final long serialVersionUID = 6007286841723654832L;
	
	@Override
	public String getMessage() {
		return "Email không hợp lệ!!";
	}
}
