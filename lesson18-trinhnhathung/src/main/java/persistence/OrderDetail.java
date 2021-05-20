package persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "chitietdonhang")
public class OrderDetail {
	
	@EmbeddedId
	private Id id;
	
	@Column(name = "SoLuong")
	private Integer quantity;

	@Embeddable
	public static class Id implements Serializable {
		private static final long serialVersionUID = -6157463849566017983L;

		@Column(name = "MaMH")
		private Integer itemId;

		@Column(name = "MaDH")
		private Integer orderId;

		public Id() {

		}

		public Id(Integer itemId, Integer orderId) {
			super();
			this.itemId = itemId;
			this.orderId = orderId;
		}

		public Integer getItemId() {
			return itemId;
		}

		public void setItemId(Integer itemId) {
			this.itemId = itemId;
		}

		public Integer getOrderId() {
			return orderId;
		}

		public void setOrderId(Integer orderId) {
			this.orderId = orderId;
		}

	}
}
