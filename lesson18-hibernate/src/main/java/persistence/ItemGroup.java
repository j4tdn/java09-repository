package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LoaiHang")
public class ItemGroup {
	
	@Id
	@Column(name = "MaLoai")
	private Integer igId;
	
	@Column(name = "TenLoai")
	private String igName;
	
	// JPA default constructor
	public ItemGroup() {
		
	}

	public ItemGroup(Integer igId, String igName) {
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
	 
	@Override
	public String toString() {
		return "ItemGroup [igId=" + igId + ", igName=" + igName +"]";
	}
}
