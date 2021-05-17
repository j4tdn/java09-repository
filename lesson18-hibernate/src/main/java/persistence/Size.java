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
	@Column(name = "MoTa")
	private String description;
	
//	@ManyToMany(mappedBy = "sizes")
//	private List<Item> items;
	
	public Size() {
		// TODO Auto-generated constructor stub
	}

	public Size(Integer id, String description) {
		super();
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
//	public List<Item> getItems() {
//		return items;
//	}
//	public void setItems(List<Item> items) {
//		this.items = items;
//	}
	@Override
	public String toString() {
		return "Size [id=" + id + ", description=" + description + "]";
	}
	
}
