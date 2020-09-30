package ex05;

public class ReferrenceBook extends Book {
	private int tax;
	

	

	public ReferrenceBook(String id, int price, String company, int tax) {
		super("STK"+id, price, company);
		this.tax = tax;
	}

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}
	
}
