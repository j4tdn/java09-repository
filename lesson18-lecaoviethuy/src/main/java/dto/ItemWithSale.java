package dto;

public class ItemWithSale {
	private Integer id;
	private String name;
	private Integer sale;
	
	public ItemWithSale() {
		// TODO Auto-generated constructor stub
	}
	
	public ItemWithSale(Integer id, String name, Integer sale) {
		super();
		this.id = id;
		this.name = name;
		this.sale = sale;
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
	public Integer getSale() {
		return sale;
	}
	public void setSale(Integer sale) {
		this.sale = sale;
	}
	@Override
	public String toString() {
		return "ItemWithSale [id=" + id + ", name=" + name + ", sale=" + sale + "]";
	}
	
	
}
