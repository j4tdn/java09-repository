package persistence;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "mathang")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
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
	private Double buyPrice;

	// nameValue : FK_ColumnName sub table
	// referencedName = PK_ColumnName parent table
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaLoai", referencedColumnName = "MaLoai")
	private ItemGroup itemGroup;

	@OneToOne(mappedBy = "item", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private ItemDetail itemDetail;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "item" , cascade = CascadeType.ALL)
	private List<ItemSize> itemSizes;

	public Item() {

	}
	
	public Item(Integer id) {
		this.itemId = id;
	}
	
	public Item(Integer itemId, String itemName, String color, String material, Double salePrice, Double buyPrice,
			ItemGroup itemGroup) {
		this.itemId = itemId;
		this.itemName = itemName;
		this.color = color;
		this.material = material;
		this.salePrice = salePrice;
		this.buyPrice = buyPrice;
		this.itemGroup = itemGroup;
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

	public ItemDetail getItemDetail() {
		return itemDetail;
	}

	public void setItemDetail(ItemDetail itemDetail) {
		this.itemDetail = itemDetail;
	}

	public List<ItemSize> getItemSizes() {
		return itemSizes;
	}

	public void setItemSizes(List<ItemSize> itemSizes) {
		this.itemSizes = itemSizes;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", color=" + color + ", material=" + material
				+ ", salePrice=" + salePrice + ", buyPrice=" + buyPrice + ", itemGroup=" + itemGroup + "]";
	}

}
