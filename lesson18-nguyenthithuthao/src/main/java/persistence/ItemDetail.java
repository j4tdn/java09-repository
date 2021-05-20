package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DonHang")
public class ItemDetail {

	@Id
	@Column(name = "MaDh")
	private Integer id;

	@Column(name = "NgayTao")
	private String date;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaMH", referencedColumnName = "MaMH")
	private Item item;

	public ItemDetail() {
	}

	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public ItemDetail(Integer id, String date, Item item) {
		super();
		this.id = id;
		this.date = date;
		this.item = item;
	}


	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
}