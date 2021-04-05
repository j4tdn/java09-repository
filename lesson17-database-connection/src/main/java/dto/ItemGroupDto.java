package dto;

import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class ItemGroupDto {
	private Integer igrId;
	private String igrName;
	private List<ItemAmount> itemAmounts;
	private Integer totalOfItems;
	
	public ItemGroupDto() {
	}

	public ItemGroupDto(Integer igrId, String igrName, List<ItemAmount> itemAmounts, Integer totalOfItems) {
		this.igrId = igrId;
		this.igrName = igrName;
		this.itemAmounts = itemAmounts;
		this.totalOfItems = totalOfItems;
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

	public List<ItemAmount> getItemAmounts() {
		return itemAmounts;
	}

	public void setItemAmounts(List<ItemAmount> itemAmounts) {
		this.itemAmounts = itemAmounts;
	}

	public Integer getTotalOfItems() {
		return totalOfItems;
	}

	public void setTotalOfItems(Integer totalOfItems) {
		this.totalOfItems = totalOfItems;
	}
	
	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.SIMPLE_STYLE)
				.append(igrId)
				.append(igrName)
				.append(itemAmounts)
				.append(totalOfItems)
				.build();
	}
}
