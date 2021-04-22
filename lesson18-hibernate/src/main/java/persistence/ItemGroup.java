package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LoaiHang")
public class ItemGroup {
	
	@Id
	@Column(name="MaLoai")
	private Integer itemGroupId;
	
	@Column(name="TenLoai")
	private String itemGroupName;
	//JPA default constructor
	public ItemGroup() {
		// TODO Auto-generated constructor stub
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
		// TODO Auto-generated method stub
		return this.itemGroupId+"   "+this.itemGroupName;
	}
	
	
}
