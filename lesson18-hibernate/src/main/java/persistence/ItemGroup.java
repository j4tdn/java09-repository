package persistence;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "loaihang")
@NamedQueries ({
	@NamedQuery (name =ItemGroup.SELECT_ALL_HQL,
			query = "FROM ItemGroup")
})

@NamedNativeQueries ({
	@NamedNativeQuery (name = ItemGroup.SELECT_ALL_NATIVE,
			query = "SELECT * FROM LoaiHang", 
			resultClass = ItemGroup.class)
})
public class ItemGroup {
	public static final String SELECT_ALL_NATIVE = "SELECT_ALL_NATIVE";
	public static final String SELECT_ALL_HQL = "SELECT_ALL_HQL";
	@Id
	@Column(name = "MaLoai")
	private Integer id;

	@Column(name = "TenLoai")
	private String name;

	@OneToMany(mappedBy = "itemGroup", fetch = FetchType.LAZY)
	private List<Item> items;

	// JPA default constructor
	public ItemGroup() {

	}

	public ItemGroup(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "ItemGroup [id=" + id + ", name=" + name + "]";
	}

}
