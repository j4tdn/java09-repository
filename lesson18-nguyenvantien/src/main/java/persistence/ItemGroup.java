package persistence;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
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

	@OneToMany(mappedBy = "itemGroup", fetch = FetchType.LAZY )
	private List<Item> items;

	// JPA default constructor
	public ItemGroup() {
	}

	public ItemGroup(Integer igId, String igName) {
		super();
		this.igId = igId;
		this.igName = igName;
	}

	public Integer getIgId() {
		return igId;
	}

	public void setIgId(Integer igId) {
		this.igId = igId;
	}

	public String getIgName() {
		return igName;
	}

	public void setIgName(String igName) {
		this.igName = igName;
	}
	
	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	public List<Item> getItems() {
		return items;
	}

	@Override
	public String toString() {
		return "ItemGroup [igId=" + igId + ", igName=" + igName + ", items=" + items + "]";
	}

}
