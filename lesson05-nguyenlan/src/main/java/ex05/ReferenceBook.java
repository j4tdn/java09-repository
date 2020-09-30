package ex05;

public class ReferenceBook extends Book{
	private static String type = "Sách tham khảo";
	private float tax;
	public ReferenceBook() {
		
	}
	public ReferenceBook(String id, int price, String publisher, float tax) {
		this.id = id;
		this.price = price; 
		this.publisher = publisher;
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
		return "Mã sách: " + id
				+ ", loại sách: " + type
				+ ", đơn giá: " + price
				+ ", nhà xuất bản: " + publisher 
				+ ", thuế: " + tax;
	}
	
}
