package persistence;

import java.util.Date;

public class ItemDto {

	public static final String IT_ID = "itemId";
	public static final String IT_NAME = "itemName";
	public static final String IT_BUYDATE = "buyDate";
	public static final String IT_QUANTITY = "quantity";

	private Integer itemId;
	private String itemName;
	private Date buyDate;
	private Integer quantity;

	public ItemDto() {
	}

	public ItemDto(Integer itemId, String itemName, Date buyDate, Integer quantity) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.buyDate = buyDate;
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

	public Date getBuyDate() {
		return buyDate;
	}

	public void setBuyDate(Date buyDate) {
		this.buyDate = buyDate;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
}
