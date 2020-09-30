package entities;

public class ReferenceBook extends Book {
	private float tax;

	public ReferenceBook(String id, float cost, String publishingCompany, float tax) {
		super(id, cost, publishingCompany);
		this.tax = tax;
	}

	public float getTax() {
		return tax;
	}

	public void setTax(float tax) {
		this.tax = tax;
	}

	@Override
	public float pay() {
		return (float) (this.getCost() * (1 + this.tax));
	}

	@Override
	public String toString() {
		return super.toString() + ", tax=" + tax ;
	}
	
	

}
