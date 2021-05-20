package persistence;

public class ItemDto {
	public static final String Item_ID="itemId";
	public static final String Item_NAME="itemName";
	public static final String Igr_ID="igrId";
	public static final String Igr_NAME="igrName";
	public static final String Igr_PRICEBY="priceBy";
	public static final String Igr_PRICESALE="priceSale";
	public static final String Igr_TOTAL="total";
	
	private Integer itemId;
	private String itemName;
	private Integer igrId;
	private String igrName;
	private Double priceBy;
	private Double priceSale;
	private Integer total;
	
	
	public ItemDto() {
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


	public Integer getIgrId() {
		return igrId;
	}


	public void setIgrId(Integer igrId) {
		this.igrId = igrId;
	}


	public String getIgrName() {
		return igrName;
	}


	public void setIgrName(String igrName) {
		this.igrName = igrName;
	}


	public Double getPriceBy() {
		return priceBy;
	}


	public void setPriceBy(Double priceBy) {
		this.priceBy = priceBy;
	}


	public Double getPriceSale() {
		return priceSale;
	}


	public void setPriceSale(Double priceSale) {
		this.priceSale = priceSale;
	}


	public Integer getTotal() {
		return total;
	}


	public void setTotal(Integer total) {
		this.total = total;
	}


	@Override
	public String toString() {
		return "ItemDto [itemId=" + itemId + ", itemName=" + itemName + ", igrId=" + igrId + ", igrName=" + igrName
				+ ", priceBy=" + priceBy + ", priceSale=" + priceSale + ", total=" + total + "]";
	}

	
}
