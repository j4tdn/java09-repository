package ex05;

public class Textbook extends Book {
	private Boolean status;

	public Textbook() {
	}

	public Textbook(String id, Float price, String publishingCompany, Boolean status) {
		super(id, price, publishingCompany);
		this.status = status;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	@Override
	public Float getMoney() {
		if (this.status == false) {
			return this.price - this.price * 30 / 100;
		}
		return price;
	}

	@Override
	public String toString() {
		return super.toString() + "Textbook [status=" + status + "]";
	}

}
