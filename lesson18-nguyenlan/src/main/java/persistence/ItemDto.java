package persistence;

import java.sql.Date;

public class ItemDto {
	public static String ITEM_ID = "itemId";
	public static String ITEM_NAME = "itemName";
	public static String SALE_DATE = "saleDate";
	public static String TOTAL = "total";

	private Integer itemId;
	private String itemName;
	private Date saleDate;
	private Integer total;

	public ItemDto() {

	}

	public ItemDto(Integer itemId, String itemName, Date saleDate, Integer total) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.saleDate = saleDate;
		this.total = total;
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

	public Date getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(Date saleDate) {
		this.saleDate = saleDate;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "ItemDto [" + "itemId:" + itemId 
				+ ", itemName:" + itemName 
				+ ", saleDate:" + saleDate 
				+ " , total:" + total + "]";
	}
}
