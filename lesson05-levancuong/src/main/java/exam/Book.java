package exam;

public class Book {
	protected String idBook;
	protected float unitPrice;
	protected String publisher;
	public Book(String idBook, float unitPrice, String publisher) {
		this.idBook = idBook;
		this.unitPrice = unitPrice;
		this.publisher = publisher;
	}
	public String getIdBook() {
		return idBook;
	}
	public void setIdBook(String idBook) {
		this.idBook = idBook;
	}
	public float getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	@Override
	public String toString() {
		return this.idBook+"----"+this.unitPrice+"----"+this.publisher;
	}
	
	
}
