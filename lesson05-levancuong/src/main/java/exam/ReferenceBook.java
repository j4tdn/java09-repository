package exam;

public class ReferenceBook extends Book {
	private float taxes;

	public ReferenceBook(String idBook, float unitPrice, String publisher, float taxes) {
		super(idBook, unitPrice, publisher);
		this.taxes = taxes;
	}

	public float getTaxes() {
		return taxes;
	}

	public void setTaxes(float taxes) {
		this.taxes = taxes;
	}

	@Override
	public String toString() {
		return super.toString() + "----" + this.taxes;
	}

	public float tinhTien() {

		return this.unitPrice * (1 + taxes / 100);
	}

}
