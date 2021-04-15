package persistence;

public class ItemGroupDto {
	public static final String ID = "id";
	public static final String NAME = "name";
	public static final String ITEM_DETAILS = "itemdetails";
	public static final String TOTAL_OF_ITEMS = "totalOfItems";
	
	private Integer id;
	private String name;
	private String itemDetails;
	private Double totalOfItems;
	
	public ItemGroupDto() {
	}

	public ItemGroupDto(Integer id, String name, String itemDetails, Double totalOfItems) {
		super();
		this.id = id;
		this.name = name;
		this.itemDetails = itemDetails;
		this.totalOfItems = totalOfItems;
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

	public String getItemDetails() {
		return itemDetails;
	}

	public void setItemDetails(String itemDetails) {
		this.itemDetails = itemDetails;
	}

	public Double getTotalOfItems() {
		return totalOfItems;
	}
	
	public void setTotalOfItems(Double totalOfItems) {
		this.totalOfItems = totalOfItems;
	}
	
	@Override
	public String toString() {
		return "ItemGroupDto [id=" + id + ", name=" + name + ", itemDetails=" + itemDetails + ", totalOfItems="
				+ totalOfItems + "]";
	}

}
