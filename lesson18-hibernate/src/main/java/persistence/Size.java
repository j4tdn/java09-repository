package persistence;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="KichCo")
public class Size {
	
	@Id
	@Column(name="KiHieu")
	private Integer id;
	
	@Column(name="MoTa")
	private String decription;

	@ManyToMany(mappedBy = "sizes")
	private List<Item> items;
	
	
	public Size() {
	}
	
	public String getDecription() {
		return decription;
	}
	public Integer getId() {
		return id;
	}
	public void setDecription(String decription) {
		this.decription = decription;
	} 
	public void setId(Integer id) {
		this.id = id;
	}
	 public void setItems(List<Item> items) {
		this.items = items;
	}
	 public List<Item> getItems() {
		return items;
	}
	@Override
	public String toString() {
		return "Style [id=" + id + ", decription=" + decription + "]";
	}
	
}
