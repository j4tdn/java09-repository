package entities;

public class SchoolBook extends Book {
	private String status;

	public SchoolBook(String id, float cost, String publishingCompany, String status) {
		super(id, cost, publishingCompany);
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public float pay() {
		if (this.status.toLowerCase().equals("new")) {
			return (float) (0.3 * this.getCost());
		} else {
			return this.getCost();
		}
	}

	@Override
	public String toString() {
		return super.toString() +  "status=" + status;
	}
	
	

}
