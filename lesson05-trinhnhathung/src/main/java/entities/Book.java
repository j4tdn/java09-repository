package entities;

public abstract class Book {
	private String id;
	private float cost;
	private String publishingCompany;

	public Book(String id, float cost, String publishingCompany) {
		super();
		this.id = id;
		this.cost = cost;
		this.publishingCompany = publishingCompany;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public String getPublishingCompany() {
		return publishingCompany;
	}

	public void setPublishingCompany(String publishingCompany) {
		this.publishingCompany = publishingCompany;
	}
	
	public abstract float pay ();

	@Override
	public String toString() {
		return "id=" + id + ", cost=" + cost + ", publishingCompany=" + publishingCompany;
	}
	
	
}
