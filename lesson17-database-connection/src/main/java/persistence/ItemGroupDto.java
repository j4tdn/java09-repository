package persistence;

public class ItemGroupDto {
	public static final String ID="Id";
	public static final String NAME="name";
	public static final String ITEMDETAILS="ItemaDetails";
	public static final String TOTALOFITEM="totalOfItem";
	
	private Integer id;
	private String name;
	private String ItemaDetails;
	private Double totalOfItem;
	
	public ItemGroupDto() {
		// TODO Auto-generated constructor stub
	}
	

	public ItemGroupDto(Integer id, String name, String itemaDetails, Double totalOfItem) {
		super();
		this.id = id;
		this.name = name;
		ItemaDetails = itemaDetails;
		this.totalOfItem = totalOfItem;
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

	public String getItemaDetails() {
		return ItemaDetails;
	}

	public void setItemaDetails(String itemaDetails) {
		ItemaDetails = itemaDetails;
	}


public Double getTotalOfItem() {
	return totalOfItem;
	
}
public void setTotalOfItem(Double totalOfItem) {
	this.totalOfItem = totalOfItem;
}


@Override
public String toString() {
	return "ItemGroupDto [id=" + id + ", name=" + name + ", ItemaDetails=" + ItemaDetails + ", totalOfItem="
			+ totalOfItem + "]";
}
	
}
