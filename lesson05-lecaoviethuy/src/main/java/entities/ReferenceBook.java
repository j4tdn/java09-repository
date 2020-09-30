package entities;

public class ReferenceBook extends Book{
	private float tax;

	public ReferenceBook() {
		super();
	}

	public ReferenceBook(BookType type, String id, int price, String publishingCompany, float tax) {
		super(type, id, price, publishingCompany);
		this.tax = tax;
	}
	
	
	public float getTax() {
		return tax;
	}

	public void setTax(float tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return super.toString()
				+ ", tax: " + tax;
	}
	
}
