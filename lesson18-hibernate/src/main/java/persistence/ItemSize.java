package persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "kichcomathang")
public class ItemSize {

	
	
	@EmbeddedId
	private Id id;

//	@ManyToOne
//	@JoinColumn(name="", referencedColumnName = "")
//	private Item item;
//	
	
	@Column(name="Soluong")
	private Integer quantity;
	
	@Embeddable
	public static class Id implements Serializable {
		
		
		
		private static final long serialVersionUID = -9147374446464218282L;

		@Column(name = "MaMH")
		private Integer itemId;

		@Column(name = "KiHieu")
		private Integer sizeId;

		public Id() {
			// TODO Auto-generated constructor stub
		}
		public void setItemId(Integer itemId) {
			this.itemId = itemId;
		}
		public Integer getItemId() {
			return itemId;
		}
		public void setSizeId(Integer sizeId) {
			this.sizeId = sizeId;
		}
		public Integer getSizeId() {
			return sizeId;
		}
		@Override
		public String toString() {
			return "Id [itemId=" + itemId + ", sizeId=" + sizeId + "]";
		}
		
	}

}
