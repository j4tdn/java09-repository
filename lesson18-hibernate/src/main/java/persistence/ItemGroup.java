package persistence;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="LoaiHang")

@NamedQueries({
		@NamedQuery(name=ItemGroup.SELECT_ALL_HQL,
				query="from ItemGroup")
})

@NamedNativeQueries({
	@NamedNativeQuery(name=ItemGroup.SELECT_ALL_NATIVE,
			query="select * from loaihang",
			resultClass = ItemGroup.class)
})
public class ItemGroup {
	
	public static final String SELECT_ALL_NATIVE="SELECT_ALL_NATIVE";
	public static final String SELECT_ALL_HQL="SELECT_ALL";
	
	@Id
	@Column(name="MaLoai")
	private Integer itemGroupId;
	
	@Column(name="TenLoai")
	private String itemGroupName;
	
	@OneToMany(mappedBy = "itemGroup",fetch =FetchType.LAZY)
	private List<Items> items;
	
	
	//JPA default constructor
	public ItemGroup() {
		// TODO Auto-generated constructor stub
	}
	public List<Items> getItems() {
		return items;
	}
	public void setItems(List<Items> items) {
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
		// TODO Auto-generated method stub
		return this.itemGroupId+"   "+this.itemGroupName;
	}
	
	
}
