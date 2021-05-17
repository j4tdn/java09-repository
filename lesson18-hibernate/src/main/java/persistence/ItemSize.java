package persistence;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "kichcomathang")
public class ItemSize {

	@EmbeddedId
	private Id id;

	@Column(name = "Soluong")
	private Integer quantity;

	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("itemId")
	@JoinColumn(name = "MaMH", referencedColumnName = "MaMH")
	private Item item;

	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("sizeId")
	@JoinColumn(name = "KiHieu", referencedColumnName = "KiHieu")
	private Size size;

	public ItemSize() {

	}

	public ItemSize(Id id, Integer quantity, Item item, Size size) {
		this.id = id;
		this.quantity = quantity;
		this.item = item;
		this.size = size;
	}

	public ItemSize(Id id, Integer quantity) {
		this.id = id;
		this.quantity = quantity;
	}

	public Id getId() {
		return id;
	}

	public void setId(Id id) {
		this.id = id;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "ItemSize [id=" + id + ", quantity=" + quantity + "]";
	}

	@Embeddable
	public static class Id implements Serializable {

		private static final long serialVersionUID = -1349169687034878360L;

		@Column(name = "MaMH")
		private Integer itemId;

		@Column(name = "KiHieu")
		private Integer sizeId;

		public Id() {

		}

		public Id(Integer itemId, Integer sizeId) {
			super();
			this.itemId = itemId;
			this.sizeId = sizeId;
		}

		public Integer getItemId() {
			return itemId;
		}

		public void setItemId(Integer itemId) {
			this.itemId = itemId;
		}

		public Integer getSizeId() {
			return sizeId;
		}

		public void setSizeId(Integer sizeId) {
			this.sizeId = sizeId;
		}
	}
}
