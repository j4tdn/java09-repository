package persistence;

import java.time.LocalTime;

public class ItemDto {
	
	public static final String ITEM_ID = "itemId";
	public static final String ITEM_NAME = "itemName";
	public static final String TIME_SALE = "timeSale";
	
	private Integer itemId;
	private String itemName;
	private LocalTime timeSale;
	
	public ItemDto() {
	}

	public ItemDto(Integer igrId, String igrName, LocalTime timeSale) {
		super();
		this.itemId = igrId;
		this.itemName = igrName;
		this.timeSale = timeSale;
	}

	public Integer getIgrId() {
		return itemId;
	}

	public void setIgrId(Integer igrId) {
		this.itemId = igrId;
	}

	public String getIgrName() {
		return itemName;
	}

	public void setIgrName(String igrName) {
		this.itemName = igrName;
	}

	
	public LocalTime getTimeSale() {
		return timeSale;
	}

	public void setTimeSale(LocalTime timeSale) {
		this.timeSale = timeSale;
	}

	@Override
	public String toString() {
		return "ItemDto [igrId=" + itemId + ", igrName=" + itemName + ", timeSale=" + timeSale + "]";
	}

}
