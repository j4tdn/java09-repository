package ex05;

public class Textbook extends Book{
	private static String type = "Sách giáo khoa";
	private Status status;
	public Textbook() {
		
	}
	public Textbook(String id, int price, String publisher, Status status) {
		this.id = id;
		this.price = price;
		this.publisher = publisher;
		this.status = status;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Mã sách: " + id
				+ ", Loại sách: " + type
				+ ", đơn giá: " + price
				+ ", nhà xuất bản: " + publisher 
				+ ", tình trạng: " + status;
	}
	
}
