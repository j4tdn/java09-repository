package persistence;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "KichCo")
public class Size {
	@Id
	@Column(name = "KiHieu")
	private Integer id;
	
	@Column(name = "Mota")
	private String description;
	
//	@ManyToMany(mappedBy = "sizes")
//	private List<Item> items;
	
	public Size() {
	}

	public Size(Integer id, String description) {
		this.id = id;
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
//	public void setItems(List<Item> items) {
//		this.items = items;
//	}
//	
//	public List<Item> getItems() {
//		return items;
//	}
	
	@Override
	public String toString() {
		return "Size [id=" + id + ", description=" + description + "]";
	}
	
	
	
	
}
