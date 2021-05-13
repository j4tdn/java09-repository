package persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="kichcomathang")
public class ItemSize {
	@EmbeddedId
	private Id id;
	
	
	
	@Embeddable
	public static class Id implements Serializable{
		private static final long serialVersionUID = 0;
		
		@Column(name="MaMH")
		private Integer itemId;
		
		@Column(name="KiHieu")
		private Integer sizeId;
		public Id() {
			
		}
	}
	
}
