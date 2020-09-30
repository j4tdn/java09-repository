package model;

public class RefeBook extends Book {
	private float tax;

	public RefeBook(String bookId, float cost, String publisher, float tax) {
		super(bookId, cost, publisher);
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
		// TODO Auto-generated method stub
		return super.toString() + tax;
	}

}
