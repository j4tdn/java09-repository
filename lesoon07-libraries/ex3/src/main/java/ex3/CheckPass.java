package ex3;

public class CheckPass  extends Exception {
	
	public CheckPass(String message) {
        super(message);
    }
     
    @Override
    public String getMessage() {
        return "Lỗi nhập vào một mật khẩu: " + super.getMessage();
    } 
    
    
}
