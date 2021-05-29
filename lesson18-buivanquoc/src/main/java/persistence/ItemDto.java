package persistence;

import java.util.Date;

public class ItemDto {
	public static final String ITEM_ID="itemId";
	public static final String ITEM_NAME="itemName";
	public static final String ITEM_TOTAL="itemTotal";
	public static final String SALE_DATE="saleDate";
private Integer itemId;
private String itemName;
private Double itemTotal;
private Date saleDate;
public ItemDto() {
}
public ItemDto(Integer itemId, String itemName, Double itemTotal, Date saleDay) {
	super();
	this.itemId = itemId;
	this.itemName = itemName;
	this.itemTotal = itemTotal;
	this.saleDate = saleDay;
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
public Double getItemTotal() {
	return itemTotal;
}
public void setItemTotal(Double itemTotal) {
	this.itemTotal = itemTotal;
}
public Date getSaleDate() {
	return saleDate;
}
public void setSaleDate(Date saleDay) {
	this.saleDate = saleDay;
}
@Override
public String toString() {
	return "ItemDto [itemId=" + itemId + ", itemName=" + itemName + ", itemTotal=" + itemTotal + ", saleDate=" + saleDate
			+ "]";
}

}
