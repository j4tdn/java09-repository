package ex05;

public class ReferenceBooks extends Book {
	private Float tax;

	public ReferenceBooks() {
	}

	public ReferenceBooks(String id, Float price, String publishingCompany, Float tax) {
		super(id, price, publishingCompany);
		this.tax = tax;
	}

	public Float getTax() {
		return tax;
	}

	public void setTax(Float tax) {
		this.tax = tax;
	}

	@Override
	public Float getMoney() {
		return this.price * (1 + this.tax);
	}

	@Override
	public String toString() {
		return super.toString() + "ReferenceBooks [tax=" + tax + "]";
	}

}
