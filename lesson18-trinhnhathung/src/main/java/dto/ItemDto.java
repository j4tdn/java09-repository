package dto;

import java.time.LocalTime;

public class ItemDto {

	public static final String IT_ID = "itemId";
	public static final String IT_NAME = "itemName";
	public static final String IT_BUYTIME = "buyTime";
	public static final String IT_QUANTITY = "quantity";

	private Integer itemId;
	private String itemName;
	private LocalTime buyTime;
	private Integer quantity;

	public ItemDto() {
	}

	public ItemDto(Integer itemId, String itemName, LocalTime buyTime, Integer quantity) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.buyTime = buyTime;
		this.quantity = quantity;
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

	public LocalTime getBuyTime() {
		return buyTime;
	}

	public void setBuyTime(LocalTime buyTime) {
		this.buyTime = buyTime;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "ItemDto [itemId=" + itemId + ", itemName=" + itemName + ", buyTime=" + buyTime + ", quantity="
				+ quantity + "]";
	}

}
