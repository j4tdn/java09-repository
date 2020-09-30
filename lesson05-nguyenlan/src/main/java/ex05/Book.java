package ex05;

public class Book {

	protected String id;
	protected int price;
	protected String publisher;
	
	public Book() {
		
	}
	public Book(String id, int price, String publisher) {
		this.id = id;
		this.price = price; 
		this.publisher = publisher;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}	
	@Override
	public String toString() {
		return "Mã sách: " + id
				+ ", đơn giá: " + price
				+ ", nhà xuất bản: " + publisher ;
	}
	
}
