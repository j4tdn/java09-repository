package entities;

public class Book {
	protected BookType type;
	protected String id;
	protected int price;
	protected String publishingCompany;
	
	public Book(BookType type, String id, int price, String publishingCompany) {
		this.type = type;
		this.id = id;
		this.price = price;
		this.publishingCompany = publishingCompany;
	}
	
	public Book() {
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public BookType getType() {
		return type;
	}
	public void setType(BookType type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPublishingCompany() {
		return publishingCompany;
	}
	public void setPublishingCompany(String publishingCompany) {
		this.publishingCompany = publishingCompany;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "type: " + type
				+ ", id: " + id
				+ ", price: " + price
				+ ", publishing company: " + publishingCompany;
	}

}
