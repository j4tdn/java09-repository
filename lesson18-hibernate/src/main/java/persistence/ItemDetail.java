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
	@Column(name = "MACTMH")	
	private Integer id;
	@Column(name = "nhasanxuat")
	private String fName;
	@Column(name = "thongtin")
	private String info;
	
	@OneToOne (fetch = FetchType.LAZY)
	@JoinColumn(name = "mamh", referencedColumnName = "mamh")		
	private Item item;
	
	public ItemDetail() {
		// TODO Auto-generated constructor stub
	}
	

	public ItemDetail(Integer id, String fName, String info, Item item) {
		super();
		this.id = id;
		this.fName = fName;
		this.info = info;
		this.item = item;
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
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}


	@Override
	public String toString() {
		return "ItemDetail [id=" + id + ", fName=" + fName + ", info=" + info + ", item=" + item + "]";
	}
	
}
