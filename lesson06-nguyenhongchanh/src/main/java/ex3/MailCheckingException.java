package ex3;

public class MailCheckingException extends Exception {
	 
    public MailCheckingException(String message) {
        super(message);
    }
     
    @Override
    public String getMessage() {
        return "Lỗi nhập vào một tuổi: " + super.getMessage();
    } 
}