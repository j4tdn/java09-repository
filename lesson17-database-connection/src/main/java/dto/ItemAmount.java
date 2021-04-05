package dto;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class ItemAmount {
	private String itemName;
	private Integer amount;
	
	public ItemAmount() {
	}

	public ItemAmount(String itemName, Integer amount) {
		this.itemName = itemName;
		this.amount = amount;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.SIMPLE_STYLE)
				.append(itemName)
				.append(amount)
				.build();
	}
	
}
