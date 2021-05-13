package persitence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name="KichCoMatHang")
public class ItemSize {
 
	
	@EmbeddedId
	private Id id;
	
	@Column(name="SoLuong")
	private Integer quantity;
	
	public ItemSize() {
		// TODO Auto-generated constructor stub
	}
	
	public ItemSize(Id id, Integer quantity) {
		super();
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

	
	public static class Id implements Serializable{
		private static final long serialVersionUID=8;
		
		@Column(name ="MaMH")
		private Integer itemId;
		
		@Column(name ="KiHieu")
		private Integer sizeId;
		
		public Id() {
			// TODO Auto-generated constructor stub
		}

		public Id(Integer itemId, Integer sizeId) {
			super();
			this.itemId = itemId;
			this.sizeId = sizeId;
		}
		
	}
	
}
