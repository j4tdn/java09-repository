package allocation;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

//import org.apache.commons.lang3.builder.HashCodeBuilder;
//import org.apache.commons.lang3.builder.ToStringBuilder;

public class Store {

	private Long storeId;
	private Long referenceStoreId;
	private Long storePreviousDay;
	private Long expectedSales;
	private Boolean isSelected;

	public Store() {

	}

	public Store(final Long storeId, final Long referenceStoreId, final Long storePreviousDay, Long expectedSales,
			final Boolean isSelected) {
		this.storeId = storeId;
		this.referenceStoreId = referenceStoreId;
		this.storePreviousDay = storePreviousDay;
		this.expectedSales = expectedSales;
		this.isSelected = isSelected;
	}

	public Long getStoreId() {
		return storeId;
	}

	public void setStoreId(final Long storeId) {
		this.storeId = storeId;
	}

	public Long getReferenceStoreId() {
		return referenceStoreId;
	}

	public void setReferenceStoreId(final Long referenceStoreId) {
		this.referenceStoreId = referenceStoreId;
	}

	public Long getStorePreviousDay() {
		return storePreviousDay;
	}

	public void setStorePreviousDay(final Long storePreviousDay) {
		this.storePreviousDay = storePreviousDay;
	}

	public Long getExpectedSales() {
		return expectedSales;
	}

	public void setExpectedSales(Long expectedSales) {
		this.expectedSales = expectedSales;
	}

	public Boolean getSelected() {
		return isSelected;
	}

	public void setSelected(final Boolean selected) {
		isSelected = selected;
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o)
			return true;

		if (o == null || getClass() != o.getClass())
			return false;

		final Store store = (Store) o;

		return true;

//        return new org.apache.commons.lang3.builder.EqualsBuilder()
//                .append(storeId, store.storeId)
//                .append(referenceStoreId, store.referenceStoreId)
//                .append(storePreviousDay, store.storePreviousDay)
//                .append(expectedSales, store.expectedSales)
//                .append(isSelected, store.isSelected)
//                .isEquals();
	}

//    @Override
//    public int hashCode() {
//        return new HashCodeBuilder()
//                .append(storeId)
//                .append(referenceStoreId)
//                .append(storePreviousDay)
//                .append(expectedSales)
//                .append(isSelected)
//                .toHashCode();
//    }
//
//    @Override
//    public String toString() {
//        return new ToStringBuilder(this)
//                .append("storeId", storeId)
//                .append("referenceStoreId", referenceStoreId)
//                .append("storePreviousDay", storePreviousDay)
//                .append("expectedSales", expectedSales)
//                .append("isSelected", isSelected)
//                .toString();
//    }
	public void printStore() {
		System.out.println(
				getStoreId() + "-" + getReferenceStoreId() + "-" + getStorePreviousDay() + "-" + getExpectedSales());
	}

	public void setStore(Store store) {
		this.storeId = store.getStoreId();
		this.referenceStoreId = store.referenceStoreId;
		this.storePreviousDay = store.storePreviousDay;
		this.expectedSales = store.expectedSales;
		this.isSelected = store.isSelected;
	}

	public static ArrayList<Store> setListStore(List<Store> selectedStores) {
		ArrayList<Store> result = new ArrayList<Store>();
		for (Store store : selectedStores) {
			Store storeNew = new Store();
			storeNew.setStore(store);
			result.add(storeNew);


		}
		return result;
	}
}
