package beans;



public class Store {
	private Integer storeId;
	private Integer referenceStoreId;
	private Integer storePreviousDay;
	private Integer expectedSales;
	private boolean isSelected;
	
	public Store() {
		
	}



	public Store(Integer storeId, Integer referenceStoreId, Integer storePreviousDay, Integer expectedSales,
			boolean isSelected) {
		super();
		this.storeId = storeId;
		this.referenceStoreId = referenceStoreId;
		this.storePreviousDay = storePreviousDay;
		this.expectedSales = expectedSales;
		this.isSelected = isSelected;
	}



	public Integer getStoreId() {
		return storeId;
	}



	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}



	public Integer getReferenceStoreId() {
		return referenceStoreId;
	}



	public void setReferenceStoreId(Integer referenceStoreId) {
		this.referenceStoreId = referenceStoreId;
	}



	public Integer getStorePreviousDay() {
		return storePreviousDay;
	}



	public void setStorePreviousDay(Integer storePreviousDay) {
		this.storePreviousDay = storePreviousDay;
	}



	public Integer getExpectedSales() {
		return expectedSales;
	}



	public void setExpectedSales(Integer expectedSales) {
		this.expectedSales = expectedSales;
	}



	public boolean isSelected() {
		return isSelected;
	}



	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Store)) {
			return false;
		}
		Store that = (Store) obj;
		return getStoreId() == that.getStoreId() ;
	}
}