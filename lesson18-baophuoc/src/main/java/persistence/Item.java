package persistence;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "MatHang")
public class Item {
	@Id
	@Column(name="MaMH")
	private Integer ItId;
	
	@Column(name="TenMH")
	private String ItName;
	
	@Column(name="MauSac")
	private String color;
	
	@Column(name="ChatLieu")
	private String material;
	
	@Column(name="GiaBan")
	private Double SalePrice;
	
	@Column(name="GiaMua")
	private Double BuyPrice;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="MaLoai",referencedColumnName = "MaLoai")
	private ItemGroup itemGroup;
	
	
	public Item() {
	}

	public Item(Integer itId, String itName, String color, String material, Double salePrice, Double buyPrice,
			ItemGroup itemGroup) {
		super();
		this.ItId = itId;
		this.ItName = itName;
		this.color = color;
		this.material = material;
		this.SalePrice = salePrice;
		this.BuyPrice = buyPrice;
		this.itemGroup = itemGroup;
	}

	public Integer getItId() {
		return ItId;
	}

	public void setItId(Integer itId) {
		ItId = itId;
	}

	public String getItName() {
		return ItName;
	}

	public void setItName(String itName) {
		ItName = itName;
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
		return SalePrice;
	}

	public void setSalePrice(Double salePrice) {
		SalePrice = salePrice;
	}

	public Double getBuyPrice() {
		return BuyPrice;
	}

	public void setBuyPrice(Double buyPrice) {
		BuyPrice = buyPrice;
	}

	public ItemGroup getItemGroup() {
		return itemGroup;
	}

	public void setItemGroup(ItemGroup itemGroup) {
		this.itemGroup = itemGroup;
	}
	
	@Override
	public String toString() {
		return "Item [ItId=" + ItId + ", ItName=" + ItName + ", color=" + color + ", material=" + material
				+ ", SalePrice=" + SalePrice + ", BuyPrice=" + BuyPrice + ", itemGroup=" + itemGroup + "]";
	}
}
	