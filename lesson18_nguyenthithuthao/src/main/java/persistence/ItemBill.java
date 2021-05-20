package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ChiTietDonHang")
public class ItemBill {

	@Id
	@Column(name = "MaMH")
	private String idBItem;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaMH", referencedColumnName = "MaMH")
	private Item item;

	public ItemBill() {
	}

	
	public String getIdBItem() {
		return idBItem;
	}


	public void setIdBItem(String idBItem) {
		this.idBItem = idBItem;
	}


	public ItemBill(String idBItem, Item item) {
		super();
		this.idBItem = idBItem;
		this.item = item;
	}


	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
}