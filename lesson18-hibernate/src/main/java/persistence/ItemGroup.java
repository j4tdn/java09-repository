package persistence;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "LoaiHang")

@NamedQueries({
	@NamedQuery(name=ItemGroup.SELECT_ALL_HQL,
				query="from ItemGroup")
})
@NamedNativeQueries({
	@NamedNativeQuery(name=ItemGroup.SELECT_ALL_NATIVE,
				query="select * from LoaiHang",
				resultClass = ItemGroup.class)
})
public class ItemGroup {
	
	public static final String SELECT_ALL_NATIVE="SELECT_ALL_NATIVE";
	public static final String SELECT_ALL_HQL="SELECT_ALL_HQL";

	@Id
	@Column(name = "MaLoai")
	private Integer igId;

	@Column(name = "TenLoai")
	private String igName;

	@OneToMany(mappedBy = "itemGroup", fetch = FetchType.LAZY)
	private List<Item> item;

	// JPA default
	public ItemGroup() {
	}

	public ItemGroup(Integer igId, String igName) {
		this.igId = igId;
		this.igName = igName;
	}

	public Integer getIgId() {
		return igId;
	}

	public String getIgName() {
		return igName;
	}

	public void setIgId(Integer igId) {
		this.igId = igId;
	}

	public void setIgName(String igName) {
		this.igName = igName;
	}

	public List<Item> getItem() {
		return item;
	}

	public void setItem(List<Item> item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "ItemGroup [igId=" + igId + ", igName=" + igName + ", item=" + item + "]";
	}

	

}
