package persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "kichcomathang")
public class ItemSize {
	


	@Column(name = "MaMH")
	private Integer itemId;

	@Column(name = "KiHieu")
	private Integer sizeId;
	
	
	@Column(name="Soluong")
	private Integer quantity;
	
	
	
	
	public Integer getItemId() {
		return itemId;
	}
	public void setSizeId(Integer sizeId) {
		this.sizeId = sizeId;
	}
	public Integer getSizeId() {
		return sizeId;
	}
	
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "ItemSize [itemId=" + itemId + ", sizeId=" + sizeId + ", quantity=" + quantity + "]";
	}
	
	
	

}
