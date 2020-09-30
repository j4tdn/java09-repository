package lesson05;

public class Sach {
	public String id;
	public double price;
	public String actor;
	public Sach() {
	}
	public Sach(String id, double price, String actor) {
		this.id = id;
		this.price = price;
		this.actor = actor;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	
}
