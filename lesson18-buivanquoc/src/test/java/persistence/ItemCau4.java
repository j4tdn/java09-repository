package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "mathang")
public class ItemCau4 {
	@Id
	@Column(name = "MaMH")
	private Integer itemId;

	@Column(name = "TenMH")
	private String itemName;

	@Column(name = "GiaBan")
	private Double salePrice;

	@Column(name = "GiaMua")
	private Double buyPrice;
	@Column(name = "SoLuong")
	private Double Total;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaLoai", referencedColumnName = "MaLoai")
	private ItemGroupCau4 itemGroup;
	public Double getTotal() {
		return Total;
	
	}

	public ItemCau4() {
		// TODO Auto-generated constructor stub
	}

	public ItemCau4(Integer itemId, String itemName, Double salePrice, Double buyPrice, Double total,
			ItemGroupCau4 itemGroup) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.salePrice = salePrice;
		this.buyPrice = buyPrice;
		Total = total;
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

	public void setTotal(Double total) {
		Total = total;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", salePrice=" + salePrice + ", buyPrice="
				+ buyPrice + ", itemGroup=" + itemGroup + "]";
	}

}
