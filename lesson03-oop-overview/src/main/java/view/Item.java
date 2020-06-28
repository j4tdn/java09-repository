package view;

public class Item {
	private String Id;
	private String Hdh;
	private String Color;
	private Double Price;

	public Item() {
		
	}

	public Item(String Id, String Hdh, String Color, Double Price) {
		this.Id = Id;
		this.Hdh = Hdh;
		this.Color = Color;
		this.Price = Price;
	}

	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = Id;
	}
	public String getHdh() {
		return Hdh;
	}
	public void setHdh(String hdh) {
		Hdh = hdh;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public Double getPrice() {
		return Price;
	}
	public void setPrice(Double price) {
		Price = price;
	}
	
}
