package persistence;

public class ItemWithYearDto {
	
	public static String ID = "ID";
	public static String NAME = "NAME";
	public static String QUANTITY = "quantity";
	
	private Integer id;

	private String name;
	
	private Integer quantity;

	public ItemWithYearDto() {
	}

	public ItemWithYearDto(Integer id, String name, Integer quantity) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", quantity=" + quantity + "]";
	}
}
