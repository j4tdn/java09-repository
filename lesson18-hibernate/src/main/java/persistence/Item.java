 package persistence;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "MatHang")
public class Item {
	@Id
	@Column(name = "mamh")
	private Integer temId;
	
	@Column(name = "Tenmh")
	private String itemName;
	
	@Column(name = "mausac")
	private String color;
	
	@Column(name = "chatlieu")
	private String material;
	
	@Column(name = "giaban")
	private Double price;
	
	@Column(name = "giamua")
	private Double buyPrice;
	
	//nameValue: FK_ColumName
		//referencedComlumNameValue: PK_ColumName ParentTable 
	@ManyToOne (fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "maloai",referencedColumnName = "maloai")
	private ItemGroup itemGroup;
	
	@OneToOne(mappedBy = "item",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private ItemDetail itemdetail;
	
	
//	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//	@JoinTable(name = "KichCoMatHang",
//	joinColumns = {
//			@JoinColumn(name="MAMH", referencedColumnName = "MAMH")
//	},
//	inverseJoinColumns  = {
//			@JoinColumn(name="KiHieu",referencedColumnName = "KiHieu")
//	})
//	private List<Size> sizes;
	
	
	public Item() {
		// TODO Auto-generated constructor stub
	}
	public Item(Integer temId, String itemName, String color, String material, Double price, Double buyPrice,
			ItemGroup itemGroup) {
		super();
		this.temId = temId;
		this.itemName = itemName;
		this.color = color;
		this.material = material;
		this.price = price;
		this.buyPrice = buyPrice;
		this.itemGroup = itemGroup;
	}

	public Integer getTemId() {
		return temId;
	}

	public void setTemId(Integer temId) {
		this.temId = temId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getBuyPrice() {
		return buyPrice;
	}

	public void setBuyPrice(Double buyPrice) {
		this.buyPrice = buyPrice;
	}

	public ItemGroup getItemGroup() {
		return itemGroup;
	}

	public void setItemGroup(ItemGroup itemGroup) {
		this.itemGroup = itemGroup;
	}
	public void setItemdetail(ItemDetail itemdetail) {
		this.itemdetail = itemdetail;
	}
	public ItemDetail getItemdetail() {
		return itemdetail;
	}
//	public List<Size> getSizes() {
//		return sizes;
//	}
//	public void setSizes(List<Size> sizes) {
//		this.sizes = sizes;
//	}
	
	
	@Override
	public String toString() {
		return "Item [temId=" + temId + ", itemName=" + itemName + ", color=" + color + ", material=" + material
				+ ", price=" + price + ", buyPrice=" + buyPrice + ", itemGroup=" + itemGroup + "]";
	}

}
