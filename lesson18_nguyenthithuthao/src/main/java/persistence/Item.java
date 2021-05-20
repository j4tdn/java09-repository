package persistence;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "MatHang")

@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Item {
	@Id
	@Column(name = "MaMH")
	public static Integer itemId;
	@Column(name = "TenMH")
	private String itemName;
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "MaLoai", referencedColumnName = "MaLoai")
	private ItemBill itemBill;

	//@OneToOne(mappedBy = "item")
	@OneToOne(mappedBy = "item", fetch = FetchType.LAZY)
	private ItemDetail itemDetail;

	public Item() {
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

	public ItemBill getItemBill() {
		return itemBill;
	}

	public void setItemBill(ItemBill itemBill) {
		this.itemBill = itemBill;
	}

	public ItemDetail getItemDetail() {
		return itemDetail;
	}

	public void setItemDetail(ItemDetail itemDetail) {
		this.itemDetail = itemDetail;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", itemBill=" + itemBill + ", itemDetail="
				+ itemDetail + "]";
	}
	
	

}