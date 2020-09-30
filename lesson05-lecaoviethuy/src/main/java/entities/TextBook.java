package entities;

public class TextBook extends Book{
	private String status;

	public TextBook() {
		super();
	}

	public TextBook(BookType type, String id, int price, String publishingCompany, String status) {
		super(type, id, price, publishingCompany);
		this.status = status;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return super.toString() 
				+ ", status: " + status;
	}
	
	
}
