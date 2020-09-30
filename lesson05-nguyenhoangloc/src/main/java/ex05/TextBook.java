package ex05;

public class TextBook extends Book{
	private String status;
	
	public TextBook(String id, int price, String company, String status) {
		super("SGK"+id, price, company);
		this.status = status;
	}
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	
}
