package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Entity
@Table(name = "MatHang")
public class Item {
	
	@Id
	@Column(name = "MaMH")
	private Integer id;

	@Column(name = "TenMH")
	private String name;

	@Column(name = "MauSac")
	private String color;

	@Column(name = "ChatLieu")
	private String material;

	@Column(name = "GiaMua")
	private Double saleIn;

	@Column(name = "GiaBan")
	private Double saleOut;

	@Column(name = "HinhAnh")
	private String picture;

	@ManyToOne
	@JoinColumn(name = "MaLoai", referencedColumnName = "MaLoai")
	private ItemGroup itemGroup;
	
	@OneToOne(mappedBy = "item", fetch = FetchType.LAZY)
	private ItemDetail itemDetail;
	
	public Item() {
	}
	
	public Item(Integer id, String name, String color, String material, Double saleIn, Double saleOut, String picture,
			ItemGroup itemGroup) {
		this.id = id;
		this.name = name;
		this.color = color;
		this.material = material;
		this.saleIn = saleIn;
		this.saleOut = saleOut;
		this.picture = picture;
		this.itemGroup = itemGroup;
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

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public ItemGroup getItemGroup() {
		return itemGroup;
	}

	public void setItemGroup(ItemGroup itemGroup) {
		this.itemGroup = itemGroup;
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

	public Double getSaleIn() {
		return saleIn;
	}

	public void setSaleIn(Double saleIn) {
		this.saleIn = saleIn;
	}

	public Double getSaleOut() {
		return saleOut;
	}

	public void setSaleOut(Double saleOut) {
		this.saleOut = saleOut;
	}
	
	public ItemDetail getItemDetail() {
		return itemDetail;
	}
	
	public void setItemDetail(ItemDetail itemDetail) {
		this.itemDetail = itemDetail;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", color=" + color + ", material=" + material + ", saleIn="
				+ saleIn + ", saleOut=" + saleOut + ", picture=" + picture + ", itemGroup=" + itemGroup;
	}
	
	
}
