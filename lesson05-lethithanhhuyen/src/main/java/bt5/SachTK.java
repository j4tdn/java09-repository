package bt5;

public class SachTK extends Sach {
	private float tax;

	public SachTK(String id, long price, String publisher, float tax) {
		super(id, price, publisher);
		this.tax = tax;
	}

	public float getTax() {
		return tax;
	}

	public void setTax(float tax) {
		this.tax = tax;
	}
	
	
}
