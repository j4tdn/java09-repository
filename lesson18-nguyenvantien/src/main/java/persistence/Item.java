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
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "MatHang")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Item {
	@Id
	@Column(name = "MaMH")
	private Integer itemId;
	
	@Column(name = "TenMH")
	private String itemName;
	
	@Column(name = "GiaBan")
	private Double salePrice;
	
	@Column(name = "GiaMua")
	private Double buyPrice;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "MaLoai", referencedColumnName = "MaLoai")
	private ItemGroup itemGroup;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "kichcomathang",
	joinColumns = {
			@JoinColumn(name = "MaMH", referencedColumnName = "MaMH")
	},
	inverseJoinColumns = {
			@JoinColumn(name = "KiHieu", referencedColumnName = "KiHieu")
	})
	private List<Size> sizes;
	
	public Item() {
	}

	public Item(Integer itemId, String itemName, String color, String material, Double salePrice, Double buyPrice,
			ItemGroup itemGroup) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
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

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", salePrice=" + salePrice + ", buyPrice=" + buyPrice +"]";
	}
	
}
