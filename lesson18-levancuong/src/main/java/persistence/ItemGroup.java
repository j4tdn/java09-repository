package persistence;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "loaihang")
public class ItemGroup {
	@Id
	@Column(name="MaLoai")
	private Integer itemGroupId;
	
	@Column(name="TenLoai")
	private String itemGroupName;
	
	@OneToMany(mappedBy = "itemGroup",fetch =FetchType.LAZY)
	private List<Item> items;

	
	public ItemGroup() {
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public ItemGroup(Integer itemGroupId, String itemGroupName) {
		super();
		this.itemGroupId = itemGroupId;
		this.itemGroupName = itemGroupName;
	}
	public Integer getItemGroupId() {
		return itemGroupId;
	}
	public void setItemGroupId(Integer itemGroupId) {
		this.itemGroupId = itemGroupId;
	}
	public String getItemGroupName() {
		return itemGroupName;
	}
	public void setItemGroupName(String itemGroupName) {
		this.itemGroupName = itemGroupName;
	}
	@Override
	public String toString() {
		return "ItemGroup [itemGroupId=" + itemGroupId + ", itemGroupName=" + itemGroupName + ", items=" + items + "]";
	}
	
	

}
