package bt5;

public class Sach {
	protected String id;
	protected long price;
	protected String publisher;
	
	public Sach(String id, long price, String publisher) {
		super();
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

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
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
		return ""+this.id+"\t"+this.price+"\t"+this.publisher+"\n";
	}
}
