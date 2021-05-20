package persistence;

import java.time.LocalTime;

public class ItemCau1 {

	
	public static final String ID = "itemId";
	public static final String NAME = "itemName";
	public static final String TIME = "itemTime";
	private Integer itemId;
	private String itemName;
	private LocalTime itemTime;
	public ItemCau1() {
	}
	public ItemCau1(Integer itemId, String itemName, LocalTime itemTime) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemTime = itemTime;
	}
	public Integer getItemId() {
		return itemId;
	}
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public LocalTime getItemTime() {
		return itemTime;
	}
	public void setItemTime(LocalTime itemTime) {
		this.itemTime = itemTime;
	}
@Override
public String toString() {
	return "itemName: "+itemName+"itemId:"+itemId+"itemTime"+itemTime;
}

	
}
