package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="MatHang")
public class Item {
	@Id
	@Column(name="MaMH")
	private Integer itId;
	@Column(name="TenMH")
	private String itName;
	@Column(name="MauSac")
	private String Color;
	@Column(name="ChatLieu")
	private String material;
	@Column(name="GiaBan")
	private Double sale;
	@Column(name="GiaMua")
	private Double price;
	
	// nameValue: FK_ColumName
	//referencedColumnNameValue: PK_ColumnName ParentTable
	@ManyToOne  
	
	@JoinColumn(name="Maloai", referencedColumnName = "Maloai")
	private ItemGroup itemGroup;
	
	public Item() {
		
	}

	public Item(Integer itId, String itName, String color, String material, Double sale, Double price,
			ItemGroup itemGroup) {
		this.itId = itId;
		this.itName = itName;
		Color = color;
		this.material = material;
		this.sale = sale;
		this.price = price;
		this.itemGroup = itemGroup;
	}

	public Integer getItId() {
		return itId;
	}

	public void setItId(Integer itId) {
		this.itId = itId;
	}

	public String getItName() {
		return itName;
	}

	public void setItName(String itName) {
		this.itName = itName;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public Double getSale() {
		return sale;
	}

	public void setSale(Double sale) {
		this.sale = sale;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public ItemGroup getItemGroup() {
		return itemGroup;
	}

	public void setItemGroup(ItemGroup itemGroup) {
		this.itemGroup = itemGroup;
	}

	@Override
	public String toString() {
		return "Item [itId=" + itId + ", itName=" + itName + ", Color=" + Color + ", material=" + material + ", sale="
				+ sale + ", price=" + price + ", itemGroup=" + itemGroup + "]";
	}
	
	
	
}
