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

import org.hibernate.engine.jdbc.Size;

@Entity
@Table(name = "MatHang")
public class Item {
	@Id
	@Column(name = "MaMH")
	private Integer itemId;

	@Column(name = "TenMH")
	private String itemName;

	@Column(name = "MauSac")
	private String color;

	@Column(name = "ChatLieu")
	private String material;

	@Column(name = "GiaBan")
	private Double salePrice;

	@Column(name = "GiaMua")
	private Double byPrice;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "MaLoai")
	private ItemGroup itemGroup;

	@OneToOne(mappedBy = "item")
	private ItemDetail itemDetail;

	@ManyToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name="mathang_has_kichco",
		joinColumns= {
				@JoinColumn(name="MaMH",referencedColumnName = "MaMH_NN")
				},
		inverseJoinColumns= {
				@JoinColumn(name="KiHieu_NN",referencedColumnName = "KiHieu")
				})
		
	private List<Size> sizes;
	
	

	public Item() {
	}

	public Item(Integer itemId, String itemName, String color, String material, Double salePrice, Double byPrice,
			String image, ItemGroup itemGroup) {
		this.itemId = itemId;
		this.itemName = itemName;
		this.color = color;
		this.material = material;
		this.salePrice = salePrice;
		this.byPrice = byPrice;
		this.itemGroup = itemGroup;
	}
	public List<Size> getSizes() {
		return sizes;
	}
	public void setSizes(List<Size> sizes) {
		this.sizes = sizes;
	}
	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
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

	public Double getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(Double salePrice) {
		this.salePrice = salePrice;
	}

	public Double getByPrice() {
		return byPrice;
	}

	public void setByPrice(Double byPrice) {
		this.byPrice = byPrice;
	}

	public ItemGroup getItemGroup() {
		return itemGroup;
	}

	public void setItemGroup(ItemGroup itemGroup) {
		this.itemGroup = itemGroup;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", color=" + color + ", material=" + material
				+ ", salePrice=" + salePrice + ", byPrice=" + byPrice + ", itemGroup=" + itemGroup + "]";
	}

}
