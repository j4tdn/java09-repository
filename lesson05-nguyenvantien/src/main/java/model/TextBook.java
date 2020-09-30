package model;

public class TextBook extends Book {
	private String status;

	public TextBook(String bookId, float cost, String publisher, String status) {
		super(bookId, cost, publisher);
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
		// TODO Auto-generated method stub
		return super.toString() + status;
	}

}
