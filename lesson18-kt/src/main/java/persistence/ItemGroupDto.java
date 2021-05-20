package persistence;

public class ItemGroupDto {
	
	public static String ID = "id";
	public static String NAME = "name";
	public static String QUANTITY = "quantity";
	
	
	private Integer id;
	private String name;
	private Integer quantity;
	public ItemGroupDto() {
	}
	public ItemGroupDto(Integer id, String name, Integer quantity) {
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
		return "ItemGroupDto [id=" + id + ", name=" + name + ", quantity=" + quantity + "]";
	}
	
}
