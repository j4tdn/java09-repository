package persistence;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "mathang")
public class Item {
	@Id
	@Column(name="MaMH")
	private Integer itemId;
	@Column(name="TenMH")
	private String name;
	@Column(name="MauSac")
	private String color;
	@Column(name="ChatLieu")
	private String material;
	@Column(name="GiaBan")
	private Double sellPrice;
	@Column(name="GiaMua")
	private Double buyPrice;
	@Column(name="HinhAnh")
	private String photo;
	
	@ManyToOne(fetch = FetchType.LAZY)		
	@JoinColumn(name="MaLoai",referencedColumnName = "MaLoai")
	private ItemGroup itemGroup;
	
	
	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	

	public Item() {
		
	}

	public Item(Integer itemId, String name, String color, String material, Double sellPrice, Double buyPrice
			) {
		super();
		this.itemId = itemId;
		this.name = name;
		this.color = color;
		this.material = material;
		this.sellPrice = sellPrice;
		this.buyPrice = buyPrice;

	}





	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public Double getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(Double sellPrice) {
		this.sellPrice = sellPrice;
	}

	public Double getBuyPrice() {
		return buyPrice;
	}

	public void setBuyPrice(Double buyPrice) {
		this.buyPrice = buyPrice;
	}

	

	@Override
	public String toString() {
		return "Items [itemId=" + itemId + ", name=" + name + ", color=" + color + ", material=" + material
				+ ", sellPrice=" + sellPrice + ", buyPrice=" + buyPrice + ", photo=" + photo +  "]";
	}


}
