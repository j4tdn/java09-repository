package ex05;

public class Book {
	protected String id;
	protected Float price;
	protected String publishingCompany;

	public Book(String id, Float price, String publishingCompany) {
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

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getPublishingCompany() {
		return publishingCompany;
	}

	public void setPublishingCompany(String publishingCompany) {
		this.publishingCompany = publishingCompany;
	}

	public Float getMoney() {
		return 0f;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", price=" + price + ", publishingCompany=" + publishingCompany + "]";
	}

}
