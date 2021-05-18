package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "chitietmathang")

public class ItemDetail {
	
	@Id
	@Column(name = "mactmh")
	private Integer id;
	@Column(name = "nhasanxuat")
	private String fName;
	@Column(name = "thongtin")
	private String info;
	
	public Items getItem() {
		return item;
	}
	public void setItem(Items item) {
		this.item = item;
	}
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "mamh",referencedColumnName = "mamh")
	private Items item;
	@Override
	public String toString() {
		return "ItemDetail [id=" + id + ", fName=" + fName + ", info=" + info + "]";
	}
	public ItemDetail(Integer id, String fName, String info) {
		super();
		this.id = id;
		this.fName = fName;
		this.info = info;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
	public ItemDetail() {}
	
	
}
