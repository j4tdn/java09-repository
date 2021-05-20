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


public class ItemGroup {
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
